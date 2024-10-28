package com.analisis.de.datos.servicios;

import com.analisis.de.datos.modelos.Division;
import com.analisis.de.datos.repositorios.DivisionRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DivisionServicio {

    @Autowired
    private DivisionRepositorio divisionRepositorio;

    public List<Division> obtenerTodasLasDivisiones() {
        return divisionRepositorio.findAll();
    }
}
