package com.example.Tienda.controller.category;

import com.example.Tienda.model.Category;
import com.example.Tienda.model.Product;
import java.util.ArrayList;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface CategoryRequestMapper {
  @Mapping(target = "products", expression = "java(mapIdsToEntity(categoryRequest.getProducts()))")
  Category toEntity(CategoryRequest categoryRequest);
  default List<Product> mapIdsToEntity(List<Long> ids) {
    List<Product> products = new ArrayList<>();
    for (Long productId : ids) {
      Product product = new Product();
      product.setId(productId);
      products.add(product);
    }
    return products;

  }

}
