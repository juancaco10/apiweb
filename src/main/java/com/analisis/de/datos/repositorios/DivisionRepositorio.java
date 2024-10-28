package com.analisis.de.datos.repositorios;

import com.analisis.de.datos.modelos.Division;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DivisionRepositorio extends JpaRepository<Division, Integer> {
}
