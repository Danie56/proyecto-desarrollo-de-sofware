package com.example.Tienda.model;

import java.util.List;
import lombok.Data;

@Data
public class Product {
    private Long id;
    private String name;
    private Double price;
    private List<Category> categories;
}
