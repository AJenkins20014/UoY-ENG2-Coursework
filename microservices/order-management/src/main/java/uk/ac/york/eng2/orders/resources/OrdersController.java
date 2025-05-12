package uk.ac.york.eng2.orders.resources;

import io.micronaut.core.annotation.NonNull;
import io.micronaut.http.HttpHeaders;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.*;
import io.micronaut.http.exceptions.HttpStatusException;
import io.micronaut.scheduling.TaskExecutors;
import io.micronaut.scheduling.annotation.ExecuteOn;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import uk.ac.york.eng2.orders.domain.OrderItem;
import uk.ac.york.eng2.orders.domain.Orders;
import uk.ac.york.eng2.orders.dto.OrdersCreateDTO;
import uk.ac.york.eng2.orders.events.OrdersCreated;
import uk.ac.york.eng2.orders.events.OrdersProducer;
import uk.ac.york.eng2.orders.gateways.PMProductPricingGateway;
import uk.ac.york.eng2.orders.gateways.ProductPricingInfo;
import uk.ac.york.eng2.orders.repository.CustomerRepository;
import uk.ac.york.eng2.orders.repository.OrderItemRepository;
import uk.ac.york.eng2.orders.repository.OrdersRepository;

import java.math.BigDecimal;
import java.net.URI;
import java.time.LocalDate;
import java.util.*;

@ExecuteOn(TaskExecutors.BLOCKING)
@Tag(name="orders")
@Controller(OrdersController.PREFIX)
public class OrdersController {
    public final static String PREFIX = "/orders";

    @Inject
    private OrdersRepository ordersRepository;

    @Inject
    private OrderItemRepository orderItemRepository;

    @Inject
    private CustomerRepository customerRepository;

    @Inject
    private OrdersProducer ordersProducer;

    @Inject
    private PMProductPricingGateway pmProductPricingGateway;


    @Get
    public List<Orders> getOrders() {
        return ordersRepository.findAll();
    }

    @Post
    public HttpResponse<Void> createOrders(@Body OrdersCreateDTO dto){
        Orders orders = new Orders();
        orders.setDateCreated(LocalDate.now());
        orders.setAddress(dto.getAddress());
        orders.setPaid(dto.isPaid());
        orders.setDelivered(dto.isDelivered());

        orders.setCustomer(customerRepository.findById(dto.getCustomerId()).orElseThrow(() ->
                        new HttpStatusException(HttpStatus.NOT_FOUND, "Customer not found")
                ));

        orders.setTotalAmount(BigDecimal.ZERO);
        orders = ordersRepository.save(orders);


        BigDecimal orderTotal = BigDecimal.ZERO;
        HashMap<Long, Integer> items = new HashMap<>();
        for (Map.Entry<Long, Integer> entry : dto.getOrderItems().entrySet()) {
            Long productId = entry.getKey();
            int quantity = entry.getValue();

            Optional<ProductPricingInfo> priceInfo = pmProductPricingGateway.getProductPrice(productId);

            if (priceInfo.isEmpty()) {
                throw new HttpStatusException(HttpStatus.NOT_FOUND, "Product not found");
            }

            BigDecimal unitPrice = priceInfo.get().price;

            OrderItem item = new OrderItem();
            item.setProductId(productId);
            item.setQuantity(quantity);
            item.setUnitPrice(unitPrice);
            item.setOrder(orders);
            orderItemRepository.save(item);
            items.put(productId, quantity);

            orderTotal = orderTotal.add(unitPrice.multiply(BigDecimal.valueOf(quantity)));
        }

        orders.setTotalAmount(orderTotal);
        orders = ordersRepository.update(orders);

        ordersProducer.orderCreated(new OrdersCreated(orders.getDateCreated(), items));

        return HttpResponse.created(URI.create(PREFIX + "/" + orders.getId()));
    }

    @Get("/{id}")
    public Orders getOrders(@PathVariable long id) {
        return ordersRepository.findById(id).orElse(null);
    }

    @Get("/{id}/orderItems")
    public List<OrderItem> getOrderItems(@PathVariable long id) {
        return orderItemRepository.findByOrderId(id);
    }

    @Transactional
    @Put("/{id}")
    public void updateOrders(@Body OrdersCreateDTO dto, @PathVariable long id) {
        @NonNull Optional<Orders> oOrders = ordersRepository.findById(id);
        if (oOrders.isEmpty()) {
            throw new HttpStatusException(HttpStatus.NOT_FOUND, "Order not found");
        }

        Orders orders = oOrders.get();
        orders.setAddress(dto.getAddress());
        orders.setPaid(dto.isPaid());
        orders.setDelivered(dto.isDelivered());

        orders.setCustomer(customerRepository.findById(dto.getCustomerId()).orElseThrow(() ->
                new HttpStatusException(HttpStatus.NOT_FOUND, "Customer not found")
        ));

        orders.setTotalAmount(BigDecimal.ZERO);
        orders = ordersRepository.save(orders);


        BigDecimal orderTotal = BigDecimal.ZERO;
        HashMap<Long, Integer> items = new HashMap<>();
        orderItemRepository.deleteByOrderId(id);
        for (Map.Entry<Long, Integer> entry : dto.getOrderItems().entrySet()) {
            Long productId = entry.getKey();
            int quantity = entry.getValue();

            Optional<ProductPricingInfo> priceInfo = pmProductPricingGateway.getProductPrice(productId);

            if (priceInfo.isEmpty()) {
                throw new HttpStatusException(HttpStatus.NOT_FOUND, "Product not found");
            }

            BigDecimal unitPrice = priceInfo.get().price;

            OrderItem item = new OrderItem();
            item.setProductId(productId);
            item.setQuantity(quantity);
            item.setUnitPrice(unitPrice);
            item.setOrder(orders);
            orderItemRepository.save(item);
            items.put(productId, quantity);

            orderTotal = orderTotal.add(unitPrice.multiply(BigDecimal.valueOf(quantity)));
        }

        orders.setTotalAmount(orderTotal);
        orders = ordersRepository.update(orders);

        ordersProducer.orderCreated(new OrdersCreated(orders.getDateCreated(), items));
    }

    @Delete("/{id}")
    public void deleteOrders(@PathVariable long id) {
        if(ordersRepository.existsById(id)) {
            ordersRepository.deleteById(id);
        }
        else{
            throw new HttpStatusException(HttpStatus.NOT_FOUND, "Order not found");
        }
    }

    private void populateOrder(){

    }

}
