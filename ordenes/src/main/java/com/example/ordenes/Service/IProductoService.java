package com.example.ordenes.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.ordenes.Dto.ProductoDTO;


@Service
public interface IProductoService {
    
    ProductoDTO createProducto(ProductoDTO productoDTO);
    ProductoDTO getProductoById(Long id);
    List<ProductoDTO> getAllProductos();
    ProductoDTO updateProducto(Long id, ProductoDTO productoDTO);
    void deleteProducto(Long id);
}
