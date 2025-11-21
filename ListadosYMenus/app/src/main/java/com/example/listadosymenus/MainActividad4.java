package com.example.listadosymenus;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActividad4 extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private Spinner spinnerPaises;

    private TextView textViewPaisSeleccionado;

    private final String[] paises = {
            "España", "Grecia", "Italia", "Alemania",
            "Suiza", "Noruega", "Dinamarca", "Croacia",
            "Irlanda", "JUAN"
    };

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.actividad4_layout);

        spinnerPaises = findViewById(R.id.spinnerPaises);
        textViewPaisSeleccionado = findViewById(R.id.textViewPaisSeleccionado);

        ArrayAdapter<String> adaptador = new ArrayAdapter<>(
                this,
                android.R.layout.simple_spinner_item,
                paises
        );

        adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinnerPaises.setAdapter(adaptador);

        spinnerPaises.setOnItemSelectedListener(this);
    }
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String paisSeleccionado = paises[position];

                textViewPaisSeleccionado.setText(paisSeleccionado);
            }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}

