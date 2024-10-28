package com.analisis.de.datos.repositorios;

import com.analisis.de.datos.modelos.PersonalTarea;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonalTareaRepositorio extends JpaRepository<PersonalTarea, Integer> {
}
