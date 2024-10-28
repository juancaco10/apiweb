package com.analisis.de.datos.controladores;

import com.analisis.de.datos.modelos.Rol;
import com.analisis.de.datos.servicios.RolServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/roles")
public class RolControlador {

    @Autowired
    private RolServicio rolServicio;

    @GetMapping
    public List<Rol> obtenerTodosLosRoles() {
        return rolServicio.obtenerTodosLosRoles();
    }
}
