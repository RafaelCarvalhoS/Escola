package br.edu.faeterj.escola;

public class Aluno {
    private String nome;
    private String materia;
    private String sigla;
    private String periodo;
    private int idade;
    private int matricula;

    public Aluno(String nome, String materia, String siglaMateria, String periodo, int idade, int matricula) {
        this.nome = nome;
        this.materia = materia;
        this.sigla = siglaMateria;
        this.periodo = periodo;
        this.idade = idade;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getSiglaMateria() {
        return sigla;
    }

    public void setSiglaMateria(String siglaMateria) {
        this.sigla = siglaMateria;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    public String toString() {
		return "Nome do Aluno: " + nome + "\nNome da materia: " + materia + "\nSigla: " + sigla + "\nPeriodo: " + periodo + "\nIdade: " + idade + "\nMatricula: " + matricula;
	}
}