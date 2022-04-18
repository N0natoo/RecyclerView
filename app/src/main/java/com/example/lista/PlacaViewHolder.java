package com.example.lista;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PlacaViewHolder extends RecyclerView.ViewHolder {

    TextView nome, marca;

    public PlacaViewHolder(@NonNull View itemView) {
        super(itemView);
        nome = itemView.findViewById(R.id.nome);
        marca = itemView.findViewById(R.id.marca);
    }
}
