package com.example.ordenes.Dto;


import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.example.ordenes.Model.Rol;

public class UsuarioDTO {
        private long id_usuario;


    @NotNull(message = "ingrese un nombre")
    @Size(min = 1)
    private String nombre;

    @NotNull(message = "ingrese un apellido")
    @Size(min = 1)
    private String apellido;

    @NotNull(message = "ingrese una correo")
    @Size(min = 1)
    private String correo;


    @NotNull(message = "ingrese un nombre de usuario")
    @Size(min = 1)
    private String username;

    @NotNull(message = "ingrese un a contrasenia")
    @Size(min = 1)
    private String password;

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
    private Rol rol;

    public UsuarioDTO(){

    }

    
    public UsuarioDTO(
    long id_usuario,
    @NotNull(message = "ingrese un nombre") @Size(min = 1)String nombre,
    @NotNull(message = "ingrese un apellido") @Size(min = 1)String apellido,
    @NotNull(message = "ingrese un correo") @Size(min = 1)String correo,
    @NotNull(message = "ingrese un username") @Size(min = 1)String username,
    @NotNull(message = "ingrese un password") @Size(min = 1)String password,
    @NotNull(message = "ingrese una domicilio")@Size(min = 1) String domicilio,
    @NotNull(message = "ingrese la horario")@Size(min = 1)String horario,
    @NotNull(message = "ingrese la telefono")@Size(min = 1)int telefono,
    @NotNull(message = "ingrese la rol")@Size(min = 1)Rol rol
    ){
        this.id_usuario=id_usuario;
        this.nombre=nombre;
        this.apellido=apellido;
        this.correo=correo;
        this.username=username;
        this.password=password;
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
    public void setUsername(String username){
        this.username=username;
    }
    public void setPassword(String password){
        this.password=password;
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
    public void setRol(Rol rol){
        this.rol=rol;
    }
    public void setId_usuario(long id_usuario) {
        this.id_usuario = id_usuario;
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
    public String getUsername(){
        return this.username;
    }
    public String getPassword(){
        return this.password;
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
    
    public Rol getRol(){
        return this.rol;
    }
    public long getId_usuario(){
        return this.id_usuario;
    }

}