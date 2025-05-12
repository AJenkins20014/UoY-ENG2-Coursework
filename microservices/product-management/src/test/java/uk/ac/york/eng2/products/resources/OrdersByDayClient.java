package uk.ac.york.eng2.products.resources;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Delete;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.client.annotation.Client;
import uk.ac.york.eng2.products.domain.OrdersByDay;
import uk.ac.york.eng2.products.dto.OrdersByDayCreateDTO;

import java.time.LocalDate;
import java.util.List;

@Client(OrdersByDayController.PREFIX)
public interface OrdersByDayClient {

    @Get
    List<OrdersByDay> getOrdersByDays();

    @Post
    HttpResponse<Void> createOrdersByDay(OrdersByDayCreateDTO dto);

    @Get("/id/{id}")
    OrdersByDay getOrdersByDay(@PathVariable long id);

    @Get("/day/{day}")
    List<OrdersByDay> getByProduct(@PathVariable LocalDate day);

    @Get("/product/{productId}")
    List<OrdersByDay> getByProduct(@PathVariable long productId);

    @Get("/day/{day}/product/{productId}")
    OrdersByDay getByProductAndDate(@PathVariable LocalDate day, @PathVariable long productId);

    @Delete("/id/{id}")
    HttpResponse deleteOrdersByDay(@PathVariable long id);
}
