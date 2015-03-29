package com.sistemasciudadanos.myapplication;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.support.v4.app.DialogFragment;
import android.os.Bundle;
import android.widget.DatePicker;

import java.util.Calendar;

/**
 * Created by Mauricio on 18/03/2015.
 */
public class DatePickerFragment extends DialogFragment implements DatePickerDialog.OnDateSetListener {

    OnDateSelectedListener onDateSelectedListener;

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        // Use the current date as the default date in the picker
        final Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_MONTH);

        // Create a new instance of DatePickerDialog and return it
        return new DatePickerDialog(getActivity(), this, year, month, day);
    }

    public void onDateSet(DatePicker view, int year, int month, int day) {
        // Do something with the date chosen by the user
        //RegistrarPeriodoLaboralActivity.selectedDate = view;
        onDateSelectedListener.OnDateSelected(view, year, month, day);
    }

    public void setInterface(OnDateSelectedListener dateSelectedI) {
        this.onDateSelectedListener = dateSelectedI;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            onDateSelectedListener = (OnDateSelectedListener) activity; //con esto ya no es necesario el setInterface.
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString() + " must implement onDateSelectedListener");
        }
    }


    public interface OnDateSelectedListener {
        public void OnDateSelected(DatePicker view, int year, int month, int day);
    }


}
