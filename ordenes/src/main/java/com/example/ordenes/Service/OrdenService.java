package com.example.ordenes.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ordenes.Model.Orden;
import com.example.ordenes.Repository.IOrdenRepository;

@Service
public class OrdenService {
    @Autowired
    IOrdenRepository ordenRepository;


    public List<Orden> getOrdenes(){
        return ordenRepository.findAll();
    }
}
