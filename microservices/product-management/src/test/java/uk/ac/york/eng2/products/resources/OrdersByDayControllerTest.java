package uk.ac.york.eng2.products.resources;

import io.micronaut.http.HttpHeaders;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import uk.ac.york.eng2.products.domain.OrdersByDay;
import uk.ac.york.eng2.products.domain.Product;
import uk.ac.york.eng2.products.dto.OrdersByDayCreateDTO;
import uk.ac.york.eng2.products.repository.OrdersByDayRepository;
import uk.ac.york.eng2.products.repository.ProductRepository;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

@MicronautTest(transactional = false)
public class OrdersByDayControllerTest {
    @Inject
    private OrdersByDayClient ordersByDayClient;

    @Inject
    private ProductRepository productRepository;

    @Inject
    OrdersByDayRepository ordersByDayRepository;

    private Product savedProduct;

    @BeforeEach
    void setup() {
        ordersByDayRepository.deleteAll();
        productRepository.deleteAll();

        // Create a dummy product to attach orders to
        Product product = new Product();
        product.setName("Jaffa Cake");
        product.setUnitPrice(new java.math.BigDecimal("9.99"));
        savedProduct = productRepository.save(product);
    }


    @Test
    public void noOrdersByDay() {
        assertEquals(0, ordersByDayClient.getOrdersByDays().size());
    }

    @Test
    public void createThenList() {
        OrdersByDayCreateDTO dto = new OrdersByDayCreateDTO();
        dto.setDay(LocalDate.now());
        dto.setProductId(savedProduct.getId());
        dto.setCount(3);

        long id = createOrdersByDay(dto);

        assertEquals(1, ordersByDayClient.getOrdersByDays().size());
        assertEquals(id, ordersByDayClient.getOrdersByDays().get(0).getId());
        assertEquals(LocalDate.now(), ordersByDayClient.getOrdersByDays().get(0).getDay());
        assertEquals(3, ordersByDayClient.getOrdersByDays().get(0).getCount());
    }

    @Test
    public void createThenFetch() {
        OrdersByDayCreateDTO dto = new OrdersByDayCreateDTO();
        dto.setDay(LocalDate.now());
        dto.setProductId(savedProduct.getId());
        dto.setCount(3);
        long id = createOrdersByDay(dto);

        OrdersByDay ordersByDay = ordersByDayClient.getOrdersByDay(id);
        assertEquals(id, ordersByDay.getId());
        assertEquals(LocalDate.now(), ordersByDay.getDay());
        assertEquals(3, ordersByDay.getCount());
    }

    @Test
    public void fetchMissing() {
        assertNull(ordersByDayClient.getOrdersByDay(9999));
    }

    @Test
    public void createThenDelete() {
        OrdersByDayCreateDTO dto = new OrdersByDayCreateDTO();
        dto.setDay(LocalDate.now());
        dto.setProductId(savedProduct.getId());
        dto.setCount(3);

        long id = createOrdersByDay(dto);

        ordersByDayClient.deleteOrdersByDay(id);

        assertEquals(0, ordersByDayClient.getOrdersByDays().size());
    }

    @Test
    public void deleteMissing() {
        HttpResponse response = ordersByDayClient.deleteOrdersByDay(9999);
        assertEquals(HttpStatus.NOT_FOUND, response.getStatus());
    }

    @Test
    public void getByDay() {
        OrdersByDayCreateDTO dto = new OrdersByDayCreateDTO();
        dto.setDay(LocalDate.now());
        dto.setProductId(savedProduct.getId());
        dto.setCount(3);

        long id = createOrdersByDay(dto);

        assertEquals(1, ordersByDayClient.getByProduct(LocalDate.now()).size());
        assertEquals(id, ordersByDayClient.getByProduct(LocalDate.now()).get(0).getId());
        assertEquals(LocalDate.now(), ordersByDayClient.getByProduct(LocalDate.now()).get(0).getDay());
        assertEquals(3, ordersByDayClient.getByProduct(LocalDate.now()).get(0).getCount());
    }

    @Test
    public void testGetByProduct() {
        OrdersByDayCreateDTO dto = new OrdersByDayCreateDTO();
        dto.setDay(LocalDate.now());
        dto.setProductId(savedProduct.getId());
        dto.setCount(3);

        long id = createOrdersByDay(dto);

        assertEquals(1, ordersByDayClient.getByProduct(savedProduct.getId()).size());
        assertEquals(id, ordersByDayClient.getByProduct(savedProduct.getId()).get(0).getId());
        assertEquals(LocalDate.now(), ordersByDayClient.getByProduct(savedProduct.getId()).get(0).getDay());
        assertEquals(3, ordersByDayClient.getByProduct(savedProduct.getId()).get(0).getCount());
    }

    @Test
    public void testGetByDayAndProduct() {
        OrdersByDayCreateDTO dto = new OrdersByDayCreateDTO();
        dto.setDay(LocalDate.now());
        dto.setProductId(savedProduct.getId());
        dto.setCount(3);

        long id = createOrdersByDay(dto);

        assertNotNull(ordersByDayClient.getByProductAndDate(LocalDate.now(), savedProduct.getId()));
        assertEquals(id, ordersByDayClient.getByProductAndDate(LocalDate.now(), savedProduct.getId()).getId());
        assertEquals(LocalDate.now(), ordersByDayClient.getByProductAndDate(LocalDate.now(), savedProduct.getId()).getDay());
        assertEquals(3, ordersByDayClient.getByProductAndDate(LocalDate.now(), savedProduct.getId()).getCount());
    }

    private long createOrdersByDay(OrdersByDayCreateDTO dto) {
        HttpResponse<Void> response = ordersByDayClient.createOrdersByDay(dto);
        assertEquals(HttpStatus.CREATED, response.getStatus());
        return Long.parseLong(response.header(HttpHeaders.LOCATION).split("/")[2]);
    }
}
