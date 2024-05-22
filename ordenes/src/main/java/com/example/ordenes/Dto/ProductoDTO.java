package com.example.ordenes.Dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ProductoDTO {
    private long id_producto;
    private long id_usuario;

    @NotNull(message = "ingrese un nombre")
    @Size(min = 1)
    private String nombre;

    @NotNull(message = "ingrese un precio")
    @Size(min = 1)
    private int precio;

    @NotNull(message = "ingrese una cantidad")
    @Size(min = 1)
    private int cantidad;

    @NotNull(message = "ingrese una categoria")
    @Size(min = 1)
    private String categoria;

    @NotNull(message = "ingrese la disponibilidad")
    @Size(min = 1)
    private String disponibilidad;

    public ProductoDTO() {}

    public ProductoDTO(long id_producto, long id_usuario, @NotNull @Size(min = 1) String nombre,
                       @NotNull @Size(min = 1) int precio, @NotNull @Size(min = 1) int cantidad,
                       @NotNull @Size(min = 1) String categoria, @NotNull @Size(min = 1) String disponibilidad) {
        this.id_producto = id_producto;
        this.id_usuario = id_usuario;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria = categoria;
        this.disponibilidad = disponibilidad;
    }
}
