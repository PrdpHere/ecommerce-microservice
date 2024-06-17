package com.general.productcatalog.controller;

import com.general.productcatalog.dto.ProductDto;
import com.general.productcatalog.input.ProductInput;
import com.general.productcatalog.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @QueryMapping
    public List<ProductDto> getAllProducts() {
        return productService.getAllProducts();

    }

    @QueryMapping
    public ProductDto getProductById(@Argument int productId) {
        return productService.getProductById(productId);
    }

    @MutationMapping
    public ProductDto addProduct(@Argument ProductInput productInput) {
        return productService.addProduct(productInput);
    }

}
