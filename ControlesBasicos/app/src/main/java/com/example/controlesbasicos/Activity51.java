package com.example.controlesbasicos;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;

public class Activity51 extends AppCompatActivity {


    // Ejercicio 5.1.1
//    protected void onCreate(Bundle savedInstance) {
//        super.onCreate(savedInstance);
//        setContentView(R.layout.activity_5_1);
//    }



    protected void onCreate(Bundle savedInstance) {
        super.onCreate(savedInstance);

        // Ejercicio 5.1.2
//        setContentView(R.layout.activity_5_1);
//
//        TextView tvContenido = findViewById(R.id.tvContenido);
//        tvContenido.setText("Texto construido desde Java. \n Tamaño 20dp, Italic y color Blue");
//        tvContenido.setTextColor(ContextCompat.getColor(this, R.color.custom_blue));
//        tvContenido.setTypeface(null, Typeface.BOLD_ITALIC);
//        tvContenido.setTextSize(20);
//    }


        // Ejercicio 5.1.3
        setContentView(R.layout.activity_5_1);
        TextView tvContenido = findViewById(R.id.tvContenido);

        tvContenido.append("\nTexto añadido con Append desde Java");
        tvContenido.setTextColor(ContextCompat.getColor(this, R.color.custom_blue));

        // Ejercicio 5.1.4
//        setContentView(R.layout.activity_5_1);
//        TextView tvContenido = findViewById(R.id.tvContenido);
//        Typeface typeface = ResourcesCompat.getFont(this, R.font.demo_coneriascript);
//        tvContenido.setTypeface(typeface);
    }
}
