package com.example.Tienda.service.impl;

import com.example.Tienda.model.Category;
import com.example.Tienda.service.CategoryService;
import com.example.Tienda.service.repository.category.CategoryRepository;
import com.example.Tienda.service.repository.category.CategoryRepositoryMapper;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class CategoryImplemet implements CategoryService {
    private final CategoryRepository categoryRepository;
    private final CategoryRepositoryMapper categoryRepositoryMapper;
    @Override
    public Category save(Category category) {
        return categoryRepositoryMapper.toEntity(categoryRepository.save(categoryRepositoryMapper.toDto(category)));
    }

    @Override
    public List<Category> get() {
        return categoryRepositoryMapper.toEntity(categoryRepository.findAll());
    }
}
