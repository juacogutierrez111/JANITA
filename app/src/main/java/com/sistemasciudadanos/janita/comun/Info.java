package com.sistemasciudadanos.janita.comun;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Created by Mauricio on 29/03/2015.
 */
public class Info {
    private static Info ourInstance = new Info();
    final ObjectMapper JSONmapper;


    public static Info getInstance() {
        return ourInstance;
    }

    private Info() {

        JSONmapper = new ObjectMapper();

    }
}
