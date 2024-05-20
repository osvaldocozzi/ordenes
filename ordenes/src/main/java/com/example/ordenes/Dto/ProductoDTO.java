package com.example.ordenes.Dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class ProductoDTO {
    
    private long id;


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

    public ProductoDTO(){

    }

    
    public ProductoDTO(
    long id,
    @NotNull(message = "ingrese un nombre") @Size(min = 1)String nombre,
    @NotNull(message = "ingrese un precio")@Size(min = 1) int precio,
    @NotNull(message = "ingrese una cantidad")@Size(min = 1)int cantidad,
    @NotNull(message = "ingrese una categoria")@Size(min = 1) String categoria,
    @NotNull(message = "ingrese la disponibilidad")@Size(min = 1)String disponibilidad
    ){
        this.id=id;
        this.nombre=nombre;
        this.precio=precio;
        this.cantidad=cantidad;
        this.categoria=categoria;
        this.disponibilidad=disponibilidad;
        
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setPrecio(int precio){
        this.precio=precio;
    }
    public void setCantidad(int cantidad){
        this.cantidad=cantidad;
    }
    public void setCategoria(String categoria){
        this.categoria=categoria;
    }
    public void setDisponibilidad(String disponibilidad){
        this.disponibilidad=disponibilidad;
    }

    public String getNombre(){
        return this.nombre;
    }
    public int getPrecio(){
        return this.precio;
    }
    public int getCantidad(){
        return this.cantidad;
    }
    public String getCategoria(){
        return this.categoria;
    }
    public String getDisponibilidad(){
        return this.disponibilidad;
    }

    public long getId(){
        return this.id;
    }
}
