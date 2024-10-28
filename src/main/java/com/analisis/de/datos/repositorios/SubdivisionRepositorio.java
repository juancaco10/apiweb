package com.analisis.de.datos.repositorios;

import com.analisis.de.datos.modelos.Subdivision;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubdivisionRepositorio extends JpaRepository<Subdivision, Integer> {
}
