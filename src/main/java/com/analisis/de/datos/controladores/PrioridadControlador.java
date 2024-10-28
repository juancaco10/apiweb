package com.analisis.de.datos.controladores;

import com.analisis.de.datos.modelos.Prioridad;
import com.analisis.de.datos.servicios.PrioridadServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/prioridades")
public class PrioridadControlador {

    @Autowired
    private PrioridadServicio prioridadServicio;

    @GetMapping
    public List<Prioridad> obtenerTodasLasPrioridades() {
        return prioridadServicio.obtenerTodasLasPrioridades();
    }
}
