package com.analisis.de.datos.servicios;

import com.analisis.de.datos.modelos.Rol;
import com.analisis.de.datos.repositorios.RolRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolServicio {

    @Autowired
    private RolRepositorio rolRepositorio;

    public List<Rol> obtenerTodosLosRoles() {
        return rolRepositorio.findAll();
    }
}
