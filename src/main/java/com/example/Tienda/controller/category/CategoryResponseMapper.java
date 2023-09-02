package com.example.Tienda.controller.category;

import com.example.Tienda.controller.product.ProductResponseMapper;
import com.example.Tienda.model.Category;
import com.example.Tienda.shared.mapper.EntityToDto;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants.ComponentModel;

@Mapper(componentModel = ComponentModel.SPRING, uses = {
    ProductResponseMapper.class,
}, injectionStrategy = InjectionStrategy.CONSTRUCTOR)public interface CategoryResponseMapper extends EntityToDto<Category, CategoryResponse> {

}
