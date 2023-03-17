package ru.mirea.muravievvr.dialog;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;

public class MyTimeDialogFragment extends DialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        TimePickerDialog picker = new TimePickerDialog(getActivity(), (timePicker, hour, minute) -> {},
                0, 0, true);
        picker.setMessage("Choose the Time!");
        return picker;
    }
}
