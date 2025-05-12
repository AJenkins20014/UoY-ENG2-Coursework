package uk.ac.york.eng2.orders.resources;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.*;
import io.micronaut.http.client.annotation.Client;
import uk.ac.york.eng2.orders.domain.OrderItem;
import uk.ac.york.eng2.orders.domain.Orders;
import uk.ac.york.eng2.orders.dto.OrdersCreateDTO;

import java.util.List;

@Client(OrdersController.PREFIX)
public interface OrdersClient {

    @Get
    List<Orders> getOrders();

    @Post
    HttpResponse<Void> createOrders(@Body OrdersCreateDTO dto);

    @Get("/{id}")
    Orders getOrders(@PathVariable long id);

    @Get("/{id}/orderItems")
    List<OrderItem> getOrderItems(@PathVariable long id);

    @Put("/{id}")
    HttpResponse updateOrders(@Body OrdersCreateDTO dto, @PathVariable long id);

    @Delete("/{id}")
    HttpResponse deleteOrders(@PathVariable long id);
}
