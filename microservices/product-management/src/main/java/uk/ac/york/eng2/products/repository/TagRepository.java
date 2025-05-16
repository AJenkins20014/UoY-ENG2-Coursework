package uk.ac.york.eng2.products.repository;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;
import uk.ac.york.eng2.products.domain.Tag;

import java.util.List;

@Repository
public interface TagRepository extends CrudRepository<Tag, Long> {
    List<Tag> findByProductsId(long id);
    List<Tag> findByProductsName(String name);
}
