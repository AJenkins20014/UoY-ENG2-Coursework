package uk.ac.york.eng2.integration;

import io.micronaut.http.HttpHeaders;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import jakarta.validation.Valid;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import uk.ac.york.eng2.orders.api.CustomersApi;
import uk.ac.york.eng2.orders.api.OrdersApi;
import uk.ac.york.eng2.orders.model.CustomerCreateDTO;
import uk.ac.york.eng2.orders.model.Orders;
import uk.ac.york.eng2.orders.model.OrdersCreateDTO;
import uk.ac.york.eng2.products.api.OrdersByDaysApi;
import uk.ac.york.eng2.products.api.ProductsApi;
import uk.ac.york.eng2.products.api.TagsApi;
import uk.ac.york.eng2.products.model.OrdersByDay;
import uk.ac.york.eng2.products.model.ProductCreateDTO;
import uk.ac.york.eng2.products.model.Tag;
import uk.ac.york.eng2.products.model.TagCreateDTO;
import java.math.BigDecimal;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;

import static org.awaitility.Awaitility.await;
import static org.junit.jupiter.api.Assertions.assertEquals;

@MicronautTest
public class OrderWorkflowTest {
    @Inject
    ProductsApi productsApi;

    @Inject
    CustomersApi customersApi;

    @Inject
    OrdersApi ordersApi;
    @Inject
    private TagsApi tagsApi;
    @Inject
    private OrdersByDaysApi ordersByDaysApi;


    @Test
    public void placeOrder() {
        long customerId = createCustomer();
        List<Long> productIds = createProducts();
        addTags(productIds);

        OrdersCreateDTO ordersCreateDTO = new OrdersCreateDTO();
        ordersCreateDTO.setCustomerId(customerId);
        ordersCreateDTO.setAddress("123 High Street");
        ordersCreateDTO.setDelivered(false);
        ordersCreateDTO.setPaid(false);

        HashMap<String, Integer> orderItems = new HashMap<>();
        orderItems.put(productIds.get(0).toString(), 1);
        orderItems.put(productIds.get(1).toString(), 2);
        orderItems.put(productIds.get(2).toString(), 3);
        ordersCreateDTO.setOrderItems(orderItems);

        HttpResponse<Void> response = ordersApi.createOrders(ordersCreateDTO);
        assertEquals(HttpStatus.CREATED, response.getStatus());
        long orderId = Long.parseLong(response.header(HttpHeaders.LOCATION).split("/")[2]);

        Orders order = ordersApi.getOrders1(orderId).getBody().orElseThrow();
        assertEquals(new BigDecimal("45.00"), order.getTotalAmount());

        await().atMost(Duration.ofSeconds(20)).until(ordersByDayCreated(productIds.get(0)));
    }


    private long createCustomer(){
        CustomerCreateDTO customerCreateDTO = new CustomerCreateDTO();
        customerCreateDTO.setFirstName("John");
        customerCreateDTO.setFamilyName("Doe");
        customerCreateDTO.setEmail("JohnDoe@gmail.com");
        HttpResponse<Void> response = customersApi.createCustomer(customerCreateDTO);
        assertEquals(HttpStatus.CREATED, response.getStatus());
        return Long.parseLong(response.header(HttpHeaders.LOCATION).split("/")[2]);
    }

    private List<Long> createProducts(){
        List<Long> ids = new ArrayList<>();

        ProductCreateDTO productCreateDTO1 = new ProductCreateDTO();
        productCreateDTO1.setName("Cinnamon Whirl");
        productCreateDTO1.setUnitPrice(new BigDecimal("4"));
        HttpResponse<Void> response1 = productsApi.createProduct(productCreateDTO1);
        assertEquals(HttpStatus.CREATED, response1.getStatus());
        ids.add(Long.parseLong(response1.header(HttpHeaders.LOCATION).split("/")[2]));

        ProductCreateDTO productCreateDTO2 = new ProductCreateDTO();
        productCreateDTO2.setName("Croissant");
        productCreateDTO2.setUnitPrice(new BigDecimal("7"));
        HttpResponse<Void> response2 = productsApi.createProduct(productCreateDTO2);
        assertEquals(HttpStatus.CREATED, response2.getStatus());
        ids.add(Long.parseLong(response2.header(HttpHeaders.LOCATION).split("/")[2]));

        ProductCreateDTO productCreateDTO3 = new ProductCreateDTO();
        productCreateDTO3.setName("Eclair");
        productCreateDTO3.setUnitPrice(new BigDecimal("9"));
        HttpResponse<Void> response3 = productsApi.createProduct(productCreateDTO3);
        assertEquals(HttpStatus.CREATED, response3.getStatus());
        ids.add(Long.parseLong(response3.header(HttpHeaders.LOCATION).split("/")[2]));

        return ids;
    }

    private void addTags(List<Long> productIds){
        TagCreateDTO tagCreateDTO1 = new TagCreateDTO();
        tagCreateDTO1.setName("Cinnamon");
        HttpResponse<Void> response1 = tagsApi.createTag(tagCreateDTO1);
        assertEquals(HttpStatus.CREATED, response1.getStatus());
        long id1 = Long.parseLong(response1.header(HttpHeaders.LOCATION).split("/")[2]);

        TagCreateDTO tagCreateDTO2 = new TagCreateDTO();
        tagCreateDTO2.setName("Whirly");
        HttpResponse<Void> response2 = tagsApi.createTag(tagCreateDTO2);
        assertEquals(HttpStatus.CREATED, response2.getStatus());
        long id2 = Long.parseLong(response2.header(HttpHeaders.LOCATION).split("/")[2]);

        TagCreateDTO tagCreateDTO3 = new TagCreateDTO();
        tagCreateDTO3.setName("Croissaint-like");
        HttpResponse<Void> response3 = tagsApi.createTag(tagCreateDTO3);
        assertEquals(HttpStatus.CREATED, response3.getStatus());
        long id3 = Long.parseLong(response3.header(HttpHeaders.LOCATION).split("/")[2]);

        TagCreateDTO tagCreateDTO4 = new TagCreateDTO();
        tagCreateDTO4.setName("Chocolate");
        HttpResponse<Void> response4 = tagsApi.createTag(tagCreateDTO4);
        assertEquals(HttpStatus.CREATED, response4.getStatus());
        long id4 = Long.parseLong(response4.header(HttpHeaders.LOCATION).split("/")[2]);

        HttpResponse<Void> addTagResponse1 = productsApi.addProductTag(productIds.get(0), id1);
        assertEquals(HttpStatus.OK, addTagResponse1.getStatus());
        HttpResponse<Void> addTagResponse2 = productsApi.addProductTag(productIds.get(0), id2);
        assertEquals(HttpStatus.OK, addTagResponse2.getStatus());

        List<Tag> tags1 = productsApi.getProductTags(productIds.get(0)).getBody().orElseThrow();
        assertEquals(2,  tags1.size());


        HttpResponse<Void> addTagResponse3 = productsApi.addProductTag(productIds.get(1), id3);
        assertEquals(HttpStatus.OK, addTagResponse3.getStatus());

        List<Tag> tags2 = productsApi.getProductTags(productIds.get(1)).getBody().orElseThrow();
        assertEquals("Croissaint-like", tags2.get(0).getName());


        HttpResponse<Void> addTagResponse4 = productsApi.addProductTag(productIds.get(2), id4);
        assertEquals(HttpStatus.OK, addTagResponse4.getStatus());

        List<Tag> tags3 = productsApi.getProductTags(productIds.get(2)).getBody().orElseThrow();
        assertEquals("Chocolate", tags3.get(0).getName());
    }

    protected Callable<Boolean> ordersByDayCreated(long productId) {
        return () -> {
            HttpResponse<@Valid List<OrdersByDay>> ordersByDayResponse = ordersByDaysApi.getOrdersByDays();
            if (ordersByDayResponse.getBody().isPresent()) {
                List<OrdersByDay> orders = ordersByDaysApi.getByProduct(productId).getBody().orElseThrow();
                return orders.get(0).getCount() == 1;
            }
            return false;
        };
    }
}
