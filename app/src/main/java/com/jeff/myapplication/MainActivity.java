package com.jeff.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnEvents = findViewById(R.id.btnEvents);
        Button btnLogout = findViewById(R.id.btnLogout);





        btnEvents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Adicione a lógica para o botão Eventos aqui
                // Suponha que você tenha informações do evento
                String eventTitle = "UCSAL DAY";
                String eventAddress = "Endereço: Rua XYZ, Número 123";
                String eventDateTime = "Data e Hora: 01/01/2024, 10:00 AM";
                String eventAddress1 = "Endereço: Rua Felix, Número 550";
                String eventDateTime1 = "Data e Hora: 01/01/2024, 11:00 AM";

                // Crie uma Intent para abrir a tela de detalhes do evento
                Intent intent = new Intent(MainActivity.this, EventDetailActivity.class);

                // Passar informações do evento como extras na Intent
                intent.putExtra("event_title", eventTitle);
                intent.putExtra("event_address", eventAddress);
                intent.putExtra("event_date_time", eventDateTime);
                intent.putExtra("event_address1", eventAddress1);
                intent.putExtra("event_date_time1", eventDateTime1);

                // Iniciar a Activity de detalhes do evento
                startActivity(intent);
            }
        });

        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Adicione a lógica para o botão Sair aqui
                Toast.makeText(MainActivity.this, "Saindo do aplicativo", Toast.LENGTH_SHORT).show();
                finish(); // Fecha a atividade e volta à tela anterior ou encerra o aplicativo
            }
        });
    }
}
