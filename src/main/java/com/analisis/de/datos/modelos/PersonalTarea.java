package com.analisis.de.datos.modelos;

import jakarta.persistence.*;

@Entity
@Table(name = "personal_tarea")
public class PersonalTarea {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_personal_tarea")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_funcionario")
    private Funcionario funcionario;

    @ManyToOne
    @JoinColumn(name = "id_tarea")
    private Tarea tarea;

    // Getters y Setters
}
