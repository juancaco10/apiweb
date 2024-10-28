
package com.analisis.de.datos.dto;

public class EstadoReporteDTO {

    private Integer id;
    private String estado;

    // Constructor por defecto
    public EstadoReporteDTO() {
    }

    // Constructor con parámetros
    public EstadoReporteDTO(Integer id, String estado) {
        this.id = id;
        this.estado = estado;
    }

    // Getters y Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "EstadoReporteDTO{" +
                "id=" + id +
                ", estado='" + estado + '\'' +
                '}';
    }
}
