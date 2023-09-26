package com.jeff.myapplication;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class EventDetailActivity extends AppCompatActivity {

    private boolean isFavorite = false; // Status inicial do favorito

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_detail);

        // Receba informações do evento da Intent
        Intent intent = getIntent();
        String eventTitle = intent.getStringExtra("event_title");
        String eventAddress = intent.getStringExtra("event_address");
        String eventDateTime = intent.getStringExtra("event_date_time");

        ImageView eventDetailImageView = findViewById(R.id.eventDetailImageView);
        TextView eventDetailTitle = findViewById(R.id.eventDetailTitle);
        TextView eventDetailAddress = findViewById(R.id.eventDetailAddress);
        TextView eventDetailDateTime = findViewById(R.id.eventDetailDateTime);

        // Defina as informações nos elementos de interface
        eventDetailTitle.setText(eventTitle);
        eventDetailAddress.setText(eventAddress);
        eventDetailDateTime.setText(eventDateTime);

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

        // Configurar o ouvinte de clique para o botão "Favoritos"
        Button btnFavorites = findViewById(R.id.btnFavorites);
        btnFavorites.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Alternar o status de favoritos do evento
                isFavorite = !isFavorite;

                // Atualizar o texto do botão com base no novo status de favoritos
                updateFavoritesButton();
            }
        });

        // Inicialize o texto do botão "Favoritos" com base no status inicial
        updateFavoritesButton();
    }

    // Método para atualizar o texto do botão "Favoritos" com base no status atual
    private void updateFavoritesButton() {
        Button btnFavorites = findViewById(R.id.btnFavorites);

        if (isFavorite) {
            btnFavorites.setText("Favoritos");
        } else {
            btnFavorites.setText("Favoritos");
        }
    }
}
