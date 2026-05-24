package models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "rankings")
public class Ranking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "torneo_id")
    private Long torneoId;

    @Column(name = "participante_id")
    private Long participanteId;

    private Integer puntos;
    private Integer victorias;
    private Integer derrotas;
    private Integer diferencia;
    private Integer posicion;
}
