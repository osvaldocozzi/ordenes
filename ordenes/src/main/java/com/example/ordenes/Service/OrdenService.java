package com.example.ordenes.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.stream.Collectors;
import com.example.ordenes.Dto.OrdenDTO;
import com.example.ordenes.Mappers.OrdenMapper;
import com.example.ordenes.Model.Orden;
import com.example.ordenes.Repository.IOrdenRepository;

@Service
public class OrdenService implements IOrdenService{
    
    @Autowired
    IOrdenRepository ordenRepository;

    @Autowired 
    OrdenMapper ordenMapper;

    @Override
    public OrdenDTO createOrden(OrdenDTO ordenDTO) {
        Orden orden = ordenMapper.toEntity(ordenDTO);
        Orden savedOrden = ordenRepository.save(orden);
        return ordenMapper.toDto(savedOrden);
    }

    @Override
    public OrdenDTO getOrdenById(Long id_orden) {
        Orden orden = ordenRepository.findById(id_orden)
            .orElseThrow(()-> new RuntimeException("Orden no encontrada"));
        return ordenMapper.toDto(orden);
    }

    @Override
    public List<OrdenDTO> getAllOrden() {
        List<Orden> ordenes = ordenRepository.findAll();
        return ordenes.stream()
                .map(ordenMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public OrdenDTO updateProducto(Long id_orden, OrdenDTO ordenDTO) {
        Orden orden = ordenRepository.findById(id_orden)
            .orElseThrow(()-> new RuntimeException("Orden no encontrada"));
        orden.setComentario(ordenDTO.getComentario());
        orden.setEstado_orden(ordenDTO.getEstado_orden());
        java.util.Date fechaUtil = ordenDTO.getFecha_hora();
        java.sql.Date fechaSql = new java.sql.Date(fechaUtil.getTime());
        orden.setFecha_hora(fechaSql);
        orden.setMetodo_pago(ordenDTO.getMetodo_pago());
        orden.setNumero(ordenDTO.getNumero());
        orden.setId_orden(ordenDTO.getId_orden());
        orden.setId_usuario(ordenMapper.map(ordenDTO.getId_usuario()));
        orden.setProductos(ordenDTO.getProductos());
        Orden updateOrden = ordenRepository.save(orden);
        return ordenMapper.toDto(updateOrden);

    }

    @Override
    public void deleteOrden(Long id_orden) {
        Orden orden = ordenRepository.findById(id_orden)
            .orElseThrow(()-> new RuntimeException("Orden no encontrada"));
        ordenRepository.delete(orden);
    }


    
}
