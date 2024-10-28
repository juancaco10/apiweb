package com.analisis.de.datos.controladores;

import com.analisis.de.datos.modelos.Subdivision;
import com.analisis.de.datos.servicios.SubdivisionServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/subdivisiones")
public class SubdivisionControlador {

    @Autowired
    private SubdivisionServicio subdivisionServicio;

    @GetMapping
    public List<Subdivision> obtenerTodasLasSubdivisiones() {
        return subdivisionServicio.obtenerTodasLasSubdivisiones();
    }
}
