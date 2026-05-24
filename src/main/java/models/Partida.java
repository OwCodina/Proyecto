package models;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "partidas")
public class Partida {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "torneo_id")
    private Long torneoId;

    @Column(name = "participante_a_id")
    private Long participanteAId;

    @Column(name = "participante_b_id")
    private Long participanteBId;

    private Integer ronda;

    @Column(name = "fecha_hora")
    private LocalDateTime fechaHora;

    private String estado;
}
