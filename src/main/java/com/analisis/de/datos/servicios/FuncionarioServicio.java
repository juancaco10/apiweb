package com.analisis.de.datos.servicios;

import com.analisis.de.datos.modelos.Funcionario;
import com.analisis.de.datos.repositorios.FuncionarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioServicio {

    @Autowired
    private FuncionarioRepositorio funcionarioRepositorio;

    public List<Funcionario> obtenerTodosLosFuncionarios() {
        return funcionarioRepositorio.findAll();
    }

    // Métodos adicionales para análisis de datos, como obtener funcionarios por división
}
