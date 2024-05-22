package com.example.ordenes.Model;

import javax.persistence.*;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
@Table(name = "producto")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id_producto")
    private long id_producto;

    @Column(name ="nombre")
    private String nombre;

    @Column(name ="precio")
    private int precio;

    @Column(name ="cantidad")
    private int cantidad;

    @Column(name ="categoria")
    private String categoria;

    @Column(name ="disponibilidad")
    private String disponibilidad;

    @ManyToOne
    @JoinColumn(name = "id_usuario", referencedColumnName = "id_usuario")
    private Usuario id_usuario;
}

