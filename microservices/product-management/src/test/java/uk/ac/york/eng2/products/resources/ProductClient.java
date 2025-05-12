package uk.ac.york.eng2.products.resources;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.*;
import io.micronaut.http.client.annotation.Client;
import uk.ac.york.eng2.products.domain.Product;
import uk.ac.york.eng2.products.domain.Tag;
import uk.ac.york.eng2.products.dto.ProductCreateDTO;

import java.math.BigDecimal;
import java.util.List;

@Client(ProductController.PREFIX)
public interface ProductClient {

    @Get
    List<Product> getProducts();

    @Post
    HttpResponse<Void> createProduct(@Body ProductCreateDTO dto);

    @Get("/{id}")
    Product getProduct(@PathVariable long id);

    @Get("/{id}/tags")
    List<Tag> getProductTags(@PathVariable long id);

    @Get("/{id}/price")
    BigDecimal getProductPrice(@PathVariable long id);

    @Put("/{id}/tags/{tagId}")
    void addProductTag(@PathVariable long id, @PathVariable long tagId);

    @Delete("/{id}/tags/{tagId}")
    void removeProductTag(@PathVariable long id, @PathVariable long tagId);

    @Put("/{id}")
    HttpResponse updateProduct(@Body ProductCreateDTO dto, @PathVariable long id);

    @Delete("/{id}")
    HttpResponse deleteProduct(@PathVariable long id);
}
