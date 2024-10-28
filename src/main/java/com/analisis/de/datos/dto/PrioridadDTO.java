package com.analisis.de.datos.dto;

public class PrioridadDTO {

    private Integer id;
    private String tipo;

    // Constructor por defecto
    public PrioridadDTO() {
    }

    // Constructor con parámetros
    public PrioridadDTO(Integer id, String tipo) {
        this.id = id;
        this.tipo = tipo;
    }

    // Getters y Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "PrioridadDTO{" +
                "id=" + id +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
