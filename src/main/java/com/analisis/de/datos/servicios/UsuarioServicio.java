package com.analisis.de.datos.servicios;

import com.analisis.de.datos.modelos.Usuario;
import com.analisis.de.datos.repositorios.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.time.LocalDate;

@Service
public class UsuarioServicio {

    @Autowired
    private UsuarioRepositorio usuarioRepositorio;

    public List<Usuario> obtenerTodosLosUsuarios() {
        return usuarioRepositorio.findAll();
    }

    public List<Usuario> obtenerUsuariosPorNombre(String nombre) {
        return usuarioRepositorio.findUsuariosPorNombre(nombre);
    }

    public List<Usuario> obtenerUsuariosPorNombreParcial(String nombre) {
        return usuarioRepositorio.findUsuariosPorNombreParcial(nombre);
    }

    // Método para contar usuarios por rango de edad para el mes actual
    public Long contarUsuariosPorRangoDeEdadYFecha(int edadMinima, int edadMaxima, LocalDate fechaInicio, LocalDate fechaFin) {
        return usuarioRepositorio.contarUsuariosPorRangoDeEdadYFecha(edadMinima, edadMaxima, fechaInicio, fechaFin);
    }

    // Método para contar usuarios por género para el mes actual
    public Long contarUsuariosPorGeneroYFecha(String genero, LocalDate fechaInicio, LocalDate fechaFin) {
        return usuarioRepositorio.contarUsuariosPorGeneroYFecha(genero, fechaInicio, fechaFin);
    }

    public List<Usuario> obtenerUsuariosPorUbicacion(String pais, String ciudad, String barrio) {
        return usuarioRepositorio.findUsuariosPorUbicacion(pais, ciudad, barrio);
    }

    public List<Usuario> obtenerUsuariosPorPuntajeMayorQue(int puntajeMinimo) {
        return usuarioRepositorio.findUsuariosPorPuntajeMayorQue(puntajeMinimo);
    }

    public List<Usuario> findUsuariosConReportesPorBarrioYFecha(String barrio, LocalDate fechaInicio, LocalDate fechaFin) {
        return usuarioRepositorio.findUsuariosConReportesPorBarrioYFecha(barrio, fechaInicio, fechaFin);
    }

    // Obtener la cantidad de usuarios por rangos de edad para el mes actual
    public Map<String, Long> obtenerCantidadUsuariosPorRangosDeEdadMesActual(LocalDate fechaInicio, LocalDate fechaFin) {
        Map<String, Long> resultado = new HashMap<>();
        resultado.put("18-25", usuarioRepositorio.contarUsuariosPorRangoDeEdadYFecha(18, 25, fechaInicio, fechaFin));
        resultado.put("26-35", usuarioRepositorio.contarUsuariosPorRangoDeEdadYFecha(26, 35, fechaInicio, fechaFin));
        resultado.put("36-45", usuarioRepositorio.contarUsuariosPorRangoDeEdadYFecha(36, 45, fechaInicio, fechaFin));
        resultado.put("46-55", usuarioRepositorio.contarUsuariosPorRangoDeEdadYFecha(46, 55, fechaInicio, fechaFin));
        resultado.put("56-65", usuarioRepositorio.contarUsuariosPorRangoDeEdadYFecha(56, 65, fechaInicio, fechaFin));
        resultado.put("66+", usuarioRepositorio.contarUsuariosPorRangoDeEdadYFecha(66, 150, fechaInicio, fechaFin));
        return resultado;
    }
}
