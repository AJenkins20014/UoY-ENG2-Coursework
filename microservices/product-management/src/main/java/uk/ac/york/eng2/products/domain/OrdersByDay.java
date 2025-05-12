package uk.ac.york.eng2.products.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.micronaut.data.annotation.MappedProperty;
import io.micronaut.serde.annotation.Serdeable;
import jakarta.persistence.*;

import java.time.LocalDate;

@Serdeable
@Entity
public class OrdersByDay {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private LocalDate day;

    @Column
    private int count;

    @JsonIgnore
    @ManyToOne
    private Product product;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDay() {
        return day;
    }

    public void setDay(LocalDate day) {
        this.day = day;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
