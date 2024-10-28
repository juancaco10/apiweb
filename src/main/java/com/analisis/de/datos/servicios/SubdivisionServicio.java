package com.analisis.de.datos.servicios;

import com.analisis.de.datos.modelos.Subdivision;
import com.analisis.de.datos.repositorios.SubdivisionRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubdivisionServicio {

    @Autowired
    private SubdivisionRepositorio subdivisionRepositorio;

    public List<Subdivision> obtenerTodasLasSubdivisiones() {
        return subdivisionRepositorio.findAll();
    }
}
