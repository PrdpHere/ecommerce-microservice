package com.general.productcatalog.service.impl;

import com.general.productcatalog.dto.ProductDto;
import com.general.productcatalog.entity.Product;
import com.general.productcatalog.input.ProductInput;
import com.general.productcatalog.mapper.ProductMapper;
import com.general.productcatalog.repository.ProductRepository;
import com.general.productcatalog.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;

    @Autowired
    ProductMapper productMapper;

    @Override
    public List<ProductDto> getAllProducts() {
        List<Product> productList = productRepository.findAll();
        //From Entity to Dto - output
        List<ProductDto> productDtoList = productList.stream()
                .map(product -> productMapper.toDto(product)).toList();
        return productDtoList;
    }

    @Override
    public ProductDto getProductById(int productId) {
        Optional<Product> product = productRepository.findById((long) productId);
        if (product.isEmpty()) {
            return null;
        }
        //From Entity to Dto - output
        return productMapper.toDto(product.get());
    }

    @Override
    public ProductDto addProduct(ProductInput productInput) {
        //from Input to Entity - to save in DB
        Product product = productMapper.fromInput(productInput);
        //Save Entity
        Product savedProduct = productRepository.save(product);
        //From Entity to Dto - Output
        return productMapper.toDto(savedProduct);
    }

}
