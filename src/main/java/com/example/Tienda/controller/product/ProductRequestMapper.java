package com.example.Tienda.controller.product;

import com.example.Tienda.controller.category.CategoryRequest;
import com.example.Tienda.model.Category;
import com.example.Tienda.model.Product;
import java.util.ArrayList;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface ProductRequestMapper {
  @Mapping(target = "categories", expression = "java(mapIdsToEntity(productRequest.getCategories()))")
  Product toEntity(ProductRequest productRequest);
  default List<Category> mapIdsToEntity(List<Long> ids) {
    List<Category> categories = new ArrayList<>();
    for (Long categoryId : ids) {
      Category category = new Category();
      category.setId(categoryId);
      categories.add(category);
    }
    return categories;

  }

}
