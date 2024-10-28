package com.analisis.de.datos.modelos;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "estado_reporte")
public class EstadoReporte {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_estado_reporte")
    private Integer id;

    @Column(name = "estado")
    private String estado;

    @OneToMany(mappedBy = "estadoReporte", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Reporte> reportes;

    // Getters y Setters
}
