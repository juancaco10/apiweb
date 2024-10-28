package com.analisis.de.datos.servicios;

import com.analisis.de.datos.modelos.EstadoReporte;
import com.analisis.de.datos.repositorios.EstadoReporteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstadoReporteServicio {

    @Autowired
    private EstadoReporteRepositorio estadoReporteRepositorio;

    public List<EstadoReporte> obtenerTodosLosEstadosDeReporte() {
        return estadoReporteRepositorio.findAll();
    }
}
