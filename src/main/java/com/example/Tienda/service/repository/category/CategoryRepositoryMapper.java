package com.example.Tienda.service.repository.category;

import com.example.Tienda.model.Category;
import com.example.Tienda.shared.mapper.EntityToDto;
import org.mapstruct.Mapper;

@Mapper
public interface CategoryRepositoryMapper  extends EntityToDto<Category, CategoryEntity> {

}
