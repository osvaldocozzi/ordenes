package com.example.ordenes.Auth;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.ordenes.JWT.JwtService;
import com.example.ordenes.Model.Rol;
import com.example.ordenes.Model.Usuario;
import com.example.ordenes.Repository.IUsuarioRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor

public class AuthService {


    private final IUsuarioRepository usuarioRepository;

    private final JwtService jwtService;
    private final PasswordEncoder passwordEncoder;
    private final AuthenticationManager authenticationManager;

    public AuthResponse login(LoginRequest request) {

        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword()));
        UserDetails usuario = usuarioRepository.findByUsername(request.getUsername()).orElseThrow();
        String token= jwtService.getToken(usuario);

        return AuthResponse.builder()
            .token(token)
            .build();
        
    }

    public AuthResponse register(RegisterRequest request) {

        Usuario usuario = Usuario.builder()
            .username(request.getUsername())
            .password(passwordEncoder.encode(request.getPassword()))
            .nombre(request.getNombre())
            .apellido(request.getApellido())
            .correo(request.getCorreo())
            .domicilio(request.getDomicilio())
            .horario(request.getHorario())
            .telefono(request.getTelefono())
            .rol(Rol.USER)
            .build();

            usuarioRepository.save(usuario);

            return AuthResponse.builder()
                .token(jwtService.getToken(usuario))
                .build();
        }
    }


