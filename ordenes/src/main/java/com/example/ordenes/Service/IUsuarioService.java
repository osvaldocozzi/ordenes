package com.example.ordenes.Service;



import java.util.List;

import com.example.ordenes.Dto.UsuarioDTO;

public interface IUsuarioService {
    
    UsuarioDTO createUsuario(UsuarioDTO usuarioDTO);
    UsuarioDTO getUsuarioById(Long id_usuario);
    UsuarioDTO updateUsuario(Long id_usuario, UsuarioDTO usuarioDTO);
    void deleteUsuario(Long id_usuario);
    List<UsuarioDTO> getAllUsuarios();
}
