package com.example.Tienda.controller.product;

import com.example.Tienda.controller.category.CategoryResponse;
import java.util.List;
import lombok.Data;

@Data
public class ProductResponse {
  private Long id;
  private String name;
  private List<CategoryResponse> categories;


}
