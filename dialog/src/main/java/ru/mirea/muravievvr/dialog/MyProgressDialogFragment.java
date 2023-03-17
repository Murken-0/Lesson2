package ru.mirea.muravievvr.dialog;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;

public class MyProgressDialogFragment extends DialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        ProgressDialog progressDialog = new ProgressDialog(getActivity());
        progressDialog.setTitle("Loading");
        progressDialog.setMessage("Wait");
        progressDialog.setIndeterminate(true);
        progressDialog.setButton(Dialog.BUTTON_POSITIVE, "OK",
                ((dialog, which) -> {((MainActivity)getActivity()).onOkClicked();}));
        return progressDialog;
    }
}
