package com.example.layoutsapp;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        // setContentView(R.layout.linear_layout);
        // setContentView(R.layout.act_4_2);
        // setContentView(R.layout.act_4_1_1);
        // setContentView(R.layout.act_4_1_2);
        // setContentView(R.layout.act_4_1_3);
        // setContentView(R.layout.act_4_1_4);
         setContentView(R.layout.act_4_4);
        // setContentView(R.layout.activity_main);
        // setContentView(R.layout.screen_red);
        // setContentView(R.layout.vertical_layout);
        // setContentView(R.layout.frame_layout);
        // setContentView(R.layout.table_layout);
        //setContentView(R.layout.constraint_layout);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}