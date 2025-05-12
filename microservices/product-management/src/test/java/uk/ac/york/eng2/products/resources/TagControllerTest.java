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
import uk.ac.york.eng2.products.dto.TagCreateDTO;
import uk.ac.york.eng2.products.repository.OrdersByDayRepository;
import uk.ac.york.eng2.products.repository.ProductRepository;
import uk.ac.york.eng2.products.repository.TagRepository;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

@MicronautTest(transactional = false)
public class TagControllerTest {
    @Inject
    private TagClient tagClient;

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
    public void noTags() {
        assertEquals(0, tagClient.getTags().size());
    }

    @Test
    public void createThenList() {
        TagCreateDTO dto = new TagCreateDTO();
        dto.setName("Cinnamon");
        long id = createTag(dto);

        assertEquals(1, tagClient.getTags().size());
        assertEquals(id, tagClient.getTags().get(0).getId());
        assertEquals("Cinnamon", tagClient.getTags().get(0).getName());
    }

    @Test
    public void createThenFetch() {
        TagCreateDTO dto = new TagCreateDTO();
        dto.setName("Cinnamon");
        long id = createTag(dto);

        Tag tag = tagClient.getTag(id);
        assertEquals(id, tag.getId());
        assertEquals("Cinnamon", tag.getName());
    }

    @Test
    public void fetchMissing() {
        assertNull(tagClient.getTag(9999));
    }

    @Test
    public void updateTag() {
        TagCreateDTO dto = new TagCreateDTO();
        dto.setName("Cinaom");
        long id = createTag(dto);

        dto.setName("Cinnamon");
        tagClient.updateTag(dto, id);

        Tag tag = tagClient.getTag(id);
        assertEquals(id, tag.getId());
        assertEquals("Cinnamon", tag.getName());
    }

    @Test
    public void createThenDelete() {
        TagCreateDTO dto = new TagCreateDTO();
        dto.setName("Cinnamon");
        long id = createTag(dto);

        tagClient.deleteTag(id);

        assertEquals(0, tagClient.getTags().size());
    }

    @Test
    public void testGetProductsByTag(){
        TagCreateDTO dto = new TagCreateDTO();
        dto.setName("Cinnamon");
        long id = createTag(dto);

        Product product  = new Product();
        product.setName("Cinnamon Whirl");
        product.setUnitPrice(new java.math.BigDecimal("4.99"));

        Set<Tag> tags = new HashSet<>();
        tags.add(tagClient.getTag(id));
        product.setTags(tags);

        productRepository.save(product);


        List<Product> products = tagClient.getProductsByTag(id);
        assertEquals(1, products.size());
        assertEquals(product.getId(), products.get(0).getId());
        assertEquals("Cinnamon Whirl", products.get(0).getName());
    }

    @Test
    public void updateMissing() {
        TagCreateDTO dto = new TagCreateDTO();
        dto.setName("Cinnamon");
        long id = createTag(dto);

        HttpResponse response = tagClient.updateTag(dto, 9999);
        assertEquals(HttpStatus.NOT_FOUND, response.getStatus());
    }

    @Test
    public void deleteMissing() {
        HttpResponse response = tagClient.deleteTag(9999);
        assertEquals(HttpStatus.NOT_FOUND, response.getStatus());
    }


    private long createTag(TagCreateDTO dto) {
        HttpResponse<Void> response = tagClient.createTag(dto);
        assertEquals(HttpStatus.CREATED, response.getStatus());
        return Long.parseLong(response.header(HttpHeaders.LOCATION).split("/")[2]);
    }
}
