package br.com.dio.exercicios;

import java.util.Scanner;

/*
 * Faça um programa que peça N numeros. Calcule e mostre a quantidade de numeros
 * pares e impares.*/

public class Ex4_ParEImpar {

	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			int qtdNum;
			int num;
			int pares = 0;
			int impares = 0;
			int count = 0;

			System.out.println("Informe a quantidade de números: ");
			qtdNum = scan.nextInt();

			do {
				System.out.println("Digite um número: ");
				num = scan.nextInt();

				if (num % 2 == 0)
					pares++;
				else
					impares++;

				count++;

			} while (count < qtdNum);

			System.out.println("Quantidade de números pares: " + pares);
			System.out.println("Quantidade de números impares: " + impares);
		}

	}

}
