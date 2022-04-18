package com.example.lista;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PlacaAdapter extends RecyclerView.Adapter<PlacaViewHolder> {

    private Context context;
    private ArrayList<Placa> itens;

    public PlacaAdapter(Context context, ArrayList<Placa> itens) {
        this.context = context;
        this.itens = itens;
    }

    @NonNull
    @Override
    public PlacaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.placa_linha, parent, false);
        PlacaViewHolder viewHolder = new PlacaViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull PlacaViewHolder placaViewHolder, int position) {
        Placa placa = itens.get(position);
        placaViewHolder.nome.setText(placa.getNome());
        placaViewHolder.marca.setText(placa.getMarca());
    }

    @Override
    public int getItemCount() {
        return itens.size();
    }
}
