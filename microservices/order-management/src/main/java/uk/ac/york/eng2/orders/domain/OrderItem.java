package uk.ac.york.eng2.orders.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.micronaut.serde.annotation.Serdeable;
import jakarta.persistence.*;

import java.math.BigDecimal;

@Serdeable
@Entity
public class OrderItem {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private Long productId;

    @Column
    private int quantity;

    @Column
    private BigDecimal unitPrice;

    @JsonIgnore
    @ManyToOne
    private Orders order;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Orders getOrder() {
        return order;
    }

    public void setOrder(Orders ordersId) {
        this.order = ordersId;
    }
}
