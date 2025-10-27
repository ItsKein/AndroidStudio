package com.example.myfirswtapplication_jj;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("EJEMPLO_JUAN", "Estoy onCreate");
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("EJEMPLO_JUAN", "Estoy onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("EJEMPLO_JUAN", "Estoy onStop");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("EJEMPLO_JUAN", "Estoy onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("EJEMPLO_JUAN", "Estoy onPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("EJEMPLO_JUAN", "Estoy onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("EJEMPLO_JUAN", "Estoy onDestroy");
        Intent ejemplo = new Intent(this, MainActivity_2.class);
        startActivity(ejemplo);



    }
}