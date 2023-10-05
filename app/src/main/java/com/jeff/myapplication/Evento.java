package com.jeff.myapplication;

public class Evento {

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Evento(){
    }

    public Evento(String titulo, String data) {
        this.titulo = titulo;
        this.data = data;
    }

    private String titulo;
    private String data;

}
