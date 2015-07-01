package com.sistemasciudadanos.janita.comun;
import java.util.Date;
/**
 * Created by Mauricio on 29/03/2015.
 */
public class RegistroLaboral {
    private String idRegistroLaboral;
    private String nombreOrganizacion;
    private Date fechaCreacion;
    private Date fechaInicio;
    private Date fechaFin;
    private Integer duracionDias;
    private Integer duracionMeses;
    private String duracion;
    private String estado;
    private String estadoValidacionEmpleador;
    private String estadoValidacionSegSocial;
    private String estadoValidacionReferencia;
    private Validacion[] validaciones;

    public Validacion[] getValidaciones() {
        return validaciones;
    }

    public void setValidaciones(Validacion[] validaciones) {
        this.validaciones = validaciones;
    }

    public String getIdRegistroLaboral() {
        return idRegistroLaboral;
    }

    public void setId_registro_laboral(String idRegistroLaboral) {
        this.idRegistroLaboral = idRegistroLaboral;
    }

    public    String getNombreOrganizacion() {
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

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstadoValidacionEmpleador(String estadoValidacionEmpleador) {
        this.estadoValidacionEmpleador = estadoValidacionEmpleador;
    }

    public String getEstadoValidacionEmpleador() {
        return estadoValidacionEmpleador;
    }

    public void setEstadoValidacionReferencia(String estadoValidacionReferencia) {
        this.estadoValidacionReferencia = estadoValidacionReferencia;
    }

    public String getEstadoValidacionReferencia() {
        return estadoValidacionReferencia;
    }

    public void setEstadoValidacionSegSocial(String estadoValidacionSegSocial) {
        this.estadoValidacionSegSocial = estadoValidacionSegSocial;
    }

    public String getEstadoValidacionSegSocial() {
        return estadoValidacionSegSocial;
    }
}