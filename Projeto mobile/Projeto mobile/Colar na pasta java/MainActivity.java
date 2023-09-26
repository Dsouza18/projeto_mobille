package com.jeff.primeiroapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button homeButton = findViewById(R.id.homeButton);
        Button eventButton = findViewById(R.id.eventButton); // Botão "Evento"

        Button favoritesButton = findViewById(R.id.favoritesButton);
        Button exitButton = findViewById(R.id.exitButton);

        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Implemente a lógica para a tela "Home" aqui
                Toast.makeText(MainActivity.this, "Bem-vindo à tela Home!", Toast.LENGTH_SHORT).show();
            }
        });

        eventButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Implemente a lógica para a tela "Evento" aqui
                Intent intent = new Intent(MainActivity.this, EventDetailsActivity.class); // Redireciona para EventDetailsActivity
                startActivity(intent);
            }
        });

        favoritesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Implemente a lógica para a tela "Favoritos" aqui
            }
        });

        exitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Implemente a lógica para sair do aplicativo aqui
                finish();
            }
        });
    }
}
