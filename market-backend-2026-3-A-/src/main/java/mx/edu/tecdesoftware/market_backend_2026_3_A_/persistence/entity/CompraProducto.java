package mx.edu.tecdesoftware.market_backend_2026_3_A_.persistence.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table (name = "compras_productos")

public class CompraProducto {

    @EmbeddedId
    private CompraProductoPK id;
    private Integer cantidad;
    private Boolean estado;
    private Double total;
}
