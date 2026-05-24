package models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "productos")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String marca;
    private String modelo;
    private Double precio;

    @Column(name = "categoria_id")
    private Long categoriaId;

    private String descripcion;
    private String estado;
}
