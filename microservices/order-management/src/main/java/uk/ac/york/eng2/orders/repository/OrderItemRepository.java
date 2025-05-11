package uk.ac.york.eng2.orders.repository;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;
import uk.ac.york.eng2.orders.domain.OrderItem;

import java.util.List;
import java.util.Optional;

@Repository
public interface OrderItemRepository extends CrudRepository<OrderItem, Long> {

    List<OrderItem> findByOrderId(Long orderId);
}
