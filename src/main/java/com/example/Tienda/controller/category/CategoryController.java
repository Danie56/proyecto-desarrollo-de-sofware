package com.example.Tienda.controller.category;

import com.example.Tienda.model.Category;
import com.example.Tienda.service.CategoryService;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/category")
@AllArgsConstructor
public class CategoryController {
    private CategoryService categoryService;
    private CategoryRequestMapper categoryRequestMapper;
    private CategoryResponseMapper categoryResponseMapper;
    @PostMapping
    public ResponseEntity<CategoryResponse> save(@RequestBody CategoryRequest categoryRequest){

        Category category= categoryService.save(categoryRequestMapper.toEntity(categoryRequest));
        return new ResponseEntity<>(categoryResponseMapper.toDto(category), HttpStatus.OK);
    }
    @GetMapping
    public ResponseEntity<List<CategoryResponse>> get(){

        return new ResponseEntity<>(categoryResponseMapper.toDto(categoryService.get()), HttpStatus.OK);
    }
}