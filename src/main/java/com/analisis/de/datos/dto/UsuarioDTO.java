package com.analisis.de.datos.dto;

import java.time.LocalDate;

public class UsuarioDTO {

    private Long id;
    private String nombre;
    private String apellido;
    private String email;
    private String pais;
    private String ciudad;
    private String direccion;
    private String cedula;
    private String telefono;
    private LocalDate fechaNacimiento;
    private String genero;
    private String barrio;
    private String comentarioUsuario;
    private Integer puntaje;
    private String ultimaIp;

    // Constructor por defecto
    public UsuarioDTO() {
    }

    // Constructor con parámetros
    public UsuarioDTO(Long id, String nombre, String apellido, String email, String pais, String ciudad, String direccion,
                      String cedula, String telefono, LocalDate fechaNacimiento, String genero, String barrio,
                      String comentarioUsuario, Integer puntaje, String ultimaIp) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.pais = pais;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.cedula = cedula;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
        this.barrio = barrio;
        this.comentarioUsuario = comentarioUsuario;
        this.puntaje = puntaje;
        this.ultimaIp = ultimaIp;
    }

    // Getters y Setters
    // (Incluye todos los getters y setters aquí)

    @Override
    public String toString() {
        return "UsuarioDTO{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", email='" + email + '\'' +
                ", pais='" + pais + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", direccion='" + direccion + '\'' +
                ", cedula='" + cedula + '\'' +
                ", telefono='" + telefono + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", genero='" + genero + '\'' +
                ", barrio='" + barrio + '\'' +
                ", comentarioUsuario='" + comentarioUsuario + '\'' +
                ", puntaje=" + puntaje +
                ", ultimaIp='" + ultimaIp + '\'' +
                '}';
    }
}
