package uk.ac.york.eng2.orders.resources;

import io.micronaut.core.annotation.NonNull;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.*;
import io.micronaut.http.exceptions.HttpStatusException;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import uk.ac.york.eng2.orders.domain.OrderItem;
import uk.ac.york.eng2.orders.domain.Orders;
import uk.ac.york.eng2.orders.dto.OrdersCreateDTO;
import uk.ac.york.eng2.orders.repository.CustomerRepository;
import uk.ac.york.eng2.orders.repository.OrderItemRepository;
import uk.ac.york.eng2.orders.repository.OrdersRepository;

import java.math.BigDecimal;
import java.net.URI;
import java.time.Instant;
import java.util.Date;
import java.util.List;
import java.util.Optional;

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


    @Get
    public List<Orders> getOrders() {
        return ordersRepository.findAll();
    }

    @Post
    public HttpResponse<Void> createOrders(@Body OrdersCreateDTO dto){
        Orders orders = new Orders();
        orders.setDateCreated(Date.from(Instant.now()));
        orders.setAddress(dto.getAddress());
        orders.setPaid(dto.isPaid());
        orders.setDelivered(dto.isDelivered());

        orders.setTotalAmount(BigDecimal.ZERO);

        orders.setCustomer(customerRepository.findById(dto.getCustomerId()).orElse(null));

        orders = ordersRepository.save(orders);

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
        orders.setDateCreated(Date.from(Instant.now()));
        orders.setAddress(dto.getAddress());
        orders.setPaid(dto.isPaid());
        orders.setDelivered(dto.isDelivered());

        orders.setCustomer(customerRepository.findById(dto.getCustomerId()).orElse(null));

        ordersRepository.save(orders);
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


}
