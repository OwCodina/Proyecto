package models;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "inscripciones")
public class Inscripcion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "torneo_id")
    private Long torneoId;

    @Column(name = "equipo_id")
    private Long equipoId;

    @Column(name = "jugador_id")
    private Long jugadorId;

    @Column(name = "tipo_participante")
    private String tipoParticipante;

    private String estado;

    @Column(name = "fecha_inscripcion")
    private LocalDateTime fechaInscripcion;

    @PrePersist
    protected void onCreate() {
        this.fechaInscripcion = LocalDateTime.now();
    }
}
