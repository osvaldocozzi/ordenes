package com.example.ordenes.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.ordenes.Dto.OrdenDTO;



@Service
public interface IOrdenService {
    

    OrdenDTO createOrden(OrdenDTO ordenDTO);
    OrdenDTO getOrdenById(Long id_orden);
    List<OrdenDTO> getAllOrden();
    OrdenDTO updateProducto(Long id_orden, OrdenDTO ordenDTO);
    void deleteOrden(Long id_orden);
    

}
