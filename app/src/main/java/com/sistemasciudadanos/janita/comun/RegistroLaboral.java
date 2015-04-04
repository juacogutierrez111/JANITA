package com.sistemasciudadanos.janita.comun;
import java.util.Date;
/**
 * Created by Mauricio on 29/03/2015.
 */
public class RegistroLaboral {
    private String id_registro_laboral;
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

    public String getId_registro_laboral() {
        return id_registro_laboral;
    }

    public void setId_registro_laboral(String id_registro_laboral) {
        this.id_registro_laboral = id_registro_laboral;
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