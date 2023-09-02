package com.example.Tienda.service;

import com.example.Tienda.model.Product;

import java.util.List;

public interface ProductService {
    Product save(Product product);
    List<Product> get();
}
