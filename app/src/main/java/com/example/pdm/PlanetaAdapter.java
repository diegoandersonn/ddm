package com.example.pdm;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PlanetaAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    Context context;
    int mResource;
    List<Planeta> mListPlaneta;
    public PlanetaAdapter(Context context, int mResource, List<Planeta> mListPlaneta) {
        this.context = context;
        this.mResource = mResource;
        this.mListPlaneta = mListPlaneta;
    }
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = ViewGroup.inflate(context, mResource, null);
        return new RecyclerView.ViewHolder(v)
    }
    public class PlanetaVH extender RecyclerView.ViewHolder {
        TextView tvNome;
        ImageView ivFoto;
        public PlanetaVH(@NonNull View itemView) {
            super(itemView);
            tvNome = itemView.findView
        }
    }
}
