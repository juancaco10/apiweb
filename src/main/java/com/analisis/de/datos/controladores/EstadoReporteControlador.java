package com.analisis.de.datos.controladores;

import com.analisis.de.datos.modelos.EstadoReporte;
import com.analisis.de.datos.servicios.EstadoReporteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/estado-reportes")
public class EstadoReporteControlador {

    @Autowired
    private EstadoReporteServicio estadoReporteServicio;

    @GetMapping
    public List<EstadoReporte> obtenerTodosLosEstadosDeReporte() {
        return estadoReporteServicio.obtenerTodosLosEstadosDeReporte();
    }
}
