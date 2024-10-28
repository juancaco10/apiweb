package com.analisis.de.datos.controladores;

import com.analisis.de.datos.modelos.Division;
import com.analisis.de.datos.servicios.DivisionServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/divisiones")
public class DivisionControlador {

    @Autowired
    private DivisionServicio divisionServicio;

    @GetMapping
    public List<Division> obtenerTodasLasDivisiones() {
        return divisionServicio.obtenerTodasLasDivisiones();
    }
}
