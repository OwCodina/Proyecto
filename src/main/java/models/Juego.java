package models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "juegos")
public class Juego {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String nombre;

    private String genero;
    private String modalidad;

    @Column(name = "jugadores_por_equipo")
    private Integer jugadoresPorEquipo;

    private String estado;
}
