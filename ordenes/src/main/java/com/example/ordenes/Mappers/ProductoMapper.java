package com.example.ordenes.Mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.example.ordenes.Dto.ProductoDTO;
import com.example.ordenes.Model.Producto;
import com.example.ordenes.Model.Usuario;

@Mapper
public interface ProductoMapper {
    ProductoMapper INSTANCE = Mappers.getMapper(ProductoMapper.class);

    @Mapping(target = "id_usuario", expression = "java(producto.getId_usuario().getId_usuario())")
    ProductoDTO toDto(Producto producto);

    @Mapping(target = "id_usuario", ignore = true)
    Producto toEntity(ProductoDTO productoDTO);

    default Usuario map(Long id_usuario) {
        if (id_usuario == null) {
            return null;
        }
        Usuario usuario = new Usuario();
        usuario.setId_usuario(id_usuario);
        return usuario;
    }
}

