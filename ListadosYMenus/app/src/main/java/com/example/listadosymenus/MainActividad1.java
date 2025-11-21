package com.example.listadosymenus;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Set;

public class MainActividad1 extends AppCompatActivity {

    private ListView listViewPlanetas;

    private final String[] planetas = {
      "Mercurio", "Venus", "Tierra", "Marte",
            "Jupiter", "Saturno", "Urano", "Neptuno"

    };

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.actividad1_layout);

        listViewPlanetas = findViewById(R.id.listViewPlanetas);
        ArrayAdapter<String> adaptador = new ArrayAdapter<>(
                this,
                R.layout.list_item_planetas,
                R.id.textViewPlaneta,
                planetas
        );



        TextView header = new TextView(this);
        header.setText("Planetas del Sistema Solar");
        header.setTextSize(24);
        header.setPadding(16, 16, 16, 16);
        header.setBackgroundColor(0xFFDDDDDD);
        listViewPlanetas.addHeaderView(header);

        TextView footer = new TextView(this);
        footer.setText("Powered by Juan");
        footer.setPadding(16, 16, 16, 16);
        footer.setTextAlignment(TextView.TEXT_ALIGNMENT_CENTER);
        listViewPlanetas.addFooterView(footer);

        listViewPlanetas.setAdapter(adaptador);

        listViewPlanetas.setOnItemClickListener((parent, view, position, id) -> {
            int indiceReal = position - listViewPlanetas.getHeaderViewsCount();

            if (indiceReal >= 0 && indiceReal < planetas.length) {
                String planetaSeleccionado = planetas[indiceReal];
                Toast.makeText(MainActividad1.this, "Has seleccionado: "
                + planetaSeleccionado, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
