package com.analisis.de.datos.servicios;

import com.analisis.de.datos.repositorios.ReporteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class ReporteServicio {

    @Autowired
    private ReporteRepositorio reporteRepositorio;

    public Map<String, Object> obtenerDatosParaGraficos(Integer divisionId, Integer subdivisionId) {
        Map<String, Object> result = new HashMap<>();
        
        YearMonth currentMonth = YearMonth.now();
        LocalDate startOfMonth = currentMonth.atDay(1);
        LocalDate endOfMonth = currentMonth.atEndOfMonth();

        List<Object[]> reportesPorBarrio = reporteRepositorio.countReportesByBarrioOrdenado(startOfMonth, endOfMonth, divisionId, subdivisionId);
        result.put("barrioData", reportesPorBarrio);

        List<Object[]> reportesPorEdad = reporteRepositorio.countReportesByAgeRange(
            startOfMonth, endOfMonth, 
            LocalDate.now().minusYears(25), LocalDate.now().minusYears(18),
            LocalDate.now().minusYears(35), LocalDate.now().minusYears(26),
            LocalDate.now().minusYears(45), LocalDate.now().minusYears(36),
            LocalDate.now().minusYears(55), LocalDate.now().minusYears(46),
            LocalDate.now().minusYears(65), LocalDate.now().minusYears(56),
            divisionId, subdivisionId
        );
        
        Map<String, Long> edadData = new HashMap<>();
        for (Object[] row : reportesPorEdad) {
            edadData.put((String) row[0], (Long) row[1]);
        }
        result.put("edadData", edadData);

        List<Object[]> reportesPorGenero = reporteRepositorio.countUsuariosUnicosPorGenero(startOfMonth, endOfMonth, divisionId, subdivisionId);
        Map<String, Long> generoData = new HashMap<>();
        for (Object[] row : reportesPorGenero) {
            generoData.put((String) row[0], (Long) row[1]);
        }
        result.put("generoData", generoData);

        return result;
    }
    
    public List<Map<String, Object>> obtenerGeolocalizacionesConDetalles() {
        List<Object[]> geolocalizaciones = reporteRepositorio.findGeolocalizacionesConDetalles();

        return geolocalizaciones.stream().map(geo -> {
            Map<String, Object> result = new HashMap<>();
            result.put("geolocalizacion", geo[0]);
            result.put("descripcion", geo[1]);
            result.put("estado", geo[2]);
            result.put("idReporte", geo[3]);

            return result;
        }).collect(Collectors.toList());
    }
}
