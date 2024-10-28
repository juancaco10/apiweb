package com.analisis.de.datos.repositorios;

import com.analisis.de.datos.modelos.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface UsuarioRepositorio extends JpaRepository<Usuario, Long> {

    // Consulta para buscar usuarios por nombre exacto
    @Query("SELECT u FROM Usuario u WHERE u.nombre = :nombre")
    List<Usuario> findUsuariosPorNombre(@Param("nombre") String nombre);

    // Consulta para buscar usuarios por coincidencia parcial en el nombre
    @Query("SELECT u FROM Usuario u WHERE u.nombre LIKE %:nombre%")
    List<Usuario> findUsuariosPorNombreParcial(@Param("nombre") String nombre);

    // Contar usuarios por rango de edad y fecha
    @Query("SELECT COUNT(DISTINCT u) " +
           "FROM Reporte r JOIN r.usuario u " +
           "WHERE TIMESTAMPDIFF(YEAR, u.fechaNacimiento, CURRENT_DATE) BETWEEN :edadMinima AND :edadMaxima " +
           "AND r.fecha BETWEEN :fechaInicio AND :fechaFin")
    Long contarUsuariosPorRangoDeEdadYFecha(@Param("edadMinima") int edadMinima, 
                                            @Param("edadMaxima") int edadMaxima,
                                            @Param("fechaInicio") LocalDate fechaInicio,
                                            @Param("fechaFin") LocalDate fechaFin);

    // Contar usuarios por género y fecha
    @Query("SELECT COUNT(u) FROM Usuario u JOIN u.reportes r WHERE u.genero = :genero AND r.fecha BETWEEN :fechaInicio AND :fechaFin")
    Long contarUsuariosPorGeneroYFecha(@Param("genero") String genero, 
                                       @Param("fechaInicio") LocalDate fechaInicio, 
                                       @Param("fechaFin") LocalDate fechaFin);

    // Buscar usuarios por ubicación
    @Query("SELECT u FROM Usuario u WHERE u.pais = :pais AND u.ciudad = :ciudad AND u.barrio = :barrio")
    List<Usuario> findUsuariosPorUbicacion(@Param("pais") String pais, @Param("ciudad") String ciudad, @Param("barrio") String barrio);

    // Buscar usuarios con puntaje mayor a un valor dado
    @Query("SELECT u FROM Usuario u WHERE u.puntaje >= :puntajeMinimo")
    List<Usuario> findUsuariosPorPuntajeMayorQue(@Param("puntajeMinimo") int puntajeMinimo);

    // Consultar usuarios con reportes por barrio y fecha
    @Query("SELECT u FROM Usuario u JOIN u.reportes r WHERE u.barrio = :barrio AND r.fecha BETWEEN :fechaInicio AND :fechaFin")
    List<Usuario> findUsuariosConReportesPorBarrioYFecha(@Param("barrio") String barrio,
                                                         @Param("fechaInicio") LocalDate fechaInicio,
                                                         @Param("fechaFin") LocalDate fechaFin);
}
