package com.example.pdm;

import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.List;

public class Launcher extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_launcher);
        ListView lv = findViewById(R.id.listView);
        PackageManager packageManager = getPackageManager();
        List<ApplicationInfo> packaceInfoList = packageManager.getInstalledApplications(PackageManager.GET_META_DATA);
        AppAdapter appAdapter = new AppAdapter(this, R.layout.item_lista, packaceInfoList);
        lv.setAdapter(appAdapter);
        Button backBtn = findViewById(R.id.backBtn);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Launcher.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}