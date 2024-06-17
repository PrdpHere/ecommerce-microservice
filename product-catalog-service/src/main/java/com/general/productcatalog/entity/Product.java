package com.general.productcatalog.entity;

import com.general.productcatalog.enums.Category;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Data
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long productId;
    private String name;
    private String description;
    private BigDecimal price;
    private int stockQuantity;

    @Enumerated(EnumType.STRING)
    private Category category;

    @Transient
    private String message;
}
