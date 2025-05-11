package uk.ac.york.eng2.products.dto;

import io.micronaut.serde.annotation.Serdeable;

import java.util.Date;

@Serdeable
public class OrdersByDayCreateDTO {
    private Long productId;
    private String productName;
    private Date day;
    private int count;

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Date getDay() {
        return day;
    }

    public void setDay(Date day) {
        this.day = day;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
