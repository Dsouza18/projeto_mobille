package com.jeff.myapplication;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class EventDetailActivity extends AppCompatActivity {

    private boolean isFavorite = false; // Status inicial do favorito

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_detail);
        List<Evento> lista = new ArrayList<>();

        lista.add(new Evento("CoffeBreak","11/10/2023"));
        lista.add(new Evento("InfoUcsal","11/10/2023"));
        lista.add(new Evento("Cerimônia de encerramento","11/10/2023"));


        RecyclerView recyclerView = findViewById(R.id.detalhe_rv_lista);
        Adapter adapter = new Adapter(this, lista);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Configurar o ouvinte de clique para o botão "Voltar"
        Button btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Ação ao clicar em "Voltar" (fechar a atividade e voltar à tela anterior)
                finish();
            }
        });

        // Configurar o ouvinte de clique para o botão "Comprar Ingresso"
        Button btnBuyTicket = findViewById(R.id.btnBuyTicket);
        btnBuyTicket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Ação ao clicar em "Comprar Ingresso" (abrir uma URL de compra)
                String urlCompra = "https://exemplo.com/comprar_ingresso";
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(urlCompra));
                startActivity(browserIntent);
            }
        });

    }
}