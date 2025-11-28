package com.example.controlesbasicos;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
public class Activity55 extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {
    private RadioGroup radioGroupNivel;
    private TextView tvResultado;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5_5);
        tvResultado = findViewById(R.id.tvResultado);

        radioGroupNivel = findViewById(R.id.radioGroupDias);

        // Aclaramos listener
        radioGroupNivel.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(@NonNull RadioGroup group, int checkedId) {
        RadioButton radioButtonSeleccionado = findViewById(checkedId);

        tvResultado.setText("Seleccionado: " + radioButtonSeleccionado.getText());
        Toast.makeText(this, "Seleccion cambiada a: " + radioButtonSeleccionado.getText(),
                Toast.LENGTH_SHORT).show();
        {
        }
    }
}