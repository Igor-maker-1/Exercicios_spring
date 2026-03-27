package br.com.exercicios.spring.exemplo01.entity;

import java.time.LocalDate;
import java.util.Date;

public class Emprestimo {
    private String nomeUsuario;
    private String itemEmprestado;
    private LocalDate data;

    public Emprestimo() {

    }

    public Emprestimo(String nomeUsuario, String itemEmprestado, LocalDate data) {
        this.nomeUsuario = nomeUsuario;
        this.itemEmprestado = itemEmprestado;
        this.data = data;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getItemEmprestado() {
        return itemEmprestado;
    }

    public void setItemEmprestado(String itemEmprestado) {
        this.itemEmprestado = itemEmprestado;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
}
