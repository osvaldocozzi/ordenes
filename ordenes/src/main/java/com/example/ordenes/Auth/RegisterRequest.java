package com.example.ordenes.Auth;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {
    
    private long id_usuario;
    private String nombre;
    private String apellido;
    private String correo;
    private String username;
    private String password;
    private String domicilio;
    private String horario;
    private int telefono;
}
