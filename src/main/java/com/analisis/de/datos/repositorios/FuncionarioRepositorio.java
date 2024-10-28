package com.analisis.de.datos.repositorios;

import com.analisis.de.datos.modelos.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncionarioRepositorio extends JpaRepository<Funcionario, Integer> {
    // Métodos adicionales para consultar funcionarios por división, rol, etc.
}
