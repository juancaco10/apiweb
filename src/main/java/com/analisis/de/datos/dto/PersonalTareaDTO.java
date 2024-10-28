package com.analisis.de.datos.dto;

public class PersonalTareaDTO {

    private Integer id;
    private Integer funcionarioId; // Referencia al ID de Funcionario
    private Integer tareaId;       // Referencia al ID de Tarea

    // Constructor por defecto
    public PersonalTareaDTO() {
    }

    // Constructor con parámetros
    public PersonalTareaDTO(Integer id, Integer funcionarioId, Integer tareaId) {
        this.id = id;
        this.funcionarioId = funcionarioId;
        this.tareaId = tareaId;
    }

    // Getters y Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFuncionarioId() {
        return funcionarioId;
    }

    public void setFuncionarioId(Integer funcionarioId) {
        this.funcionarioId = funcionarioId;
    }

    public Integer getTareaId() {
        return tareaId;
    }

    public void setTareaId(Integer tareaId) {
        this.tareaId = tareaId;
    }

    @Override
    public String toString() {
        return "PersonalTareaDTO{" +
                "id=" + id +
                ", funcionarioId=" + funcionarioId +
                ", tareaId=" + tareaId +
                '}';
    }
}
