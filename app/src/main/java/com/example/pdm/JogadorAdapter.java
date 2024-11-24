package com.example.pdm;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class JogadorAdapter extends BaseAdapter {
    private ArrayList<Jogador> jogadores;
    private LayoutInflater inflater;

    public JogadorAdapter(ArrayList<Jogador> jogadores, LayoutInflater inflater) {
        this.jogadores = jogadores;
        this.inflater = inflater;
    }
    @Override
    public int getCount() {
        return jogadores.size();
    }
    @Override
    public Object getItem(int arg0) {
        return jogadores.get(arg0);
    }
    @Override
    public long getItemId(int arg0) {
        return arg0;
    }
    @Override
    public View getView(int arg0, View arg1, ViewGroup arg2) {
        Jogador jtemp = jogadores.get(arg0);
        @SuppressLint("ViewHolder") View v = inflater.inflate(R.layout.activity_jogador_adapter, null);
        TextView playerName = (TextView)v.findViewById(R.id.playerName);
        TextView playerTeam = (TextView)v.findViewById(R.id.playerTeam);
        TextView playerAge = (TextView)v.findViewById(R.id.playerAge);
        playerName.setText(jtemp.nome);
        playerTeam.setText(jtemp.time);
        playerAge.setText(String.valueOf(jtemp.idade));
        return v;
    }
}