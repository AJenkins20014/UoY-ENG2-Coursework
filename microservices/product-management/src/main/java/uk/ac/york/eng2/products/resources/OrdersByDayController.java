package uk.ac.york.eng2.products.resources;

import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.*;
import io.micronaut.http.exceptions.HttpStatusException;
import jakarta.inject.Inject;
import uk.ac.york.eng2.products.domain.OrdersByDay;
import uk.ac.york.eng2.products.repository.OrdersByDayRepository;

import java.time.LocalDate;
import java.util.List;

@io.swagger.v3.oas.annotations.tags.Tag(name="ordersByDays")
@Controller(OrdersByDayController.PREFIX)
public class OrdersByDayController {
    public final static String PREFIX = "/ordersByDays";

    @Inject
    private OrdersByDayRepository ordersByDayRepository;


    @Get
    public List<OrdersByDay> getOrdersByDays() {
        return ordersByDayRepository.findAll();
    }

    @Get("/id/{id}")
    public OrdersByDay getOrdersByDay(@PathVariable long id) {
        return ordersByDayRepository.findById(id).orElse(null);
    }

    @Get("/day/{day}")
    public List<OrdersByDay> getByProduct(@PathVariable LocalDate day) {
        return ordersByDayRepository.findByDay(day);
    }

    @Get("/product/{productId}")
    public List<OrdersByDay> getByProduct(@PathVariable long productId) {
        return ordersByDayRepository.findByProductId(productId);
    }

    @Get("/day/{day}/product/{productId}")
    public OrdersByDay getByProductAndDate(@PathVariable LocalDate day, @PathVariable long productId) {
        return ordersByDayRepository.findByProductIdAndDay(productId, day).orElse(null);
    }

    @Delete("/id/{id}")
    public void deleteOrdersByDay(@PathVariable long id) {
        if(ordersByDayRepository.existsById(id)) {
            ordersByDayRepository.deleteById(id);
        }
        else{
            throw new HttpStatusException(HttpStatus.NOT_FOUND, "Order by day not found");
        }
    }

}
