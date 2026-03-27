package br.com.exercicios.spring.exemplo01.entity;

public class Avaliacao {
    private String disciplina;
    private double nota;
    private String nomeAluno;

    public Avaliacao (){

    }

    public Avaliacao(String disciplina, double nota, String nomeAluno) {
        this.disciplina = disciplina;
        this.nota = nota;
        this.nomeAluno = nomeAluno;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }
}
