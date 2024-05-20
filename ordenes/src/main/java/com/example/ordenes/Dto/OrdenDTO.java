package com.example.ordenes.Dto;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class OrdenDTO {
        private long id;


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
    long id,
    @NotNull(message = "ingrese un numero")@Size(min = 1)int numero,
    @NotNull(message = "ingrese estado de orden")@Size(min = 1)String estado_orden,
    @NotNull(message = "ingrese fecha_hora")@Size(min = 1)Date fecha_hora,
    String comentario,
    @NotNull(message = "ingrese metodo_pago")@Size(min = 1)String metodo_pago
    ){
        this.id=id;
        this.numero=numero;
        this.estado_orden=estado_orden;
        this.fecha_hora=fecha_hora;
        this.comentario=comentario;
        this.metodo_pago=metodo_pago;
        
    }
    public void setNumero(int numero){
        this.numero=numero;
    }
    public void setEstadoOrden(String estado_orden){
        this.estado_orden=estado_orden;
    }
    public void setFechaHora(Date fecha_hora){
        this.fecha_hora=fecha_hora;
    }
    public void setComentario(String comentario){
        this.comentario=comentario;
    }
    public void setMetodoPago(String metodo_pago){
        this.metodo_pago=metodo_pago;
    }

    public int getNumero(){
        return this.numero;
    }
    public String getEstadoOrden(){
        return this.estado_orden;
    }
    public Date getFechaHora(){
        return this.fecha_hora;
    }
    public String getComentario(){
        return this.comentario;
    }
    public String getMetodoPago(){
        return this.metodo_pago;
    }

    public long getId(){
        return this.id;
    }
}

