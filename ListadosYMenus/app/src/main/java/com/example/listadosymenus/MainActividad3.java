package com.example.listadosymenus;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActividad3 extends AppCompatActivity {

    private GridView gridViewPaises;

    private TextView textViewPaisSeleccionado;

    private final String[] paises = {
            "España", "Grecia", "Italia", "Alemania",
            "Suiza", "Noruega", "Dinamarca", "Croacia",
            "Irlanda", "JUAN"
    };

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actividad3_layout);

        gridViewPaises = findViewById(R.id.gridViewPaises);
        ArrayAdapter<String> adaptador = new ArrayAdapter<>(
                this,
                R.layout.list_item_paises,
                R.id.gridViewPaises,
                paises
        );

        gridViewPaises.setAdapter(adaptador);

        gridViewPaises.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            String paisSeleccionado = paises[position];

            textViewPaisSeleccionado.setText(paisSeleccionado);
            }
        });
    }
}