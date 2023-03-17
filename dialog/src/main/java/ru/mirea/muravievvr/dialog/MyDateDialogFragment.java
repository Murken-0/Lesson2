package ru.mirea.muravievvr.dialog;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;

public class MyDateDialogFragment  extends DialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        DatePickerDialog picker = new DatePickerDialog(
                getActivity(), (datePicker, year, month, day) -> {}, 0,0,0);
        picker.setMessage("Choose the Date!");
        return picker;
    }
}
