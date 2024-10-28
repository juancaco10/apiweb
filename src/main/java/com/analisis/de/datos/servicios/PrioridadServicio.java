package com.analisis.de.datos.servicios;

import com.analisis.de.datos.modelos.Prioridad;
import com.analisis.de.datos.repositorios.PrioridadRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrioridadServicio {

    @Autowired
    private PrioridadRepositorio prioridadRepositorio;

    public List<Prioridad> obtenerTodasLasPrioridades() {
        return prioridadRepositorio.findAll();
    }
}
