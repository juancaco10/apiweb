package com.analisis.de.datos.servicios;

import com.analisis.de.datos.modelos.PersonalTarea;
import com.analisis.de.datos.repositorios.PersonalTareaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonalTareaServicio {

    @Autowired
    private PersonalTareaRepositorio personalTareaRepositorio;

    public List<PersonalTarea> obtenerTodoElPersonalEnTareas() {
        return personalTareaRepositorio.findAll();
    }
}
