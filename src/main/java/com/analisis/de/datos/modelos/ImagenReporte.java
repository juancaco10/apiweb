package com.analisis.de.datos.modelos;

import jakarta.persistence.*;

@Entity
@Table(name = "imagenes_reporte")
public class ImagenReporte {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_imagen")
    private Integer idImagen;

    @Column(name = "imagen", columnDefinition = "LONGBLOB")
    @Lob // Esta anotación indica que es un campo de gran tamaño (Binary Large Object)
    private byte[] imagen;

    @ManyToOne
    @JoinColumn(name = "id_reporte")
    private Reporte reporte;

    // Getters y Setters
    public Integer getIdImagen() {
        return idImagen;
    }

    public void setIdImagen(Integer idImagen) {
        this.idImagen = idImagen;
    }

    public byte[] getImagen() {
        return imagen;
    }

    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }

    public Reporte getReporte() {
        return reporte;
    }

    public void setReporte(Reporte reporte) {
        this.reporte = reporte;
    }
}
