package com.sistemasciudadanos.janita.comun;

/**
 * Created by Mauricio on 29/03/2015.
 */
public class Info {
    private static Info ourInstance = new Info();



    public static Info getInstance() {
        return ourInstance;
    }

    private Info() {
    }
}
