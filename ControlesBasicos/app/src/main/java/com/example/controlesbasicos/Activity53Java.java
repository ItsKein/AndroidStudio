package com.example.controlesbasicos;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class Activity53Java extends AppCompatActivity implements View.OnClickListener {

    private TextView tvMensaje;

    protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_5_3_on_click);
}

    public void onClick(View v) {
        int id = v.getId();
        tvMensaje = findViewById((R.id.tvMensaje));
    if (id == R.id.btnBoton1) {
        tvMensaje.setText(R.string.boton_1_pulsado);
        tvMensaje.setTextColor(ContextCompat.getColor(Activity53Java.this, R.color.miColorRed));
    } else if (id == R.id.btnBoton2) {
        tvMensaje.setText(R.string.boton_2_pulsado);
        tvMensaje.setTextColor(ContextCompat.getColor(Activity53Java.this, R.color.custom_blue));
    } else {
        //Codigo por defecto
    }
}
}