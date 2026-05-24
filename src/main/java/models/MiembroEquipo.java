package models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "miembros_equipo")
public class MiembroEquipo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "equipo_id", nullable = false)
    private Equipo equipo;

    @Column(name = "usuario_id", nullable = false)
    private Long usuarioId;

    @Column(name = "rol_dentro_equipo")
    private String rolDentroEquipo;
}
