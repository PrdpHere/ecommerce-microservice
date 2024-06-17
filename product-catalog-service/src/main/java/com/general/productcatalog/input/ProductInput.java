package com.general.productcatalog.input;

import com.general.productcatalog.enums.Category;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProductInput {
    private Long productId;
    private String name;
    private String description;
    private BigDecimal price;
    private int stockQuantity;
    private Category category;
}
