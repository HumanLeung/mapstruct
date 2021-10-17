package com.company.mapstruct.primary.controller;

import com.company.mapstruct.primary.dto.ProductDto;
import com.company.mapstruct.primary.mapper.ProductMapper;
import com.company.mapstruct.primary.model.Product;
import com.company.mapstruct.primary.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : HumanLeung
 * @create 2021/10/17 11:56
 */

@RestController
public class ProductController {

    final private ProductMapper productMapper;
    final private ProductRepository productRepository;

    @Autowired
    public ProductController(ProductMapper productMapper, ProductRepository productRepository){
        this.productMapper = productMapper;
        this.productRepository = productRepository;
    }

    @PostMapping("/products")
    public ResponseEntity<Product> save(@RequestBody ProductDto productDto){
        return new ResponseEntity<>(productRepository.save(
                productMapper.dtoToModel(productDto)),HttpStatus.CREATED);
    }

    @GetMapping("/products/info")
    public ResponseEntity<List<ProductDto>> findAll(){
        return new ResponseEntity<>(productMapper.modelToDto(productRepository.findAll()),
                HttpStatus.OK);
    }

    @GetMapping("/products/{id}")
    public ResponseEntity<ProductDto> findById(@PathVariable(value = "id") Integer id){
        return new ResponseEntity<>(productMapper
                .modelTODto(productRepository.findById(id).get()),HttpStatus.OK);

    }

    @DeleteMapping("/products/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable(value = "id") Integer id){

        Product product = productRepository.findById(id).get();
        productRepository.delete(product);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);

    }


}
