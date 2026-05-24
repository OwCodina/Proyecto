package models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "inventarios")
public class Inventario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "producto_id")
    private Long productoId;

    @Column(name = "stock_disponible")
    private Integer stockDisponible;

    @Column(name = "stock_reservado")
    private Integer stockReservado;

    @Column(name = "stock_minimo")
    private Integer stockMinimo;

    private String ubicacion;
}
