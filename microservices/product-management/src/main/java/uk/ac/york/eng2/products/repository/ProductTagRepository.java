package uk.ac.york.eng2.products.repository;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;
import uk.ac.york.eng2.products.domain.Product;

@Repository
public interface ProductTagRepository extends CrudRepository<Product, Long> {
}
