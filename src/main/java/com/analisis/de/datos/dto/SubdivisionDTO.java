package com.analisis.de.datos.dto;

public class SubdivisionDTO {

    private Integer id;
    private String nombre;
    private Integer divisionId; // Referencia al ID de Division

    // Constructor por defecto
    public SubdivisionDTO() {
    }

    // Constructor con parámetros
    public SubdivisionDTO(Integer id, String nombre, Integer divisionId) {
        this.id = id;
        this.nombre = nombre;
        this.divisionId = divisionId;
    }

    // Getters y Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDivisionId() {
        return divisionId;
    }

    public void setDivisionId(Integer divisionId) {
        this.divisionId = divisionId;
    }

    @Override
    public String toString() {
        return "SubdivisionDTO{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", divisionId=" + divisionId +
                '}';
    }
}
