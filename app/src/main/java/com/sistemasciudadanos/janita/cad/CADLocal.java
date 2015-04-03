package com.sistemasciudadanos.janita.cad;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.util.Log;

import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sistemasciudadanos.janita.comun.HistorialLaboral;
import com.sistemasciudadanos.myapplication.R;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URISyntaxException;
import java.net.URL;


/**
 * Created by Mauricio on 24/03/2015.
 */
public class CADLocal {
    private static CADLocal ourInstance = new CADLocal();
    private static ObjectMapper JSONMapper = new ObjectMapper();

    public static CADLocal getInstance() {
        return ourInstance;
    }

    private CADLocal() {
    }

    public HistorialLaboral obtenerHistorialLaboral(Context context) throws FileNotFoundException
    {
        Resources res = context.getResources();
        InputStream inputStream = res.openRawResource(R.raw.registroslaborales);

        HistorialLaboral historiaLaboral = null;

        try {
             historiaLaboral = JSONMapper.readValue(inputStream, HistorialLaboral.class);
        }
        catch (JsonMappingException e){
            e.printStackTrace();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return  historiaLaboral;
    }
}