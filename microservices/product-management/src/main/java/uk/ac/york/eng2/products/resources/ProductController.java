package uk.ac.york.eng2.products.resources;

import io.micronaut.core.annotation.NonNull;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.*;
import io.micronaut.http.exceptions.HttpStatusException;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import uk.ac.york.eng2.products.domain.Product;
import uk.ac.york.eng2.products.domain.Tag;
import uk.ac.york.eng2.products.dto.ProductCreateDTO;
import uk.ac.york.eng2.products.repository.ProductRepository;
import uk.ac.york.eng2.products.repository.TagRepository;

import java.math.BigDecimal;
import java.net.URI;
import java.util.List;
import java.util.Optional;

@io.swagger.v3.oas.annotations.tags.Tag(name="products")
@Controller(ProductController.PREFIX)
public class ProductController {
    public final static String PREFIX = "/products";

    @Inject
    private ProductRepository productRepository;
    @Inject
    private TagRepository tagRepository;


    @Get
    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    @Post
    public HttpResponse<Void> createProduct(@Body ProductCreateDTO dto){
        Product product = new Product();
        product.setName(dto.getName());
        product.setUnitPrice(dto.getUnitPrice());

        product = productRepository.save(product);

        return HttpResponse.created(URI.create(PREFIX + "/" + product.getId()));
    }

    @Get("/{id}")
    public Product getProduct(@PathVariable long id) {
        return productRepository.findById(id).orElse(null);
    }

    @Get("/{id}/tags")
    public List<Tag> getProductTags(@PathVariable long id) {
        return tagRepository.findByProductsId(id);
    }

    @Get("/{id}/price")
    public BigDecimal getProductPrice(@PathVariable long id) {
        Optional<Product> product = productRepository.findById(id);
        if(product.isPresent()){
            return product.get().getUnitPrice();
        }
        else{
            throw new HttpStatusException(HttpStatus.NOT_FOUND, "Product not found");
        }
    }

    @Transactional
    @Put("/{id}/tags/{tagId}")
    public void addProductTag(@PathVariable long id, @PathVariable long tagId) {
        ProductTag productTag = getProductTag(id, tagId);
        productTag.product.getTags().add(productTag.tag);
        productRepository.save(productTag.product);
    }

    @Transactional
    @Delete("/{id}/tags/{tagId}")
    public void removeProductTag(@PathVariable long id, @PathVariable long tagId) {
        ProductTag productTag = getProductTag(id, tagId);
        productTag.product.getTags().remove(productTag.tag);
        productRepository.save(productTag.product);
    }

    private record ProductTag(Product product, Tag tag) { }

    private ProductTag getProductTag(long productId, long tagId) {
        @NonNull Optional<Product> oProduct = productRepository.findById(productId);
        if (oProduct.isEmpty()) {
            throw new HttpStatusException(HttpStatus.NOT_FOUND, "Product not found");
        }
        Product product = oProduct.get();

        @NonNull Optional<Tag> oTag = tagRepository.findById(tagId);
        if (oTag.isEmpty()) {
            throw new HttpStatusException(HttpStatus.NOT_FOUND, "Tag not found");
        }
        Tag tag = oTag.get();
        return new ProductTag(product, tag);
    }

    @Transactional
    @Put("/{id}")
    public void updateProduct(@Body ProductCreateDTO dto, @PathVariable long id) {
        @NonNull Optional<Product> oProduct = productRepository.findById(id);
        if (oProduct.isEmpty()) {
            throw new HttpStatusException(HttpStatus.NOT_FOUND, "Product not found");
        }
        Product product = oProduct.get();
        product.setName(dto.getName());
        product.setUnitPrice(dto.getUnitPrice());

        productRepository.save(product);
    }

    @Delete("/{id}")
    public void deleteProduct(@PathVariable long id) {
        if(productRepository.existsById(id)) {
            productRepository.deleteById(id);
        }
        else{
            throw new HttpStatusException(HttpStatus.NOT_FOUND, "Product not found");
        }
    }

}
