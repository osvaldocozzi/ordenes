package com.example.ordenes.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "producto")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name ="id_producto")
    private long id_producto;

    @Column(name ="nombre")
    private String nombre;

    @Column(name ="precio")
    private int precio;

    @Column(name ="cantidad")
    private int cantidad;

    @Column(name ="categoria")
    private String categoria;

    @Column(name ="disponibilidad")
    private String disponibilidad;
    
    // Relación con Usuario
    @ManyToOne
    @JoinColumn(name = "id_usuario", referencedColumnName = "id_usuario")
    private Usuario id_usuario;
}

