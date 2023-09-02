package com.example.Tienda.service.repository.product;

import com.example.Tienda.controller.category.CategoryResponseMapper;
import com.example.Tienda.model.Category;
import com.example.Tienda.model.Product;
import com.example.Tienda.service.repository.category.CategoryEntity;
import com.example.Tienda.service.repository.category.CategoryRepositoryMapper;
import com.example.Tienda.shared.mapper.EntityToDto;
import java.util.List;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants.ComponentModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Mapper
public interface ProductRepositoryMapper extends EntityToDto<Product,ProductEntity>{



}
