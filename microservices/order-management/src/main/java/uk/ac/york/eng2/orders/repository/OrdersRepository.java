package uk.ac.york.eng2.orders.repository;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;
import uk.ac.york.eng2.orders.domain.Orders;

import java.util.Optional;

@Repository
public interface OrdersRepository extends CrudRepository<Orders, Long> {

    Optional<Orders> findByOrderItemsId(Long id);
}
