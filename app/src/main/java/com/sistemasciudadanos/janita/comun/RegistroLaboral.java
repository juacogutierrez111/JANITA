package com.sistemasciudadanos.janita.comun;
import java.util.Date;

/**
 * Created by Mauricio on 29/03/2015.
 */
public class RegistroLaboral {
    private String nombreOrganizacion;
    private Date fechaCreacion;
    private Date fechaInicio;
    private Date fechaFin;
    private Integer duracionDias;
    private Integer duracionMeses;
    private String estado;

    public String getNombreOrganizacion() {
        return nombreOrganizacion;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public Integer getDuracionDias() {
        return duracionDias;
    }

    public Integer getDuracionMeses() {
        return duracionMeses;
    }

    public String getEstado() {
        return estado;
    }
}
