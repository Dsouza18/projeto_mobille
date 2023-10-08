package com.jeff.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.EventoViewHolder> {


    private List<Evento> eventos;


    private Context contexto;

    public Adapter(Context context, List lista) {
        this.contexto = context;
        this.eventos = lista;
    }


    @NonNull
    @Override
    public EventoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(contexto).inflate(R.layout.itemlista, parent, false);
        return new EventoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull EventoViewHolder holder, int position) {
        Evento evento = eventos.get(position);
        holder.setTitulo(evento.getTitulo());
        holder.setData(evento.getData());
    }

    @Override
    public int getItemCount() {
        return eventos.size();
    }

    class EventoViewHolder extends RecyclerView.ViewHolder {

        private TextView titulo;

        public void setTitulo(String titulo) {
            this.titulo.setText(titulo);
        }

        public void setData(String data) {
            this.data.setText(data);
        }

        private TextView data;
        private ImageView imagem;

        public EventoViewHolder(@NonNull View itemView) {
            super(itemView);
            titulo = itemView.findViewById(R.id.titulo);
            data = itemView.findViewById(R.id.data);
        }
    }

}
