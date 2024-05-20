package com.example.ordenes.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ordenes.Repository.IOrdenRepository;

@Service
public class OrdenService {
    @Autowired
    IOrdenRepository ordenRepository;
}
