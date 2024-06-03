package com.example.ordenes.Model;

import java.util.Collection;
import java.util.List;

import javax.management.relation.Role;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
@Table(name = "usuario", uniqueConstraints = @UniqueConstraint( columnNames = "correo"))
public class Usuario implements UserDetails{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id_usuario")
    private long id_usuario;

    @Column(name ="nombre")
    private String nombre;

    @Column(name ="apellido")
    private String apellido;

    @Column(name ="correo")
    private String correo;

    @Column(name = "username")
    private String username;

    @Column(name="password")
    private String password;

    @Column(name ="domicilio")
    private String domicilio;

    @Column(name ="horario")
    private String horario;
    
    @Column(name ="telefono")
    private int telefono;

    @Enumerated(EnumType.STRING)
    @Column(name ="rol")
    private Rol rol;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority((rol.name())));
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
