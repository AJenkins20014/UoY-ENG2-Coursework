package uk.ac.york.eng2.orders.resources;

import io.micronaut.http.HttpHeaders;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import uk.ac.york.eng2.orders.domain.Customer;
import uk.ac.york.eng2.orders.dto.CustomerCreateDTO;
import uk.ac.york.eng2.orders.repository.CustomerRepository;

import static org.junit.jupiter.api.Assertions.*;

@MicronautTest(transactional = false)
public class CustomerControllerTest {

    @Inject
    private CustomerClient customerClient;

    @Inject
    private CustomerRepository customerRepository;

    @BeforeEach
    public void setup() {
        customerRepository.deleteAll();
    }

    @Test
    public void noCustomers() {
        assertEquals(0, customerClient.getCustomers().size());
    }

    @Test
    public void createThenList() {
        CustomerCreateDTO dto = new CustomerCreateDTO();
        dto.setFirstName("John");
        dto.setFamilyName("Doe");
        dto.setEmail("JohnDoe@gmail.com");
        long id = createCustomer(dto);

        assertEquals(1, customerClient.getCustomers().size());
        assertEquals(id, customerClient.getCustomers().get(0).getId());
        assertEquals("John", customerClient.getCustomers().get(0).getFirstName());
        assertEquals("Doe", customerClient.getCustomers().get(0).getFamilyName());
        assertEquals("JohnDoe@gmail.com", customerClient.getCustomers().get(0).getEmail());
    }

    @Test
    public void createThenFetch() {
        CustomerCreateDTO dto = new CustomerCreateDTO();
        dto.setFirstName("John");
        dto.setFamilyName("Doe");
        dto.setEmail("JohnDoe@gmail.com");
        long id = createCustomer(dto);

        Customer customer = customerClient.getCustomer(id);
        assertEquals(id, customer.getId());
        assertEquals("John", customer.getFirstName());
        assertEquals("Doe", customer.getFamilyName());
        assertEquals("JohnDoe@gmail.com", customer.getEmail());
    }

    @Test
    public void fetchMissing() {
        assertNull(customerClient.getCustomer(9999));
    }

    @Test
    public void updateCustomer() {
        CustomerCreateDTO dto = new CustomerCreateDTO();
        dto.setFirstName("Jhon");
        dto.setFamilyName("deo");
        dto.setEmail("Jondo@gmali.co");
        long id = createCustomer(dto);

        dto.setFirstName("John");
        dto.setFamilyName("Doe");
        dto.setEmail("JohnDoe@gmail.com");

        customerClient.updateCustomer(dto, id);

        Customer customer = customerClient.getCustomer(id);
        assertEquals(id, customer.getId());
        assertEquals("John", customer.getFirstName());
        assertEquals("Doe", customer.getFamilyName());
        assertEquals("JohnDoe@gmail.com", customer.getEmail());
    }

    @Test
    public void createThenDelete() {
        CustomerCreateDTO dto = new CustomerCreateDTO();
        dto.setFirstName("John");
        dto.setFamilyName("Doe");
        dto.setEmail("JohnDoe@gmail.com");
        long id = createCustomer(dto);

        customerClient.deleteCustomer(id);

        assertEquals(0, customerClient.getCustomers().size());
    }

    @Test
    public void updateMissing() {
        CustomerCreateDTO dto = new CustomerCreateDTO();
        dto.setFirstName("John");
        dto.setFamilyName("Doe");
        dto.setEmail("JohnDoe@gmail.com");

        HttpResponse response = customerClient.updateCustomer(dto, 9999);
        assertEquals(HttpStatus.NOT_FOUND, response.getStatus());
    }

    @Test
    public void deleteMissing() {
        HttpResponse response = customerClient.deleteCustomer(9999);
        assertEquals(HttpStatus.NOT_FOUND, response.getStatus());
    }


    private long createCustomer(CustomerCreateDTO dto) {
        HttpResponse<Void> response = customerClient.createCustomer(dto);
        assertEquals(HttpStatus.CREATED, response.getStatus());
        return Long.parseLong(response.header(HttpHeaders.LOCATION).split("/")[2]);
    }
}
