package com.example.pdm;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class ListagemPersonalizada extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_listagem_personalizada);
        ArrayList<Jogador> jogadores = new ArrayList<Jogador>();
        jogadores.add(new Jogador("Neymar", "Barcelona", 34));
        jogadores.add(new Jogador("CR7", "Real Madrid", 39));
        jogadores.add(new Jogador("Messi", "Barcelona", 37));
        jogadores.add(new Jogador("Kane", "Tottenham", 30));
        JogadorAdapter jogadorAdapter = new JogadorAdapter(jogadores, getLayoutInflater());
        ListView lv = findViewById(R.id.listView);
        lv.setAdapter(jogadorAdapter);
        Button backBtn = findViewById(R.id.backBtn);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListagemPersonalizada.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}