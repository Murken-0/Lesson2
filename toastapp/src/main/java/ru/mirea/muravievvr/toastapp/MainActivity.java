package ru.mirea.muravievvr.toastapp;

import androidx.appcompat.app.AppCompatActivity;

import android.icu.lang.UCharacterEnums;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText edit;

    public void onClickButton(View v) {
        Toast toast = Toast.makeText(getApplicationContext(),
                "СТУДЕНТ No 21 ГРУППА БСБО-01-20 Количество символов - "
                        + edit.getText().toString().length(),
                Toast.LENGTH_LONG);
        toast.show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit = findViewById(R.id.editTextTextPersonName);
    }
}