package com.example.myfirswtapplication_jj;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("EJEMPLO_JUAN", "Estoy onCreate");
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main_2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("EJEMPLO_JUAN", "Estoy onDestroy");
        Intent ejemplo= new Intent(Intent.ACTION_VIEW);
        ejemplo.setData(Uri.parse("http://www.google.es"));
        startActivity(ejemplo);

    }
}