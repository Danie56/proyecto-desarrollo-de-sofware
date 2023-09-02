package com.example.Tienda.controller.product;

import com.example.Tienda.model.Category;
import com.example.Tienda.model.Product;
import com.example.Tienda.service.CategoryService;
import com.example.Tienda.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
@AllArgsConstructor
public class ProductController {
    private final ProductService productService;
    private final ProductRequestMapper productRequestMapper;
    private final ProductResponseMapper productResponseMapper;
    @PostMapping
    public ResponseEntity<ProductResponse> save(@RequestBody ProductRequest productRequest){
        Product product = productService.save(productRequestMapper.toEntity(productRequest));
        return new ResponseEntity<>(productResponseMapper.toDto(product), HttpStatus.OK);
    }
    @GetMapping
    public ResponseEntity<List<ProductResponse>> get(){
        return new ResponseEntity<>(productResponseMapper.toDto(productService.get()), HttpStatus.OK);
    }

}
