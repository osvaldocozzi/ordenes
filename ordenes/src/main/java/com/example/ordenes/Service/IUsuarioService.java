package com.example.ordenes.Service;



import com.example.ordenes.Dto.UsuarioDTO;

public interface IUsuarioService {
    
    UsuarioDTO createUsuario(UsuarioDTO usuarioDTO);
    UsuarioDTO getUsuarioById(Long id_usuario);
    UsuarioDTO updateUsuario(Long id_usuario, UsuarioDTO usuarioDTO);
    void deleteProducto(Long id_usuario);
}
