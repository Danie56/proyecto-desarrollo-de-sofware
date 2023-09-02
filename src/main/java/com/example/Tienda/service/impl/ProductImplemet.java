package com.example.Tienda.service.impl;

import com.example.Tienda.model.Category;
import com.example.Tienda.model.Product;
import com.example.Tienda.service.CategoryService;
import com.example.Tienda.service.ProductService;
import com.example.Tienda.service.repository.product.ProductRepository;
import com.example.Tienda.service.repository.product.ProductRepositoryMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class ProductImplemet implements ProductService {
    private final ProductRepository productRepository;
    private final ProductRepositoryMapper productRepositoryMapper;

    @Override
    public Product save(Product product) {
        return productRepositoryMapper.toEntity(productRepository.save(productRepositoryMapper.toDto(product)));
    }

    @Override
    public List<Product> get() {
        return productRepositoryMapper.toEntity(productRepository.findAll());
    }
}
