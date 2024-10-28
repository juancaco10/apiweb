package com.analisis.de.datos.repositorios;

import com.analisis.de.datos.modelos.ImagenReporte;
import com.analisis.de.datos.modelos.Reporte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ReporteRepositorio extends JpaRepository<Reporte, Integer> {

    // Obtener el número de reportes por barrio ordenados de mayor a menor
    @Query("SELECT r.barrio, COUNT(r) FROM Reporte r WHERE r.fecha BETWEEN :startOfMonth AND :endOfMonth AND r.division.id = :divisionId AND r.subdivision.id = :subdivisionId GROUP BY r.barrio ORDER BY COUNT(r) DESC")
    List<Object[]> countReportesByBarrioOrdenado(LocalDate startOfMonth, LocalDate endOfMonth, Integer divisionId, Integer subdivisionId);

    // Obtener el número de usuarios únicos por género
    @Query("SELECT u.genero, COUNT(DISTINCT u.id) FROM Reporte r JOIN r.usuario u WHERE r.fecha BETWEEN :startOfMonth AND :endOfMonth AND r.division.id = :divisionId AND r.subdivision.id = :subdivisionId GROUP BY u.genero")
    List<Object[]> countUsuariosUnicosPorGenero(LocalDate startOfMonth, LocalDate endOfMonth, Integer divisionId, Integer subdivisionId);

    // Obtener el número de usuarios por rango de edad
    @Query("SELECT " +
           "CASE " +
           "WHEN u.fechaNacimiento BETWEEN :startDate1 AND :endDate1 THEN '18-25' " +
           "WHEN u.fechaNacimiento BETWEEN :startDate2 AND :endDate2 THEN '26-35' " +
           "WHEN u.fechaNacimiento BETWEEN :startDate3 AND :endDate3 THEN '36-45' " +
           "WHEN u.fechaNacimiento BETWEEN :startDate4 AND :endDate4 THEN '46-55' " +
           "WHEN u.fechaNacimiento BETWEEN :startDate5 AND :endDate5 THEN '56-65' " +
           "ELSE '+66' END AS ageRange, COUNT(DISTINCT u.id) " +  // Contar usuarios únicos
           "FROM Reporte r JOIN r.usuario u " +
           "WHERE r.fecha BETWEEN :startOfMonth AND :endOfMonth " +
           "AND r.division.id = :divisionId AND r.subdivision.id = :subdivisionId " +
           "GROUP BY ageRange")
    List<Object[]> countReportesByAgeRange(LocalDate startOfMonth, LocalDate endOfMonth, 
                                           LocalDate startDate1, LocalDate endDate1,
                                           LocalDate startDate2, LocalDate endDate2,
                                           LocalDate startDate3, LocalDate endDate3,
                                           LocalDate startDate4, LocalDate endDate4,
                                           LocalDate startDate5, LocalDate endDate5,
                                           Integer divisionId, Integer subdivisionId);
    
    
    @Query("SELECT r.geolocalizacion FROM Reporte r WHERE r.geolocalizacion IS NOT NULL")
    List<String> findGeolocalizaciones();

    
    
    
    
       
        // Obtener geolocalizaciones junto con descripciones, estado, e idReporte
        @Query("SELECT r.geolocalizacion, r.descripcion, r.estadoReporte.id, r.id FROM Reporte r WHERE r.geolocalizacion IS NOT NULL")
        List<Object[]> findGeolocalizacionesConDetalles();
    

    
    

}
