package com.example.ordenes.Dto;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.example.ordenes.Model.Producto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class OrdenDTO {
        private long id_orden;
        private long id_usuario;
        private List<Producto> productos;

    @NotNull(message = "ingrese un numero")
    @Size(min = 1)
    private int numero;

    @NotNull(message = "ingrese estado de orden")
    @Size(min = 1)
    private String estado_orden;

    @NotNull(message = "ingrese fecha_hora")
    @Size(min = 1)
    private Date fecha_hora;

    private String comentario;

    @NotNull(message = "ingrese metodo_pago")
    @Size(min = 1)
    private String metodo_pago;

    public OrdenDTO(){

    }

    
    public OrdenDTO(
    long id_orden,
    long id_usuario,
    List<Producto>productos,
    @NotNull(message = "ingrese un numero")@Size(min = 1)int numero,
    @NotNull(message = "ingrese estado de orden")@Size(min = 1)String estado_orden,
    @NotNull(message = "ingrese fecha_hora")@Size(min = 1)Date fecha_hora,
    String comentario,
    @NotNull(message = "ingrese metodo_pago")@Size(min = 1)String metodo_pago
    ){
        this.id_orden=id_orden;
        this.numero=numero;
        this.estado_orden=estado_orden;
        this.fecha_hora=fecha_hora;
        this.comentario=comentario;
        this.metodo_pago=metodo_pago;
        this.id_usuario=id_usuario;
        this.productos=productos;
    }
}

