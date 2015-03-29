package com.sistemasciudadanos.janita.cad;

import com.sistemasciudadanos.janita.comun.RegistroLaboral;

import java.io.FileReader;
import java.util.ArrayList;

import org.json.JSONArray;

import org.json.JSONArray;
import org.json.JSONObject;



/**
 * Created by Mauricio on 24/03/2015.
 */
public class CADLocal {
    private static CADLocal ourInstance = new CADLocal();

    public static CADLocal getInstance() {
        return ourInstance;
    }

    private CADLocal() {
    }

    public ArrayList<RegistroLaboral> obtnerRegistrosLaborales()
    {
        String registrosLaborales = null;
        ArrayList<RegistroLaboral> registros = null;

        //Lee la cadena JSON desde el archivo, por ahora...



        //String registrosLaborales =

        return  registros;
    }


}
