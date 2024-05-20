package com.example.ordenes.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ordenes.Model.Producto;



@Repository
public interface IProductoRepository extends JpaRepository <Producto, Long> {
    
}