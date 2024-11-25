package com.example.pdm;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

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
        setContentView(R.layout.activity_main);
        Button btnConversor = findViewById(R.id.btnContador);
        Button btnPaint = findViewById(R.id.btnPaint);
        Button btnVgList = findViewById(R.id.btnVgList);
        Button btnListagem = findViewById(R.id.btnListagem);
        Button btnLauncher = findViewById(R.id.btnLauncher);

        btnConversor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Contador.class);
                startActivity(intent);
            }
        });
        btnPaint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Paint.class);
                startActivity(intent);
            }
        });
        btnVgList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ViewGroupList.class);
                startActivity(intent);
            }
        });
        btnListagem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ListagemPersonalizada.class);
                startActivity(intent);
            }
        });
        btnLauncher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Launcher.class);
                startActivity(intent);
            }
        });
    }
}