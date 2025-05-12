package uk.ac.york.eng2.products.dto;

import io.micronaut.serde.annotation.Serdeable;

import java.time.LocalDate;


@Serdeable
public class OrdersByDayCreateDTO {
    private Long productId;
    private LocalDate day;
    private int count;

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
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
}
