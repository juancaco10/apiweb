package com.analisis.de.datos.controladores;

import com.analisis.de.datos.modelos.PersonalTarea;
import com.analisis.de.datos.servicios.PersonalTareaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/personal-tareas")
public class PersonalTareaControlador {

    @Autowired
    private PersonalTareaServicio personalTareaServicio;

    @GetMapping
    public List<PersonalTarea> obtenerTodoElPersonalEnTareas() {
        return personalTareaServicio.obtenerTodoElPersonalEnTareas();
    }
}
