package com.example.lista;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recycler;
    private com.example.lista.PlacaAdapter adapter;
    private ArrayList<Placa> itens;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recycler = findViewById(R.id.recycler);
        itens = new ArrayList<Placa>();
        itens.add(new Placa("RX 6600 XT","AMD"));
        itens.add(new Placa("I5 10400F","INTEL"));
        itens.add(new Placa("8GB DDR4 2400MHZ","HYPER X"));
        itens.add(new Placa("SSD M2 512GB","XPG"));
        itens.add(new Placa("FONTE 500W","CORSAIR"));

        adapter = new PlacaAdapter(MainActivity.this, itens);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this,LinearLayoutManager.VERTICAL,false);
        recycler.setLayoutManager(layoutManager);
        recycler.setAdapter(adapter);
    }
}