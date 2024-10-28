package com.analisis.de.datos.dto;

import java.time.LocalDate;
import java.time.LocalTime;

public class ReporteDTO {

    private Integer id;
    private String descripcion;
    private LocalTime hora;
    private LocalDate fecha;
    private String calle;
    private String entreCalles;
    private String barrio;
    private String comentarioUsuario;
    private Integer puntajeResolucion;
    private String geolocalizacion;
    private String estadoReporte;
    private String prioridad;
    private String usuarioNombre;
    private String usuarioApellido;
    
    
    
    public ReporteDTO(Integer id, String descripcion, String calle, String barrio, String geolocalizacion) {
        this.id = id;
        this.descripcion = descripcion;
        this.calle = calle;
        this.barrio = barrio;
        this.geolocalizacion = geolocalizacion;
    }

    // Getters y Setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getEntreCalles() {
        return entreCalles;
    }

    public void setEntreCalles(String entreCalles) {
        this.entreCalles = entreCalles;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getComentarioUsuario() {
        return comentarioUsuario;
    }

    public void setComentarioUsuario(String comentarioUsuario) {
        this.comentarioUsuario = comentarioUsuario;
    }

    public Integer getPuntajeResolucion() {
        return puntajeResolucion;
    }

    public void setPuntajeResolucion(Integer puntajeResolucion) {
        this.puntajeResolucion = puntajeResolucion;
    }

    public String getGeolocalizacion() {
        return geolocalizacion;
    }

    public void setGeolocalizacion(String geolocalizacion) {
        this.geolocalizacion = geolocalizacion;
    }

    public String getEstadoReporte() {
        return estadoReporte;
    }

    public void setEstadoReporte(String estadoReporte) {
        this.estadoReporte = estadoReporte;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public String getUsuarioNombre() {
        return usuarioNombre;
    }

    public void setUsuarioNombre(String usuarioNombre) {
        this.usuarioNombre = usuarioNombre;
    }

    public String getUsuarioApellido() {
        return usuarioApellido;
    }

    public void setUsuarioApellido(String usuarioApellido) {
        this.usuarioApellido = usuarioApellido;
    }
}
