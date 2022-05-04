package com.backendportfolio.integrador.modelos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ExperienciaLaboral {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombreEmpresa;
    private String puesto;
    private String fechaInicio;
    private String fechaFin;
    private String descripcion;
    private String imgEmpresa;

    public ExperienciaLaboral() {
    }

    public ExperienciaLaboral(String nombreEmpresa, String puesto, String fechaInicio, String fechaFin,
            String descripcion, String imgEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
        this.puesto = puesto;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.descripcion = descripcion;
        this.imgEmpresa = imgEmpresa;
    }

    public ExperienciaLaboral(Long id, String nombreEmpresa, String puesto, String fechaInicio, String fechaFin,
            String descripcion, String imgEmpresa) {
        this.id = id;
        this.nombreEmpresa = nombreEmpresa;
        this.puesto = puesto;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.descripcion = descripcion;
        this.imgEmpresa = imgEmpresa;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImgEmpresa() {
        return imgEmpresa;
    }

    public void setImgEmpresa(String imgEmpresa) {
        this.imgEmpresa = imgEmpresa;
    }

}
