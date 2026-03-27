package br.com.exercicios.spring.exemplo01.entity;

import java.time.LocalDate;

public class EventoEscolar {
    private String nome;
    private LocalDate data;
    private String local ;

    public EventoEscolar() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public EventoEscolar(String nome, LocalDate data, String local) {
        this.nome = nome;
        this.data = data;
        this.local = local;
    }}
