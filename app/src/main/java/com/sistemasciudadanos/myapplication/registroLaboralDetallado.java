package com.sistemasciudadanos.myapplication;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.sistemasciudadanos.janita.cad.CADLocal;
import com.sistemasciudadanos.janita.comun.HistorialLaboral;

import java.io.FileNotFoundException;


public class RegistroLaboralDetallado extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_laboral_detallado);


        HistorialLaboral historialLaboral = null;

        try {
            historialLaboral = CADLocal.getInstance().obtenerHistorialLaboral(this.getApplicationContext());
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }

        final ListView listview = (ListView) findViewById(R.id.lvValidaciones);
        final RegistrosLaboralesArrayAdapter adapter = new RegistrosLaboralesArrayAdapter(this.getApplicationContext(), historialLaboral.getRegistrosLaborales());
        listview.setAdapter(adapter);

        AdapterView.OnItemClickListener listener = new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id) {

                Intent detallePLIntent = new Intent("com.sistemasciudadanos.myapplication.DETALLEREGISTROLABORAL");
                startActivity(detallePLIntent);
                setTitle(parent.getItemAtPosition(position).toString());
            }
        };

        listview.setOnItemClickListener(listener);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_registro_laboral_detallado, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }



}
