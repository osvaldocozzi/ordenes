package com.example.ordenes.Service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ordenes.Dto.ProductoDTO;
import com.example.ordenes.Mappers.ProductoMapper;
import com.example.ordenes.Model.Producto;
import com.example.ordenes.Repository.IProductoRepository;

@Service
public class ProductoService implements IProductoService{
    
    @Autowired
    IProductoRepository productoRepository;
    
    @Autowired
    ProductoMapper productoMapper;

    @Override
    public ProductoDTO createProducto(ProductoDTO productoDTO) {
        Producto producto = productoMapper.toEntity(productoDTO);
        Producto savedProducto = productoRepository.save(producto);
        return productoMapper.toDto(savedProducto);
    }
    @Override
    public ProductoDTO getProductoById(Long id_producto) {
        Producto producto = productoRepository.findById(id_producto)
            .orElseThrow(() -> new RuntimeException("Producto no encontrado"));
        return productoMapper.toDto(producto);
    }

    @Override
    public List<ProductoDTO> getAllProductos() {
        List<Producto> productos = productoRepository.findAll();
        return productos.stream()
                .map(productoMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public ProductoDTO updateProducto(Long id_producto, ProductoDTO productoDTO) {
        Producto producto = productoRepository.findById(id_producto)
            .orElseThrow(() -> new RuntimeException("Producto no encontrado"));
            producto.setNombre(productoDTO.getNombre());
            producto.setPrecio(productoDTO.getPrecio());
            producto.setCantidad(productoDTO.getCantidad());
            producto.setCategoria(productoDTO.getCategoria());
            producto.setDisponibilidad(productoDTO.getDisponibilidad());
            producto.setId_usuario(productoMapper.map(productoDTO.getId_usuario()));
        Producto updateProducto = productoRepository.save(producto);
        return productoMapper.toDto(updateProducto);
    }

    @Override
    public void deleteProducto(Long id) {
        Producto producto = productoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Producto not found"));
        productoRepository.delete(producto);
    }
    
    
}
