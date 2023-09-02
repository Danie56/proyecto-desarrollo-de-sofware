package com.example.Tienda.controller.product;

import com.example.Tienda.controller.category.CategoryResponse;
import com.example.Tienda.controller.category.CategoryResponseMapper;
import com.example.Tienda.model.Category;
import com.example.Tienda.model.Product;
import com.example.Tienda.shared.mapper.EntityToDto;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants.ComponentModel;

@Mapper(componentModel = ComponentModel.SPRING, uses = {
    CategoryResponseMapper.class,
}, injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface ProductResponseMapper extends EntityToDto<Product, ProductResponse> {

}
