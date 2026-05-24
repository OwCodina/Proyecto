package models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "premios")
public class Premio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "torneo_id")
    private Long torneoId;

    private Integer posicion;
    private String descripcion;
    private Double valor;
    private String estado;
}
