package com.example.ordenes.Mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

import com.example.ordenes.Dto.OrdenDTO;
import com.example.ordenes.Model.Orden;
import com.example.ordenes.Model.Usuario;

@Mapper(uses = {UsuarioMapper.class, ProductoMapper.class})
public interface OrdenMapper {
    OrdenMapper INSTANCE = Mappers.getMapper(OrdenMapper.class);

    @Mapping(source = "id_usuario.id_usuario", target = "id_usuario")
    @Mapping(source = "productos", target = "productos")
    OrdenDTO toDto(Orden orden);

    @Mapping(source = "id_usuario", target = "id_usuario", qualifiedByName = "map")
    @Mapping(source = "productos", target = "productos")
    Orden toEntity(OrdenDTO ordenDTO);

    @Named("map")
    default Usuario map(Long id_usuario) {
        if (id_usuario == null) {
            return null;
        }
        Usuario usuario = new Usuario();
        usuario.setId_usuario(id_usuario);
        return usuario;
    }
}


// import static org.junit.jupiter.api.Assertions.*;
// import org.junit.jupiter.api.Test;

// import java.util.Arrays;
// import java.util.List;

// public class OrdenMapperTest {

//     @Test
//     public void testOrdenToOrdenDTO() {
//         Usuario usuario = new Usuario();
//         usuario.setId_usuario(1L);
        
//         Producto producto1 = new Producto();
//         producto1.setId_producto(100L);
//         producto1.setId_usuario(usuario);
        
//         Producto producto2 = new Producto();
//         producto2.setId_producto(101L);
//         producto2.setId_usuario(usuario);

//         List<Producto> productos = Arrays.asList(producto1, producto2);
        
//         Orden orden = new Orden();
//         orden.setId_orden(1L);
//         orden.setNumero(123);
//         orden.setId_usuario(usuario);
//         orden.setProductos(productos);

//         OrdenDTO ordenDTO = OrdenMapper.INSTANCE.toDto(orden);

//         assertNotNull(ordenDTO);
//         assertEquals(1L, ordenDTO.getId_orden());
//         assertEquals(123, ordenDTO.getNumero());
//         assertEquals(1L, ordenDTO.getId_usuario());
//         assertNotNull(ordenDTO.getProductos());
//         assertEquals(2, ordenDTO.getProductos().size());
//     }

//     @Test
//     public void testOrdenDTOToOrden() {
//         OrdenDTO ordenDTO = new OrdenDTO();
//         ordenDTO.setId_orden(1L);
//         ordenDTO.setNumero(123);
//         ordenDTO.setId_usuario(1L);
        
//         ProductoDTO productoDTO1 = new ProductoDTO();
//         productoDTO1.setId_producto(100L);
//         productoDTO1.setId_usuario(1L);
        
//         ProductoDTO productoDTO2 = new ProductoDTO();
//         productoDTO2.setId_producto(101L);
//         productoDTO2.setId_usuario(1L);
        
//         List<ProductoDTO> productosDTO = Arrays.asList(productoDTO1, productoDTO2);
//         ordenDTO.setProductos(productosDTO);

//         Orden orden = OrdenMapper.INSTANCE.toEntity(ordenDTO);

//         assertNotNull(orden);
//         assertEquals(1L, orden.getId_orden());
//         assertEquals(123, orden.getNumero());
//         assertNotNull(orden.getId_usuario());
//         assertEquals(1L, orden.getId_usuario().getId_usuario());
//         assertNotNull(orden.getProductos());
//         assertEquals(2, orden.getProductos().size());
//     }
// }