package com.example.ordenes.Dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UsuarioDTO {
        private long id;


    @NotNull(message = "ingrese un nombre")
    @Size(min = 1)
    private String nombre;

    @NotNull(message = "ingrese un apellido")
    @Size(min = 1)
    private String apellido;

    @NotNull(message = "ingrese una correo")
    @Size(min = 1)
    private String correo;

    @NotNull(message = "ingrese un domicilio")
    @Size(min = 1)
    private String domicilio;

    @NotNull(message = "ingrese el horario")
    @Size(min = 1)
    private String horario;

    @NotNull(message = "ingrese un telefono")
    @Size(min = 1)
    private int telefono;
   
    @NotNull(message = "ingrese el rol")
    @Size(min = 1)
    private String rol;

    public UsuarioDTO(){

    }

    
    public UsuarioDTO(
    long id,
    @NotNull(message = "ingrese un nombre") @Size(min = 1)String nombre,
    @NotNull(message = "ingrese un apellido") @Size(min = 1)String apellido,
    @NotNull(message = "ingrese un correo") @Size(min = 1)String correo,
    @NotNull(message = "ingrese una domicilio")@Size(min = 1) String domicilio,
    @NotNull(message = "ingrese la horario")@Size(min = 1)String horario,
    @NotNull(message = "ingrese la telefono")@Size(min = 1)int telefono,
    @NotNull(message = "ingrese la rol")@Size(min = 1)String rol
    ){
        this.id=id;
        this.nombre=nombre;
        this.apellido=apellido;
        this.correo=correo;
        this.domicilio=domicilio;
        this.horario=horario;
        this.telefono=telefono;
        this.rol=rol;
        
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setApellido(String apellido){
        this.apellido=apellido;
    }
    public void setCorreo(String correo){
        this.correo=correo;
    }
    public void setDomicilio(String domicilio){
        this.domicilio=domicilio;
    }
    public void setHorario(String horario){
        this.horario=horario;
    }
    public void setTelefono(int telefono){
        this.telefono=telefono;
    }
    public void setRol(String rol){
        this.rol=rol;
    }

    public String getNombre(){
        return this.nombre;
    }
    public String getApellido(){
        return this.apellido;
    }
    public String getCorreo(){
        return this.correo;
    }
    public String getDomicilio(){
        return this.domicilio;
    }
    public String getHorario(){
        return this.horario;
    }
    public int getTelefono(){
        return this.telefono;
    }
    
    public String getRol(){
        return this.rol;
    }
    public long getId(){
        return this.id;
    }
}