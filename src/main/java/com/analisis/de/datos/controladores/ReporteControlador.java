package com.analisis.de.datos.controladores;

import com.analisis.de.datos.modelos.ImagenReporte;
import com.analisis.de.datos.repositorios.ImagenReporteRepositorio;
import com.analisis.de.datos.servicios.ReporteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/reportes")
public class ReporteControlador {

    @Autowired
    private ReporteServicio reporteService;

    @Autowired
    private ImagenReporteRepositorio imagenReporteRepositorio;

    // Endpoint para obtener datos para los gráficos
    @GetMapping("/graficos/{divisionId}/{subdivisionId}")
    public Map<String, Object> obtenerDatosParaGraficos(@PathVariable Integer divisionId, @PathVariable Integer subdivisionId) {
        return reporteService.obtenerDatosParaGraficos(divisionId, subdivisionId);
    }

    // Endpoint para obtener geolocalizaciones con imágenes en Base64
    @GetMapping("/geolocalizaciones")
    public ResponseEntity<List<Map<String, Object>>> obtenerGeolocalizaciones() {
        List<Map<String, Object>> geolocalizaciones = reporteService.obtenerGeolocalizacionesConDetalles();
        
        if (geolocalizaciones.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<>(geolocalizaciones, HttpStatus.OK);
    }

    // Endpoint para obtener la imagen
    @GetMapping("/imagenes/{id}")
    public ResponseEntity<byte[]> obtenerImagen(@PathVariable Integer id) {
        ImagenReporte imagen = imagenReporteRepositorio.findById(id).orElse(null);

        if (imagen == null || imagen.getImagen() == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        // Establecer el tipo de contenido de la respuesta, por ejemplo, para imágenes JPEG
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.IMAGE_JPEG); // Puedes cambiar a MediaType.IMAGE_PNG si es PNG

        return new ResponseEntity<>(imagen.getImagen(), headers, HttpStatus.OK);
    }
}
