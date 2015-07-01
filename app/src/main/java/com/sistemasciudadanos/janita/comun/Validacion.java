package com.sistemasciudadanos.janita.comun;

import java.util.Date;

/**
 * Created by Mauricio on 29/03/2015.
 */
public class Validacion {
    private String idValidacion;
    private String tipoValidacion;
    private String estado;
    private Date fechaValidacion;
    private Date fechaInicioPeriodoValidado;
    private Date fechaFinPeriodoValidado;
    private String observaciones;

    public String getTipoValidacion() {
        return tipoValidacion;
    }

    public String getEstado() {
        return estado;
    }

    public Date getFechaValidacion() {
        return fechaValidacion;
    }

    public Date getFechaInicioPeriodoValidado() {
        return fechaInicioPeriodoValidado;
    }

    public Date getFechaFinPeriodoValidado() {
        return fechaFinPeriodoValidado;
    }

    public String getIdValidacion() {
        return idValidacion;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setTipoValidacion(String tipoValidacion) {
        this.tipoValidacion = tipoValidacion;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setFechaValidacion(Date fechaValidacion) {
        this.fechaValidacion = fechaValidacion;
    }

    public void setFechaInicioPeriodoValidado(Date fechaInicioPeriodoValidado) {
        this.fechaInicioPeriodoValidado = fechaInicioPeriodoValidado;
    }

    public void setFechaFinPeriodoValidado(Date fechaFinPeriodoValidado) {
        this.fechaFinPeriodoValidado = fechaFinPeriodoValidado;
    }

    public void setIdValidacion(String idValidacion) {
        this.idValidacion = idValidacion;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
}