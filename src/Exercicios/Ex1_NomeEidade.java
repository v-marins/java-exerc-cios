package br.com.dio.exercicios.src.Exercicios;

import java.util.Scanner;

/*
 * Faça um programa que leia conjuntos de dois valores, o primeiro representando o nome do aluno
 * e o segundo, representando a sua idade. Pare o programa inserindo o valor 0 no campo nome.*/

public class Ex1_NomeEidade {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			String nome = null;
			int idade;

			while (true) {
				
				System.out.println("Digite o Nome do Aluno:");
				nome = scan.next();
				if (nome.equals("0"))
					break;

				System.out.println("Digite a idade do Aluno:");
				idade = scan.nextInt();

				System.out.println("===================================");
				System.out.println("O nome do Aluno é: " + nome);
				System.out.println("A idade do Aluno é: " + idade);
				System.out.println("=====================================");

			}
		}

	}

}
