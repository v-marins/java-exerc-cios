package br.com.dio.exercicios.src.Exercicios;

import java.util.Scanner;

/*
 * Desenvolva um gerador de tabuada capaz de gerar a tabuada de qualquer numero
 * inteiro. O usuario deve informar o numero da tabuada.*/

public class Ex5_Tabuada {

	public static void main(String[] args) {

		try (Scanner scan = new Scanner(System.in)) {
			int num;

			System.out.println("Digite o número da tabuada: ");
			num = scan.nextInt();

			System.out.println("Tabuada de " + num);
			System.out.println("=======================");

			for (int i = 1; i <= 10; i++) {

				System.out.println(num + " x " + i + " = " + (num * i));

			}
		}

	}

}
