package com.example.Tienda.controller.product;

import com.example.Tienda.service.repository.category.CategoryEntity;
import java.util.List;
import lombok.Data;

@Data
public class ProductRequest {
  private String name;
  private Double price;
  private List<Long> categories;
}
