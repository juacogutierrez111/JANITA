package com.sistemasciudadanos.myapplication;


import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;


public class RegistrarPeriodoLaboralActivity extends ActionBarActivity implements DatePickerFragment.OnDateSelectedListener {

    View vistaFecha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar_periodo_laboral);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_registrar_periodo_laboral, menu);
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

    public void showDatePickerDialog(View v) {
        vistaFecha = v;
        DialogFragment newFragment = new DatePickerFragment();
        //((DatePickerFragment)newFragment).setInterface((DatePickerFragment.OnDateSelectedListener)RegistrarPeriodoLaboralActivity.this);
        newFragment.show(getSupportFragmentManager(), "datePicker");

        //final Button fecha = (Button) v;
        //fecha.setText(selectedDate.getYear());
        //final Button fecha = (Button) findViewById(R.id.fechaInicioBTN);
   }

    @Override
    public void OnDateSelected(DatePicker view, int year, int month, int day) {
        //final Button fecha = (Button) findViewById(R.id.fechaInicioBTN);
        final Button fecha = (Button)vistaFecha;
        fecha.setText(new StringBuilder().append(Integer.toString(year)).append("-").append(Integer.toString(month + 1)).append("-").append(Integer.toString(day)));
    }
}

