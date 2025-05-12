package uk.ac.york.eng2.products.resources;

import io.micronaut.http.HttpHeaders;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import uk.ac.york.eng2.products.domain.Product;
import uk.ac.york.eng2.products.domain.Tag;
import uk.ac.york.eng2.products.dto.ProductCreateDTO;
import uk.ac.york.eng2.products.repository.OrdersByDayRepository;
import uk.ac.york.eng2.products.repository.ProductRepository;
import uk.ac.york.eng2.products.repository.TagRepository;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@MicronautTest(transactional = false)
public class ProductControllerTest {
    @Inject
    private ProductClient productClient;

    @Inject
    private ProductRepository productRepository;

    @Inject
    private TagRepository tagRepository;

    @Inject
    OrdersByDayRepository ordersByDayRepository;

    @BeforeEach
    public void setup() {
        productRepository.deleteAll();
        tagRepository.deleteAll();
        ordersByDayRepository.deleteAll();
    }


    @Test
    public void noProducts() {
        assertEquals(0, productClient.getProducts().size());
    }

    @Test
    public void createThenList() {
        ProductCreateDTO dto = new ProductCreateDTO();
        dto.setName("Cinnamon Whirl");
        dto.setUnitPrice(new BigDecimal("4.99"));
        long id = createProduct(dto);

        assertEquals(1, productClient.getProducts().size());
        assertEquals(id, productClient.getProducts().get(0).getId());
        assertEquals("Cinnamon Whirl", productClient.getProducts().get(0).getName());
        assertEquals(new BigDecimal("4.99"), productClient.getProducts().get(0).getUnitPrice());
    }

    @Test
    public void createThenFetch() {
        ProductCreateDTO dto = new ProductCreateDTO();
        dto.setName("Cinnamon Whirl");
        dto.setUnitPrice(new BigDecimal("4.99"));
        long id = createProduct(dto);

        Product product = productClient.getProduct(id);
        assertEquals(id, product.getId());
        assertEquals("Cinnamon Whirl", product.getName());
        assertEquals(new BigDecimal("4.99"), product.getUnitPrice());
    }

    @Test
    public void fetchMissing() {
        assertNull(productClient.getProduct(9999));
    }

    @Test
    public void updateProduct() {
        ProductCreateDTO dto = new ProductCreateDTO();
        dto.setName("Cinaom hwilr");
        dto.setUnitPrice(new BigDecimal("499"));
        long id = createProduct(dto);

        dto.setName("Cinnamon Whirl");
        dto.setUnitPrice(new BigDecimal("4.99"));

        productClient.updateProduct(dto, id);

        Product product = productClient.getProduct(id);
        assertEquals(id, product.getId());
        assertEquals("Cinnamon Whirl", product.getName());
        assertEquals(new BigDecimal("4.99"), product.getUnitPrice());
    }

    @Test
    public void createThenDelete() {
        ProductCreateDTO dto = new ProductCreateDTO();
        dto.setName("Cinnamon Whirl");
        dto.setUnitPrice(new BigDecimal("4.99"));
        long id = createProduct(dto);

        productClient.deleteProduct(id);

        assertEquals(0, productClient.getProducts().size());
    }

    @Test
    public void updateMissing() {
        ProductCreateDTO dto = new ProductCreateDTO();
        dto.setName("Cinnamon Whirl");
        dto.setUnitPrice(new BigDecimal("4.99"));

        HttpResponse response = productClient.updateProduct(dto, 9999);
        assertEquals(HttpStatus.NOT_FOUND, response.getStatus());
    }

    @Test
    public void deleteMissing() {
        HttpResponse response = productClient.deleteProduct(9999);
        assertEquals(HttpStatus.NOT_FOUND, response.getStatus());
    }

    @Test
    void addAndRemoveTag() {
        // Create and add tag
        ProductCreateDTO dto = new ProductCreateDTO();
        dto.setName("Cinnamon Whirl");
        dto.setUnitPrice(new BigDecimal("4.99"));
        long id = createProduct(dto);

        Product product = productClient.getProduct(id);

        Tag tag = new Tag();
        tag.setName("Cinnamon");
        tag = tagRepository.save(tag);

        productClient.addProductTag(product.getId(), tag.getId());
        List<Tag> tags = productClient.getProductTags(product.getId());
        assertEquals(1, tags.size());
        assertEquals("Cinnamon", tags.get(0).getName());


        // Remove tag
        productClient.removeProductTag(product.getId(), tag.getId());
        assertEquals(0, productClient.getProductTags(product.getId()).size());
    }

    private long createProduct(ProductCreateDTO dto) {
        HttpResponse<Void> response = productClient.createProduct(dto);
        assertEquals(HttpStatus.CREATED, response.getStatus());
        return Long.parseLong(response.header(HttpHeaders.LOCATION).split("/")[2]);
    }
}
