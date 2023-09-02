package com.example.Tienda.service;

import com.example.Tienda.model.Category;
import java.util.List;


public interface CategoryService {
    Category save(Category category);
    List<Category> get();
}
