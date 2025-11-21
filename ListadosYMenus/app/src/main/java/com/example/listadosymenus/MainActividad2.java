package com.example.listadosymenus;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActividad2 extends AppCompatActivity {

    private ListView listViewPaises;

    private final String[] paises = {
            "España", "Grecia", "Italia", "Alemania",
            "Suiza", "Noruega", "Dinamarca", "Croacia",
            "Irlanda", "Rusia"
    };

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.actividad2_layout);

        listViewPaises = findViewById(R.id.listViewPaises);
        ArrayAdapter<String> adaptador = new ArrayAdapter<>(
                this,
                R.layout.list_item_paises,
                R.id.listViewPaises,
                paises
        );



        TextView header = new TextView(this);
        header.setText("Paises de la Unión Europea");
        header.setTextSize(24);
        header.setPadding(16, 16, 16, 16);
        header.setBackgroundColor(0xFFDDDDDD);
        listViewPaises.addHeaderView(header);

        TextView footer = new TextView(this);
        footer.setText("Powered by Juan");
        footer.setPadding(16, 16, 16, 16);
        footer.setTextAlignment(TextView.TEXT_ALIGNMENT_CENTER);
        listViewPaises.addFooterView(footer);

        listViewPaises.setAdapter(adaptador);

        listViewPaises.setOnItemClickListener((parent, view, position, id) -> {
            int indiceReal = position - listViewPaises.getHeaderViewsCount();

            if (indiceReal >= 0 && indiceReal < paises.length) {
                String planetaSeleccionado = paises[indiceReal];
                Toast.makeText(MainActividad2.this, "Has seleccionado: "
                        + planetaSeleccionado, Toast.LENGTH_SHORT).show();
            }
        });
    }
}