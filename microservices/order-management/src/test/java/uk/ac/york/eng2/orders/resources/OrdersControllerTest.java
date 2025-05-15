package uk.ac.york.eng2.orders.resources;

import io.micronaut.http.HttpHeaders;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.test.annotation.MockBean;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import uk.ac.york.eng2.orders.domain.Customer;
import uk.ac.york.eng2.orders.domain.Orders;
import uk.ac.york.eng2.orders.dto.OrdersCreateDTO;
import uk.ac.york.eng2.orders.gateways.OrderPriceResponse;
import uk.ac.york.eng2.orders.gateways.PMProductPricingGateway;
import uk.ac.york.eng2.orders.repository.CustomerRepository;
import uk.ac.york.eng2.orders.repository.OrderItemRepository;
import uk.ac.york.eng2.orders.repository.OrdersRepository;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@MicronautTest(transactional = false)
public class OrdersControllerTest {

    @Inject
    OrdersClient ordersClient;

    @Inject
    OrdersRepository ordersRepository;

    @Inject
    OrderItemRepository orderItemRepository;

    @Inject
    CustomerRepository customerRepository;

    private Customer savedCustomer;
    private HashMap<Long, Integer> savedOrderItems;

    @BeforeEach
    void setup() {
        orderItemRepository.deleteAll();
        ordersRepository.deleteAll();
        customerRepository.deleteAll();

        Customer customer = new Customer();
        customer.setEmail("JohnDoe@gmail.com");
        customer.setFirstName("John");
        customer.setFamilyName("Doe");
        savedCustomer = customerRepository.save(customer);

        savedOrderItems = new HashMap<>();
        savedOrderItems.put(1L, 1);
        savedOrderItems.put(2L, 2);
    }


    @Test
    public void noOrders() {
        assertEquals(0, ordersClient.getOrders().size());
    }

    @Test
    public void createThenList() {
        OrdersCreateDTO dto = new OrdersCreateDTO();
        dto.setAddress("123 High Street");
        dto.setDelivered(false);
        dto.setPaid(false);
        dto.setCustomerId(savedCustomer.getId());
        dto.setOrderItems(savedOrderItems);

        long id = createOrders(dto);

        assertEquals(1, ordersClient.getOrders().size());
        assertEquals(id, ordersClient.getOrders().get(0).getId());
        assertEquals("123 High Street", ordersClient.getOrders().get(0).getAddress());
        assertFalse(ordersClient.getOrders().get(0).isDelivered());
        assertFalse(ordersClient.getOrders().get(0).isPaid());
        assertEquals(new BigDecimal("25.00"), ordersClient.getOrders().get(0).getTotalAmount());
    }

    @Test
    public void createThenFetch() {
        OrdersCreateDTO dto = new OrdersCreateDTO();
        dto.setAddress("123 High Street");
        dto.setDelivered(false);
        dto.setPaid(false);
        dto.setCustomerId(savedCustomer.getId());
        dto.setOrderItems(savedOrderItems);

        long id = createOrders(dto);

        Orders orders = ordersClient.getOrders(id);
        assertEquals(id, orders.getId());
        assertEquals("123 High Street", orders.getAddress());
        assertFalse(orders.isDelivered());
        assertFalse(orders.isPaid());
        assertEquals(new BigDecimal("25.00"), orders.getTotalAmount());
    }

    @Test
    public void fetchMissing() {
        assertNull(ordersClient.getOrders(9999));
    }

    @Test
    public void updateOrders() {
        OrdersCreateDTO dto = new OrdersCreateDTO();
        dto.setAddress("1 Low Alley");
        dto.setDelivered(true);
        dto.setPaid(true);
        dto.setCustomerId(savedCustomer.getId());
        dto.setOrderItems(savedOrderItems);
        long id = createOrders(dto);

        dto.setAddress("123 High Street");
        dto.setDelivered(false);
        dto.setPaid(false);
        dto.setCustomerId(savedCustomer.getId());
        dto.setOrderItems(savedOrderItems);
        ordersClient.updateOrders(dto, id);

        Orders orders = ordersClient.getOrders(id);
        assertEquals(id, orders.getId());
        assertEquals("123 High Street", orders.getAddress());
        assertFalse(orders.isDelivered());
        assertFalse(orders.isPaid());
        assertEquals(new BigDecimal("25.00"), orders.getTotalAmount());
    }

    @Test
    public void createThenDelete() {
        OrdersCreateDTO dto = new OrdersCreateDTO();
        dto.setAddress("123 High Street");
        dto.setDelivered(false);
        dto.setPaid(false);
        dto.setCustomerId(savedCustomer.getId());
        dto.setOrderItems(savedOrderItems);

        long id = createOrders(dto);

        ordersClient.deleteOrders(id);

        assertEquals(0, ordersClient.getOrders().size());
    }

    @Test
    public void updateMissing() {
        OrdersCreateDTO dto = new OrdersCreateDTO();
        dto.setAddress("123 High Street");
        dto.setDelivered(false);
        dto.setPaid(false);
        dto.setCustomerId(savedCustomer.getId());
        dto.setOrderItems(savedOrderItems);

        HttpResponse response = ordersClient.updateOrders(dto, 9999);
        assertEquals(HttpStatus.NOT_FOUND, response.getStatus());
    }

    @Test
    public void deleteMissing() {
        HttpResponse response = ordersClient.deleteOrders(9999);
        assertEquals(HttpStatus.NOT_FOUND, response.getStatus());
    }


    private long createOrders(OrdersCreateDTO dto) {
        HttpResponse<Void> response = ordersClient.createOrders(dto);
        assertEquals(HttpStatus.CREATED, response.getStatus());
        return Long.parseLong(response.header(HttpHeaders.LOCATION).split("/")[2]);
    }


    @MockBean(PMProductPricingGateway.class)
    PMProductPricingGateway mockPricingGateway() {
        PMProductPricingGateway mock = mock(PMProductPricingGateway.class);

        Map<Long, BigDecimal> unitPrices = Map.of(
                1L, new BigDecimal("5.00"),
                2L, new BigDecimal("10.00")
        );

        when(mock.getOrderPrice(any())).thenAnswer(invocation -> {
            Map<Long, Integer> orderItems = invocation.getArgument(0);
            Map<Long, BigDecimal> linePrices = new HashMap<>();
            BigDecimal total = BigDecimal.ZERO;

            for (Map.Entry<Long, Integer> entry : orderItems.entrySet()) {
                BigDecimal unit = unitPrices.getOrDefault(entry.getKey(), BigDecimal.ZERO);
                BigDecimal line = unit.multiply(BigDecimal.valueOf(entry.getValue()));
                linePrices.put(entry.getKey(), line);
                total = total.add(line);
            }

            return Optional.of(new OrderPriceResponse(linePrices, total));
        });

        return mock;
    }
}
