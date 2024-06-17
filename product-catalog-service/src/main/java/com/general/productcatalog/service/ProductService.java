package com.general.productcatalog.service;

import com.general.productcatalog.dto.ProductDto;
import com.general.productcatalog.input.ProductInput;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {

    List<ProductDto> getAllProducts();

    ProductDto getProductById(int productId);

    ProductDto addProduct(ProductInput productInput);
}
