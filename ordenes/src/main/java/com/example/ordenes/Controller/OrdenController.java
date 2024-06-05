package com.example.ordenes.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ordenes.Dto.OrdenDTO;
import com.example.ordenes.Service.OrdenService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/ordenes")
public class OrdenController {
    
    @Autowired
    private OrdenService ordenService;

    @PostMapping
    public ResponseEntity<OrdenDTO> createOrden(@RequestBody OrdenDTO ordenDTO) {
        OrdenDTO createdOrden = ordenService.createOrden(ordenDTO);
        return ResponseEntity.ok(createdOrden);
    }
    
     @GetMapping("/{id}")
    public ResponseEntity<OrdenDTO> getOrdenById(@PathVariable Long id) {
        OrdenDTO orden = ordenService.getOrdenById(id);
        return ResponseEntity.ok(orden);
    }

    @GetMapping
    public ResponseEntity<List<OrdenDTO>> getAllOrden() {
        List<OrdenDTO> orden = ordenService.getAllOrden();
        return ResponseEntity.ok(orden);
    }

    @PutMapping("/{id}")
    public ResponseEntity<OrdenDTO> updateOrden(@PathVariable Long id, @RequestBody OrdenDTO ordenDTO) {
        OrdenDTO updatedOrden = ordenService.updateOrden(id, ordenDTO);
        return ResponseEntity.ok(updatedOrden);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteOrden(@PathVariable Long id) {
        ordenService.deleteOrden(id);
        return ResponseEntity.noContent().build();
}
}
