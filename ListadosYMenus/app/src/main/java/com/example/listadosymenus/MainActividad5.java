package com.example.listadosymenus;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.listadosymenus.adapters.PlanetaAdapter;
import com.example.listadosymenus.pojos.Planeta;

import java.util.ArrayList;

public class MainActividad5 extends AppCompatActivity {

    private ListView listView;

    private ArrayList<Planeta> listPlanetas;

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.actividad5_layout);

        listView = findViewById(R.id.listViewComplejo);


        listPlanetas = new ArrayList<>();
        listPlanetas.add(new Planeta("Mercurio", "El mas cercano al Sol", R.drawable.mercurio,
                false, "https://es.wikipedia.org/wiki/Mercurio_(planeta)#:~:text=Mercurio%20es%20uno%20de%20los,y%20un%2030%20%25%20de%20silicatos."));
        listPlanetas.add(new Planeta("Venus", "El gemelo toxico de la Tierra", R.drawable.venus,
                false, "https://es.wikipedia.org/wiki/Venus_(planeta)"));
        listPlanetas.add(new Planeta("Tierra", "Nuestro planeta hogar", R.drawable.tierra,
                true, "https://es.wikipedia.org/wiki/Tierra"));
        listPlanetas.add(new Planeta("Marte", "El planeta rojo", R.drawable.marte,
                true, "https://es.wikipedia.org/wiki/Marte"));
        listPlanetas.add(new Planeta("Jupiter", "El gigante gaseoso", R.drawable.jupiter,
                true, "https://es.wikipedia.org/wiki/J%C3%BApiter_(planeta)"));
        listPlanetas.add(new Planeta("Saturno", "El señor de los anillos", R.drawable.saturno,
                true, "https://es.wikipedia.org/wiki/Saturno_(planeta)"));
        listPlanetas.add(new Planeta("Urano", "El gigante de hielo", R.drawable.urano,
                true, "https://es.wikipedia.org/wiki/Urano_(planeta)"));
        listPlanetas.add(new Planeta("Neptuno", "El planeta mas lejano", R.drawable.neptuno,
                true, "https://es.wikipedia.org/wiki/Neptuno_(planeta)"));

        PlanetaAdapter adaptador = new PlanetaAdapter(this, listPlanetas);

        listView.setAdapter(adaptador);

        listView.setOnItemClickListener((parent, view, position, id) -> {
            Planeta planetaSeleccionado = listPlanetas.get(position);

            Intent intentWeb = new Intent(Intent.ACTION_VIEW, Uri.parse(planetaSeleccionado.getUrlInfo()));
            if (intentWeb.resolveActivity(getPackageManager()) != null) {
                startActivity(intentWeb);
            } else {
                Toast.makeText(this, "No se encontró un navegador web", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
