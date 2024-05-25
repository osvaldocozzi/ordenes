package com.example.ordenes.Config;

import org.mapstruct.factory.Mappers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.ordenes.Mappers.OrdenMapper;
import com.example.ordenes.Mappers.ProductoMapper;
import com.example.ordenes.Mappers.UsuarioMapper;

@Configuration
public class MapperConfig {

    @Bean
    OrdenMapper ordenMapper() {
        return Mappers.getMapper(OrdenMapper.class);
    }

    @Bean
    UsuarioMapper usuarioMapper() {
        return Mappers.getMapper(UsuarioMapper.class);
    }

    @Bean
    ProductoMapper productoMapper() {
        return Mappers.getMapper(ProductoMapper.class);
    }
}

