package uk.ac.york.eng2.orders.resources;

import io.micronaut.core.annotation.NonNull;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.*;
import io.micronaut.http.exceptions.HttpStatusException;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import uk.ac.york.eng2.orders.domain.Customer;
import uk.ac.york.eng2.orders.domain.OrderItem;
import uk.ac.york.eng2.orders.domain.Orders;
import uk.ac.york.eng2.orders.dto.OrderItemCreateDTO;
import uk.ac.york.eng2.orders.events.OrdersProducer;
import uk.ac.york.eng2.orders.repository.OrderItemRepository;
import uk.ac.york.eng2.orders.repository.OrdersRepository;

import java.math.BigDecimal;
import java.net.URI;
import java.util.List;
import java.util.Optional;

@Tag(name="orderItems")
@Controller(OrderItemController.PREFIX)
public class OrderItemController {
    public final static String PREFIX = "/orderItems";

    @Inject
    private OrderItemRepository orderItemRepository;

    @Inject
    private OrdersRepository ordersRepository;

    @Inject
    private OrdersProducer ordersProducer;

    @Get
    public List<OrderItem> getOrderItems() {
        return orderItemRepository.findAll();
    }

    @Post
    public HttpResponse<Void> createOrderItem(@Body OrderItemCreateDTO dto){
        OrderItem orderItem = new OrderItem();
        orderItem.setProductId(dto.getProductId());
        orderItem.setQuantity(dto.getQuantity());
        orderItem.setUnitPrice(BigDecimal.ZERO);

        orderItem.setOrder(ordersRepository.findById(dto.getOrderId()).orElse(null));

        orderItem = orderItemRepository.save(orderItem);

        ordersProducer.orderItemCreated(orderItem.getId(), orderItem.getProductId());

        return HttpResponse.created(URI.create(PREFIX + "/" + orderItem.getId()));
    }

    @Get("/{id}")
    public OrderItem getOrderItem(@PathVariable long id) {
        return orderItemRepository.findById(id).orElse(null);
    }

    @Get("/{id}/orders")
    public Orders getFullOrder(@PathVariable long id) {
        return ordersRepository.findByOrderItemsId(id).orElse(null);
    }

    @Get("/{id}/customers")
    public Customer getCustomer(@PathVariable long id) {
        Optional<Orders> order = ordersRepository.findByOrderItemsId(id);

        if(order.isPresent()) {
            return order.get().getCustomer();
        }
        else{
            throw new HttpStatusException(HttpStatus.NOT_FOUND, "Order not found");
        }
    }

    @Transactional
    @Put("/{id}")
    public void updateOrderItem(@Body OrderItemCreateDTO dto, @PathVariable long id) {
        @NonNull Optional<OrderItem> oOrderItem = orderItemRepository.findById(id);
        if (oOrderItem.isEmpty()) {
            throw new HttpStatusException(HttpStatus.NOT_FOUND, "Order item not found");
        }
        OrderItem orderItem = oOrderItem.get();
        orderItem.setProductId(dto.getProductId());
        orderItem.setQuantity(dto.getQuantity());

        orderItem.setOrder(ordersRepository.findById(dto.getOrderId()).orElse(null));

        orderItemRepository.save(orderItem);

        ordersProducer.orderItemCreated(orderItem.getId(), orderItem.getProductId());
    }

    @Delete("/{id}")
    public void deleteOrderItem(@PathVariable long id) {
        if(orderItemRepository.existsById(id)) {
            orderItemRepository.deleteById(id);
        }
        else{
            throw new HttpStatusException(HttpStatus.NOT_FOUND, "Order item not found");
        }
    }


}
