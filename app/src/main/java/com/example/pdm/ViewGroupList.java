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

import java.util.List;

public class ViewGroupList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // 1-) Um View Group é um conteiner que agrupa e organiza as views, com o uso de um View Group é possivel definir layouts para as views na interface.
        // 2-) A classe LayoutParams é carregada após a definição do layout de uma view e ela é essencial, pois ela que define as configurações de um ViewGroup.
        // 4-) As propriedades wrap_content e match_parent são usadas para definir a largura e a altura. Wrap Content ocupa apenas o espaço necessário na view e Match Parent
        // ocupa tod o espaço do container pai.
        // 5-) A propriedade Gravity é utilizada para definir o posicionamento geral das views no Linear Layout.
        // 6-)
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_view_group_list);
        Button backBtn = findViewById(R.id.backBtn);
        Button ex3 = findViewById(R.id.btn3);
        Button ex6 = findViewById(R.id.btn6);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ViewGroupList.this, MainActivity.class);
                startActivity(intent);
            }
        });
        ex3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ViewGroupList.this, ListEx3.class);
                startActivity(intent);
            }
        });
        ex6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ViewGroupList.this, ListEx6.class);
                startActivity(intent);
            }
        });
    }
}