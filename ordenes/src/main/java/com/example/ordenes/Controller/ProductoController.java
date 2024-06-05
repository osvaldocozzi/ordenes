package com.example.ordenes.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ordenes.Dto.ProductoDTO;
import com.example.ordenes.Service.ProductoService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/productos")
public class ProductoController {
    
    @Autowired
    private ProductoService productoService;

    @PostMapping
    public ResponseEntity<ProductoDTO> createProducto(@RequestBody ProductoDTO productoDTO) {
        ProductoDTO createdProducto = productoService.createProducto(productoDTO);
        return ResponseEntity.ok(createdProducto);
    }
    
     @GetMapping("/{id}")
    public ResponseEntity<ProductoDTO> getProductoById(@PathVariable Long id) {
        ProductoDTO producto = productoService.getProductoById(id);
        return ResponseEntity.ok(producto);
    }

    @GetMapping
    public ResponseEntity<List<ProductoDTO>> getAllProductos() {
        List<ProductoDTO> productos = productoService.getAllProductos();
        return ResponseEntity.ok(productos);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProductoDTO> updateProducto(@PathVariable Long id, @RequestBody ProductoDTO productoDTO) {
        ProductoDTO updatedProducto = productoService.updateProducto(id, productoDTO);
        return ResponseEntity.ok(updatedProducto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProducto(@PathVariable Long id) {
        productoService.deleteProducto(id);
        return ResponseEntity.noContent().build();
}
}