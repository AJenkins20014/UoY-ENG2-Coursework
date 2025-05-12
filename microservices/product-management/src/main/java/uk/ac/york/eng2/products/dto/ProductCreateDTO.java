package uk.ac.york.eng2.products.dto;

import io.micronaut.serde.annotation.Serdeable;

import java.math.BigDecimal;

@Serdeable
public class ProductCreateDTO {
    private String name;
    private BigDecimal unitPrice;

    public ProductCreateDTO() {}

    public ProductCreateDTO(String name, BigDecimal price) {
        setName(name);
        setUnitPrice(price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }
}
