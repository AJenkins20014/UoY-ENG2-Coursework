package uk.ac.york.eng2.orders.resources;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.*;
import io.micronaut.http.client.annotation.Client;
import uk.ac.york.eng2.orders.domain.Customer;
import uk.ac.york.eng2.orders.dto.CustomerCreateDTO;

import java.util.List;

@Client(CustomerController.PREFIX)
public interface CustomerClient {

    @Get
    List<Customer> getCustomers();

    @Post
    HttpResponse<Void> createCustomer(@Body CustomerCreateDTO dto);

    @Get("/{id}")
    Customer getCustomer(@PathVariable long id);

    @Put("/{id}")
    HttpResponse updateCustomer(@Body CustomerCreateDTO dto, @PathVariable long id);

    @Delete("/{id}")
    HttpResponse deleteCustomer(@PathVariable long id);
}
