package uk.ac.york.eng2.products.dto;

import io.micronaut.serde.annotation.Serdeable;

@Serdeable
public class ProductTagDTO {
    private Long productsId;
    private Long tagsId;

    public Long getProductsId() {
        return productsId;
    }

    public void setProductsId(Long productsId) {
        this.productsId = productsId;
    }

    public Long getTagsId() {
        return tagsId;
    }

    public void setTagsId(Long tagsId) {
        this.tagsId = tagsId;
    }
}
