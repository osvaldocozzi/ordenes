package com.example.ordenes.Service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.ordenes.Dto.UsuarioDTO;
import com.example.ordenes.Mappers.UsuarioMapper;
import com.example.ordenes.Model.Usuario;
import com.example.ordenes.Repository.IUsuarioRepository;

public class UsuarioService implements IUsuarioService{

    @Autowired
    IUsuarioRepository usuarioRepository;

    @Autowired
    UsuarioMapper usuarioMapper;

    @Override
    public UsuarioDTO createUsuario(UsuarioDTO usuarioDTO) {
        Usuario usuario = usuarioMapper.toEntity(usuarioDTO);
        Usuario savedUsuario = usuarioRepository.save(usuario);
        return usuarioMapper.toDto(savedUsuario);
    }

    @Override
    public UsuarioDTO getUsuarioById(Long id_usuario) {
        Usuario usuario = usuarioRepository.findById(id_usuario)
            .orElseThrow(()-> new RuntimeException("Usuario no encontrada"));
        return usuarioMapper.toDto(usuario);
    }

    @Override
    public UsuarioDTO updateUsuario(Long id_usuario, UsuarioDTO usuarioDTO) {
        
        Usuario usuario= usuarioRepository.findById(id_usuario)
            .orElseThrow(()-> new RuntimeException("Usuario no encontrada"));
        usuario.setApellido(usuarioDTO.getApellido());
        usuario.setCorreo(usuarioDTO.getCorreo());
        usuario.setDomicilio(usuarioDTO.getDomicilio());
        usuario.setHorario(usuarioDTO.getHorario());
        usuario.setNombre(usuarioDTO.getNombre());
        usuario.setRol(usuarioDTO.getRol());
        usuario.setTelefono(usuarioDTO.getTelefono());
        usuario.setId_usuario(usuarioDTO.getId());
        Usuario updateUsuario = usuarioMapper.toEntity(usuarioDTO);
        return usuarioMapper.toDto(updateUsuario);
    }

    @Override
    public void deleteProducto(Long id_usuario) {
        Usuario usuario = usuarioRepository.findById(id_usuario)
            .orElseThrow(()-> new RuntimeException("Usuario no encontrada"));
        usuarioRepository.delete(usuario);
    }
    
}
