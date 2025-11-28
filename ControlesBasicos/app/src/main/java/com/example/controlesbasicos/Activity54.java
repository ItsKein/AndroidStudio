package com.example.controlesbasicos;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

public abstract class Activity54 extends AppCompatActivity implements TextView.OnEditorActionListener {
    private EditText correoEditText;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5_4);
        correoEditText = findViewById(R.id.editTextEmail);

        correoEditText.setOnEditorActionListener(this);
        correoEditText.addTextChangedListener(this);
    }



}
