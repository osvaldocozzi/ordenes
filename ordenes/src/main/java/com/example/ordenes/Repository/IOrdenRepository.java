package com.example.ordenes.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ordenes.Model.Orden;



@Repository
public interface IOrdenRepository extends JpaRepository <Orden, Long> {
    
}
