package com.sistemasciudadanos.janita.comun;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

/**
 * Created by Mauricio on 02/04/2015.
 */
public class HistorialLaboral {
    private String id_unico;
    private String usuario;
    private String nombres;
    private String apellidos;
    private String tipo_doc_id;
    private int numero_doc;
    private RegistroLaboral[] registrosLaborales;
    private String registrosLaborales2;

    public String getId_unico() {
        return id_unico;
    }
    public void setId_unico(String id_unico) {
        this.id_unico = id_unico;
    }

    public int getNumero_doc() {
        return numero_doc;
    }
    public void setNumero_doc(int numero_doc) {
        this.numero_doc = numero_doc;
    }

    public String getTipo_doc_id() {
        return tipo_doc_id;
    }
    public void setTipo_doc_id(String tipo_doc_id) {
        this.tipo_doc_id = tipo_doc_id;
    }

    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNombres() {
        return nombres;
    }
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public RegistroLaboral[] getRegistrosLaborales() {
        return registrosLaborales;
    }

    public void setRegistrosLaborales(RegistroLaboral[] registrosLaborales) {
        this.registrosLaborales = registrosLaborales;
    }

    private String ObtenerRegistrosLaborales() throws IOException {
        registrosLaborales2 = Info.getInstance().JSONmapper.writeValueAsString(registrosLaborales);
        return registrosLaborales2;
    }
}
