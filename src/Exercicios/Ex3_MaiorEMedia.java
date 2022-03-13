package br.com.dio.exercicios.src.Exercicios;

import java.util.Scanner;

/*
 * Faça um programa que leia 5 numeros e informe o maior número e a média 
 * desses números.*/

public class Ex3_MaiorEMedia {
	public static void main(String[] args) {

		try (Scanner scan = new Scanner(System.in)) {
			int num;
			int maior = 0;
			int soma = 0;
			int count = 0;
			
			do {
				System.out.println("Digite um número:");
				num = scan.nextInt();
				
				soma += num;
				
				if(num > maior) maior = num;
				
				count++;
			} while (count < 5);
			
			System.out.println("O Maior número é: " + maior);
			System.out.println("A Média é: " + (soma / 5));
		}

	}

}
