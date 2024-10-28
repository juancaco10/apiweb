package com.analisis.de.datos.controladores;

import com.analisis.de.datos.modelos.Funcionario;
import com.analisis.de.datos.servicios.FuncionarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/funcionarios")
public class FuncionarioControlador {

    @Autowired
    private FuncionarioServicio funcionarioServicio;

    @GetMapping
    public List<Funcionario> obtenerTodosLosFuncionarios() {
        return funcionarioServicio.obtenerTodosLosFuncionarios();
    }

    // Métodos adicionales para obtener funcionarios por división o rol
}
