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
import uk.ac.york.eng2.orders.dto.CustomerCreateDTO;
import uk.ac.york.eng2.orders.repository.CustomerRepository;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@Tag(name="customers")
@Controller(CustomerController.PREFIX)
public class CustomerController {
    public final static String PREFIX = "/customers";

    @Inject
    private CustomerRepository customerRepository;


    @Get
    public List<Customer> getCustomers() {
        return customerRepository.findAll();
    }

    @Post
    public HttpResponse<Void> createCustomer(@Body CustomerCreateDTO dto){
        Customer customer = new Customer();
        customer.setEmail(dto.getEmail());
        customer.setFirstName(dto.getFirstName());
        customer.setFamilyName(dto.getFamilyName());

        customer = customerRepository.save(customer);

        return HttpResponse.created(URI.create(PREFIX + "/" + customer.getId()));
    }

    @Get("/{id}")
    public Customer getCustomer(@PathVariable long id) {
        return customerRepository.findById(id).orElse(null);
    }

    @Transactional
    @Put("/{id}")
    public void updateCustomer(@Body CustomerCreateDTO dto, @PathVariable long id) {
        @NonNull Optional<Customer> oCustomer = customerRepository.findById(id);
        if (oCustomer.isEmpty()) {
            throw new HttpStatusException(HttpStatus.NOT_FOUND, "Customer not found");
        }
        Customer customer = oCustomer.get();
        customer.setEmail(dto.getEmail());
        customer.setFirstName(dto.getFirstName());
        customer.setFamilyName(dto.getFamilyName());

        customerRepository.save(customer);
    }

    @Delete("/{id}")
    public void deleteCustomer(@PathVariable long id) {
        if(customerRepository.existsById(id)) {
            customerRepository.deleteById(id);
        }
        else{
            throw new HttpStatusException(HttpStatus.NOT_FOUND, "Customer not found");
        }
    }


}
