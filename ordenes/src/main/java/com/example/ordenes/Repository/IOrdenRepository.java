package com.example.ordenes.Repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.ordenes.Model.Orden;



@Repository
public interface IOrdenRepository extends JpaRepository <Orden, Long> {
   

    @Query("SELECT o FROM Orden o WHERE FUNCTION('DATE', o.fecha_hora) = :fecha")
    List<Orden> findByFechaOrden(@Param("fecha") Date fecha);
}
