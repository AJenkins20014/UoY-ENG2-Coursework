package uk.ac.york.eng2.products.repository;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;
import uk.ac.york.eng2.products.domain.OrdersByDay;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface OrdersByDayRepository extends CrudRepository<OrdersByDay, Long> {
    Optional<OrdersByDay> findByProductIdAndDay(Long orderId, LocalDate day);
    List<OrdersByDay> findByProductId(Long productId);
    List<OrdersByDay> findByDay(LocalDate day);

}
