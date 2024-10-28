package com.analisis.de.datos.utilidades;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ConversorFecha {

    public static LocalDate convertirCadenaAFecha(String fecha) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return LocalDate.parse(fecha, formatter);
    }
}
