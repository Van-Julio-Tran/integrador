package com.backendportfolio.integrador.modelos;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String escuela;
    private String carrera;
    private String imagenUrl;
    private Date fechaInicio;
    private Date fechaFin;

    public Educacion() {
    }

    public Educacion(String escuela, String carrera, String imagenUrl, Date fechaInicio, Date fechaFin) {
        this.escuela = escuela;
        this.carrera = carrera;
        this.imagenUrl = imagenUrl;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public Educacion(Long id, String escuela, String carrera, String imagenUrl, Date fechaInicio, Date fechaFin) {
        this.id = id;
        this.escuela = escuela;
        this.carrera = carrera;
        this.imagenUrl = imagenUrl;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEscuela() {
        return escuela;
    }

    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getImagenUrl() {
        return imagenUrl;
    }

    public void setImagenUrl(String imagenUrl) {
        this.imagenUrl = imagenUrl;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

}
