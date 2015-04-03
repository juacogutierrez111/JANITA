package com.sistemasciudadanos.myapplication;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
//import android.widget.ImageView;
import android.widget.TextView;

import com.sistemasciudadanos.janita.comun.RegistroLaboral;

import java.util.List;

public class RegistrosLaboralesArrayAdapter extends ArrayAdapter<RegistroLaboral> {
    private final Context context;
    private final RegistroLaboral[] values;

    public RegistrosLaboralesArrayAdapter(Context context, RegistroLaboral[] values) {
        super(context, R.layout.registrolaboral, values);
        this.context = context;
        this.values = values;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.registrolaboral, parent, false);
        TextView nombreRegistroLaboralTV = (TextView) rowView.findViewById(R.id.nombreRegistroLaboralTV);
        TextView detallesRegistroLaboralTV = (TextView) rowView.findViewById(R.id.detallesRegistroLaboralTV);
        TextView idRegistroLaboralTV = (TextView) rowView.findViewById(R.id.idRegistroLaboralTV);
        //ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
        //Aquí obtiene el objeto JSON.

        nombreRegistroLaboralTV.setText(values[position].getNombreOrganizacion());

        /*
        // change the icon for Windows and iPhone
        String s = values[position];
        if (s.startsWith("iPhone")) {
            imageView.setImageResource(R.drawable.no);
        } else {
            imageView.setImageResource(R.drawable.ok);
        }
        */

        return rowView;
    }
}