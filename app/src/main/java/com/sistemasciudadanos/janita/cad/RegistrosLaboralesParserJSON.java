package com.sistemasciudadanos.janita.cad;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Mauricio on 23/03/2015.
 */
public class RegistrosLaboralesParserJSON {
    private static final String TAG_REGISTROSLABORALES = "registrosLaborales";
    private static final String TAG_ID = "id";
    private static final String TAG_NOMBREORGANIZACION = "nombreOrganizacion";
    private static final String TAG_PERIODOLABORAL = "periodoLaboral";
    private static final String TAG_ESTADO = "estado";

    private static RegistrosLaboralesParserJSON ourInstance = new RegistrosLaboralesParserJSON();

    public static RegistrosLaboralesParserJSON getInstance() {
        return ourInstance;
    }

    private RegistrosLaboralesParserJSON() {
        //this.registrosLaborales = registrosLaborales;
    }

    public static ArrayList<HashMap<String, String>> obtenerJSONRegistrosLaborales(String registrosLaboralesJSON)
    {
        ArrayList<HashMap<String, String>> registrosLaboralesList = null;

        try {
            JSONObject jsonObj = new JSONObject(registrosLaboralesJSON);
            JSONArray registrosLaboralesArrayJSON = jsonObj.getJSONArray(TAG_REGISTROSLABORALES);
            registrosLaboralesList = new ArrayList<HashMap<String, String>>();

            for (int i = 0; i < registrosLaboralesJSON.length(); i++) {
                JSONObject registroLaboralJSON = registrosLaboralesArrayJSON.getJSONObject(i);

                String id = registroLaboralJSON.getString(TAG_ID);
                String nombreOrganizacion = registroLaboralJSON.getString(TAG_NOMBREORGANIZACION);
                String periodoLaboral = registroLaboralJSON.getString(TAG_PERIODOLABORAL);
                String estado = registroLaboralJSON.getString(TAG_ESTADO);

                HashMap<String, String> registroLaboral = new HashMap<String, String>();
                registroLaboral.put(TAG_ID, id);
                registroLaboral.put(TAG_NOMBREORGANIZACION, nombreOrganizacion);
                registroLaboral.put(TAG_PERIODOLABORAL, periodoLaboral);
                registroLaboral.put(TAG_ESTADO, estado);

                registrosLaboralesList.add(registroLaboral);
            }
        }
        catch (JSONException e) {
            e.printStackTrace();
          }

        return registrosLaboralesList;
    }


}
