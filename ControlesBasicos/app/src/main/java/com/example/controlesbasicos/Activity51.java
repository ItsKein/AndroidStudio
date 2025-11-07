package com.example.controlesbasicos;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class Activity51 extends AppCompatActivity {

//    protected void onCreate(Bundle savedInstance) {
//        super.onCreate(savedInstance);
//        setContentView(R.layout.activity_5_1);
//    }


    // Ejercicio 2
    protected void onCreate(Bundle savedInstance) {
        super.onCreate(savedInstance);
        setContentView(R.layout.activity_5_1);

        TextView tvContenido = findViewById(R.id.tvContenido);
        tvContenido.setText("Texto construido desde Java. \n Tamaño 20dp, Italic y color Blue");
        tvContenido.setTextColor(ContextCompat.getColor(this, R.color.custom_blue));
        tvContenido.setTypeface(null, Typeface.BOLD_ITALIC);
        tvContenido.setTextSize(20);
    }
}
