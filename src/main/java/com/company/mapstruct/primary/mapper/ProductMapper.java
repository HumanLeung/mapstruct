package com.company.mapstruct.primary.mapper;

import com.company.mapstruct.primary.dto.ProductDto;
import com.company.mapstruct.primary.model.Product;
import com.company.mapstruct.primary.validator.ProductValidationException;
import com.company.mapstruct.primary.validator.ProductValidator;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;
import java.util.UUID;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : HumanLeung
 * @create 2021/10/17 10:07
 */

@Mapper(uses = {ProductValidator.class}, componentModel = "spring",imports = UUID.class)
public interface ProductMapper {

    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

//    @Mapping(source = "product.description", target = "description", defaultValue = "description")
//    @Mapping(target = "itemId", expression = "java(UUID.randomUUID().toString())")
//    @Mapping(source = "product.items", target = "itemsList")
    ProductDto modelTODto(Product product) throws ProductValidationException;

    List<ProductDto> modelToDto(List<Product> product);

    @InheritInverseConfiguration
    Product dtoToModel(ProductDto productDto) throws ProductValidationException;
}
