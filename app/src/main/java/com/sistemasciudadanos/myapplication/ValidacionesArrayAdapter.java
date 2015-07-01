package com.sistemasciudadanos.myapplication;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.sistemasciudadanos.janita.comun.Validacion;
import java.text.SimpleDateFormat;

/**
 * Created by Mauricio on 23/06/2015.
 */
public class ValidacionesArrayAdapter extends ArrayAdapter<Validacion> {
    private final Context context;
    private final Validacion[] values;

    public ValidacionesArrayAdapter(Context context, Validacion[] values) {
        super(context, R.layout.validacion, values);
        this.context = context;
        this.values = values;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.validacion, parent, false);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        TextView tipoValidacion = (TextView) rowView.findViewById(R.id.ptbTipoValidacion);
        TextView estadoValidacion = (TextView) rowView.findViewById(R.id.ptbTipoValidacion);
        TextView fechaValidacion = (TextView) rowView.findViewById(R.id.ptvFechaValidacion);
        TextView fechaInicioPeriodoValidado = (TextView) rowView.findViewById(R.id.ptvFechaInicio);
        TextView fechaFinPeriodoValidado = (TextView) rowView.findViewById(R.id.ptvFechaFin);

        tipoValidacion.setText(values[position].getTipoValidacion());
        estadoValidacion.setText(values[position].getEstado());
        fechaValidacion.setText(sdf.format(values[position].getFechaValidacion()));
        fechaInicioPeriodoValidado.setText(sdf.format(values[position].getFechaInicioPeriodoValidado()));
        fechaFinPeriodoValidado.setText(sdf.format(values[position].getFechaFinPeriodoValidado()));

        return rowView;
    }
}
