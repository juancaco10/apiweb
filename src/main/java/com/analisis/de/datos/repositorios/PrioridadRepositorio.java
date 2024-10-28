package com.analisis.de.datos.repositorios;

import com.analisis.de.datos.modelos.Prioridad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrioridadRepositorio extends JpaRepository<Prioridad, Integer> {
}
