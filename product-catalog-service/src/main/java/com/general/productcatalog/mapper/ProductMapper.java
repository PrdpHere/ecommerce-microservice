package com.general.productcatalog.mapper;

import com.general.productcatalog.dto.ProductDto;
import com.general.productcatalog.entity.Product;
import com.general.productcatalog.input.ProductInput;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    //From Input to Entity - to Save in DB
    Product fromInput(ProductInput productInput);

    //From Entity to Dto - Output
    ProductDto toDto(Product product);

}
