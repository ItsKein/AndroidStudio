package com.example.controlesbasicos;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class Activity53OnClick extends AppCompatActivity {

    private TextView tvMensaje;
    public void onBotonPulsado (View view) {
        int id = view.getId();
        tvMensaje = findViewById((R.id.tvMensaje));
        if (id == R.id.btnBoton1) {
            tvMensaje.setText(R.string.boton_1_pulsado);
            tvMensaje.setTextColor(ContextCompat.getColor(Activity53OnClick.this, R.color.miColorRed));
        } else if (id == R.id.btnBoton2) {
            tvMensaje.setText(R.string.boton_2_pulsado);
            tvMensaje.setTextColor(ContextCompat.getColor(Activity53OnClick.this, R.color.custom_green));
        } else {
            //Codigo por defecto
        }
    }

}
