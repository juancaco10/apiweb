package com.analisis.de.datos.repositorios;

import com.analisis.de.datos.modelos.EstadoReporte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoReporteRepositorio extends JpaRepository<EstadoReporte, Integer> {
}
