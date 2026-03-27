package br.com.exercicios.spring.exemplo01.entity;

public class Equipamento {
    private String nome;
    private String descricao;
    private int numeroPatrimonio;

    public Equipamento() {

    }

    public Equipamento(String nome, String descricao, int numeroPatrimonio) {
        this.nome = nome;
        this.descricao = descricao;
        this.numeroPatrimonio = numeroPatrimonio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getNumeroPatrimonio() {
        return numeroPatrimonio;
    }

    public void setNumeroPatrimonio(int numeroPatrimonio) {
        this.numeroPatrimonio = numeroPatrimonio;
    }
}
