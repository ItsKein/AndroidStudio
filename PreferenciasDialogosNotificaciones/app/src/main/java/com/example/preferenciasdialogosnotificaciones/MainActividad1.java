package com.example.preferenciasdialogosnotificaciones;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActividad1 extends AppCompatActivity implements View.OnClickListener {

    Button btnDefinir, btnRecuperar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_actividad1);

        // 1. Enlazar los botones del layout
        btnDefinir = findViewById(R.id.btnDefinirPreferencias);
        btnRecuperar = findViewById(R.id.btnRecuperarPreferencias);

        // 2. Asignar el listener de clic a esta misma clase
        btnDefinir.setOnClickListener(this);
        btnRecuperar.setOnClickListener(this);
    }

    /**
     * --- MÉTODO DE LA INTERFAZ ---
     * Este es el método que nos obliga a implementar View.OnClickListener.
     * Se llamará automáticamente cuando CUALQUIER vista que tenga
     * registrado "this" como listener sea pulsada.
     *
     * @param v La vista que ha sido pulsada (el botón).
     */
    @Override
    public void onClick(View v) {
        // Comprobamos boton

        int id = v.getId();
        if (id == R.id.btnDefinirPreferencias) {
            // --- Lógica para ABRIR preferencias ---
            Intent intent = new Intent(this, PreferenciasAppActivity.class);
            startActivity(intent);
        } else if (id == R.id.btnRecuperarPreferencias) {
            // --- Lógica para MOSTRAR preferencias ---
            SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(this);

            boolean unicoSO = pref.getBoolean("clave_check_unico_so", false);
            String sistema = pref.getString("clave_lista_so", "No seleccionado");
            String version = pref.getString("clave_edit_version", "No introducida");

            Log.d("PREFERENCIAS", "--- Mostrando Preferencias Guardadas ---");
            Log.d("PREFERENCIAS", "Único S.O.: " + unicoSO);
            Log.d("PREFERENCIAS", "Sistema Operativo: " + sistema);
            Log.d("PREFERENCIAS", "Versión: " + version);
        }
    }
}
