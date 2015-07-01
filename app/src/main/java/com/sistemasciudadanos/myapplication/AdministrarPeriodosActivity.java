package com.sistemasciudadanos.myapplication;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.internal.widget.AdapterViewCompat;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.sistemasciudadanos.janita.cad.CADLocal;
import com.sistemasciudadanos.janita.comun.HistorialLaboral;

import java.io.FileNotFoundException;
import java.util.ArrayList;


public class AdministrarPeriodosActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_administrar_periodos);

        //Enable taps on the home logo
        //getActionBar().setHomeButtonEnabled(true);
        //Display home with the "up" arrow indicator
        //getActionBar().setDisplayHomeAsUpEnabled(true);
        //Obtiene el Historial Laboral.

        HistorialLaboral historialLaboral = null;

        try {
             historialLaboral = CADLocal.getInstance().obtenerHistorialLaboral(this.getApplicationContext());
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }

        //EJEMPLO DE LISTVIEW
        final ListView listview = (ListView) findViewById(R.id.periodosLaboralesLV);

        String[] values = new String[] { "Carvajal S.A.", "Gato Malo Ltda", "LG LTDA",
                "Microsoft", "Postobon", "SODIMAC Colombia", "BigMarket Ltda", "Bavaria",
                "Henkel", "Banco de Bogotá", "Bayer", "Sistemas Ciudadanos Unipersonal", "BigMarket Ltda", "Alpina S.A.",
                "OS/2", "Ubuntu", "Windows7", "Max OS X", "Linux", "OS/2",
                "Sony Pictures", "Pixar", "Alcadía de Bogotá" };

        final RegistrosLaboralesArrayAdapter adapter = new RegistrosLaboralesArrayAdapter(this.getApplicationContext(), historialLaboral.getRegistrosLaborales());
        listview.setAdapter(adapter);

        AdapterView.OnItemClickListener listener = new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id) {
                Intent detallePLIntent = new Intent("com.sistemasciudadanos.myapplication.DETALLEREGISTROLABORAL");
                detallePLIntent.putExtra("PosicionRegistroLaboral", position);
                startActivity(detallePLIntent);
                setTitle(parent.getItemAtPosition(position).toString());
            }
        };

        listview.setOnItemClickListener(listener);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_administrar_periodos, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        if (id == R.id.crearPeriodoLaboral) {
            DesplegarCrearRegistroLaboral();
            return true;
        }

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void DesplegarCrearRegistroLaboral(){
        startActivity(new Intent("com.sistemasciudadanos.myapplication.REGISTRARPERIODOLABORALACTIVITY"));
    }



}
