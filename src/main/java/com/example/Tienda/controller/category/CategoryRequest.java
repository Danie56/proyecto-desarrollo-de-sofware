package com.example.Tienda.controller.category;

import com.example.Tienda.model.Product;
import java.util.List;
import lombok.Data;

@Data
public class CategoryRequest {
  private String name;
  private List<Long> products;

}
