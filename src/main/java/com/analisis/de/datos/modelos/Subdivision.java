package com.analisis.de.datos.modelos;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "subdivision")
public class Subdivision {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_subdivision")
    private Integer id;

    @Column(name = "nombre")
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "id_division")
    private Division division;

    @OneToMany(mappedBy = "subdivision", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Funcionario> funcionarios;

    @OneToMany(mappedBy = "subdivision", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Reporte> reportes;

    // Getters y Setters
}
