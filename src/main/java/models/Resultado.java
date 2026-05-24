package models;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "resultados")
public class Resultado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "partida_id", unique = true)
    private Long partidaId;

    @Column(name = "ganador_id")
    private Long ganadorId;

    @Column(name = "puntaje_a")
    private Integer puntajeA;

    @Column(name = "puntaje_b")
    private Integer puntajeB;

    @Column(name = "estado_validacion")
    private String estadoValidacion;

    @Column(name = "fecha_registro")
    private LocalDateTime fechaRegistro;

    @PrePersist
    protected void onCreate() {
        this.fechaRegistro = LocalDateTime.now();
    }
}
