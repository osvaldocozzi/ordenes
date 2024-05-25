package com.example.ordenes.Mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

import com.example.ordenes.Dto.UsuarioDTO;
import com.example.ordenes.Model.Usuario;

@Mapper
@Component
public interface UsuarioMapper {
    UsuarioMapper INSTANCE = Mappers.getMapper(UsuarioMapper.class);

    UsuarioDTO toDto(Usuario usuario);

    @Mapping(target = "id_usuario", ignore = true)
    Usuario toEntity(UsuarioDTO usuarioDTO);

}