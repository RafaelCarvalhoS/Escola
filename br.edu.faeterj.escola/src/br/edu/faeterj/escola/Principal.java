package br.edu.faeterj.escola;

import java.util.Scanner;

public class Principal {
	
    public static void main(String[] args) {
    	
    	String nome;
    	String materia;
    	String siglaMateria;
    	String periodo;
    	int idade;
    	int matricula;
    	
    	Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do aluno:");
        nome = scanner.nextLine();

        System.out.println("Digite a materia do aluno:");
        materia = scanner.nextLine();

        System.out.println("Digite a sigla da materia:");
        siglaMateria = scanner.nextLine();

        System.out.println("Digite o periodo que esta cursando:");
        periodo = scanner.nextLine();

        System.out.println("Digite a idade do aluno:");
        idade = scanner.nextInt();
        scanner.nextLine(); 

        System.out.println("Digite a matricula do aluno:");
        matricula = scanner.nextInt();

        Aluno aluno = new Aluno(nome, materia, siglaMateria, periodo, idade, matricula);
        System.out.println(aluno.toString());
  
        scanner.close();
    }
}