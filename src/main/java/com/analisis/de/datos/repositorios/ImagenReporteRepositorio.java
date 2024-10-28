package com.analisis.de.datos.repositorios;

import com.analisis.de.datos.modelos.ImagenReporte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ImagenReporteRepositorio extends JpaRepository<ImagenReporte, Integer> {
    List<ImagenReporte> findByReporteId(Integer reporteId);
}
