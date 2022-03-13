package br.com.dio.exercicios.src.Exercicios;

import java.util.Scanner;

/*Faça um programa que leia um vetor de 6 caracteres e diga quantas consoantes
 * foram lidas, imprima as consoantes.*/

public class Ex8_Consoantes {

	public static void main(String[] args) {

		try (Scanner scan = new Scanner(System.in)) {
			String[] consoantes = new String[6];
			int qtdConsoantes = 0;
			int count = 0;

			do {

				System.out.println("Digite somente uma letra: ");
				String letra = scan.next();

				if (!(letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i")
						|| letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u"))) {

					consoantes[count] = letra; // add a letra digitada ao array.
					qtdConsoantes++;

				}

				count++;

			} while (count < consoantes.length);

			System.out.println("Consoantes: ");
			for (String consoante : consoantes) {

				if (consoante != null)
					System.out.print(consoante + " ");
			}

			System.out.println("\n"+"Quantidade de Consoantes: " + qtdConsoantes);
		}

	}

}
