package uk.ac.york.eng2.products.resources;

import io.micronaut.core.annotation.NonNull;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.*;
import io.micronaut.http.exceptions.HttpStatusException;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import uk.ac.york.eng2.products.domain.Product;
import uk.ac.york.eng2.products.dto.ProductCreateDTO;
import uk.ac.york.eng2.products.repository.ProductRepository;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@Tag(name="products")
@Controller(ProductController.PREFIX)
public class ProductController {
    public final static String PREFIX = "/products";

    @Inject
    private ProductRepository productRepository;


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
