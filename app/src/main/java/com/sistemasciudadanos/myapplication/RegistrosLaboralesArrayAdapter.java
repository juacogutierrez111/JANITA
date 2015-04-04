package com.sistemasciudadanos.myapplication;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
//import android.widget.ImageView;
import android.widget.TextView;

import com.sistemasciudadanos.janita.comun.EstadosValidacion;
import com.sistemasciudadanos.janita.comun.RegistroLaboral;

import java.text.SimpleDateFormat;
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
        TextView fechaInicioRL = (TextView) rowView.findViewById(R.id.fechaInicioRLTV);
        TextView fechaFinRL = (TextView) rowView.findViewById(R.id.fechaFinRLTV);
        TextView duracion = (TextView) rowView.findViewById(R.id.duracionTV);
        TextView idRegistroLaboralTV = (TextView) rowView.findViewById(R.id.idRegistroLaboralTV);
        TextView validacionEmpleadorTV = (TextView) rowView.findViewById(R.id.validacionEmpleadorTV);
        TextView validacionSegSocialTV = (TextView) rowView.findViewById(R.id.validacionSeguridadSocialTV);
        TextView validacionReferenciaTV = (TextView) rowView.findViewById(R.id.validacionReferenciaTV);

        //TODO: este podría estar en el SINGLETON
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        nombreRegistroLaboralTV.setText(values[position].getNombreOrganizacion());
        fechaInicioRL.setText(sdf.format(values[position].getFechaInicio()));
        fechaFinRL.setText(sdf.format(values[position].getFechaFin()));
        duracion.setText(values[position].getDuracion().toString());

        //ESTADOS.
        String estadoValEmp = values[position].getEstadoValidacionEmpleador();
        EstadosValidacion estadoEmpleador = EstadosValidacion.valueOf(estadoValEmp);

        switch (estadoEmpleador) {
            case VERDE:
                validacionEmpleadorTV.setBackgroundColor(context.getResources().getColor(R.color.verde));
                break;
            case NARANJA:
                validacionEmpleadorTV.setBackgroundColor(context.getResources().getColor(R.color.naranja));
                break;
            case ROJO:
                validacionEmpleadorTV.setBackgroundColor(context.getResources().getColor(R.color.rojo));
                break;
        }

        String estadoValSegSocial = values[position].getEstadoValidacionSegSocial();
        EstadosValidacion estadoSegSocial = EstadosValidacion.valueOf(estadoValSegSocial);

        switch (estadoSegSocial) {
            case VERDE:
                validacionSegSocialTV.setBackgroundColor(context.getResources().getColor(R.color.verde));
                break;
            case NARANJA:
                validacionSegSocialTV.setBackgroundColor(context.getResources().getColor(R.color.naranja));
                break;
            case ROJO:
                validacionSegSocialTV.setBackgroundColor(context.getResources().getColor(R.color.rojo));
                break;
        }

        String estadoValReferencia = values[position].getEstadoValidacionReferencia();
        EstadosValidacion estadoReferencia = EstadosValidacion.valueOf(estadoValReferencia);

        switch (estadoReferencia) {
            case VERDE:
                validacionReferenciaTV.setBackgroundColor(context.getResources().getColor(R.color.verde));
                break;
            case NARANJA:
                validacionReferenciaTV.setBackgroundColor(context.getResources().getColor(R.color.naranja));
                break;
            case ROJO:
                validacionReferenciaTV.setBackgroundColor(context.getResources().getColor(R.color.rojo));
                break;
        }



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