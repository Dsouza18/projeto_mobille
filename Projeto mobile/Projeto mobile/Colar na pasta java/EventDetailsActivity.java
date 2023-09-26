package com.jeff.primeiroapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class EventDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_details);

        Button searchButton = findViewById(R.id.searchButton);
        Button backButton = findViewById(R.id.backButton);
        Button buyTicketButton = findViewById(R.id.buyTicketButton);

        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Implemente a lógica de pesquisa aqui
                Toast.makeText(EventDetailsActivity.this, "Pesquisar evento", Toast.LENGTH_SHORT).show();
            }
        });

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Implemente a lógica para voltar à tela anterior (MainActivity) aqui
                finish();
            }
        });

        buyTicketButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Implemente a lógica para comprar ingressos aqui
                Toast.makeText(EventDetailsActivity.this, "Ingresso comprado com sucesso!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
