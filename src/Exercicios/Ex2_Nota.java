package br.com.dio.exercicios.src.Exercicios;

import java.util.Scanner;

/*
 * Faça um programa que peça uma nota entre 0 e 10, passe uma mensagem caso o valor seja invalido
 * e que continue pedido essa nota ate que o usuario informe um valor valido.*/

public class Ex2_Nota {

	public static void main(String[] args) {

		try (Scanner scan = new Scanner(System.in)) {
			int nota = 0;

			System.out.println("Insira o valor da nota:");
			nota = scan.nextInt();

			while (nota > 10 || nota < 0) {
				System.out.println("Nota Inválida! Digite Novamente:");
				nota = scan.nextInt();

			}
		}

	}

}
