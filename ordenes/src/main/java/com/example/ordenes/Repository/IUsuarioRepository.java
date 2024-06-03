package com.example.ordenes.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ordenes.Model.Usuario;
import java.util.Optional;




@Repository
public interface IUsuarioRepository extends JpaRepository <Usuario, Long> {
    
    Optional<Usuario> findByUsername(String username);
}

