package br.com.dio.exercicios.exercicios;

import java.util.Random;

/*
 *Faça um programa que leia 20 numeros inteiros aleatorios, entre 0 e 100 e armazene em um vetor.
 *Ao final, mostre os numeros e seus sucessores. */

public class Ex9_NumerosAleatorios {
	public static void main(String[] args) {

		Random random = new Random();

		int[] numAleatorios = new int[20];

		for (int i = 0; i < numAleatorios.length; i++) {
			int numeros = random.nextInt(100);
			numAleatorios[i] = numeros;
		}

		System.out.println("Numeros Aleatórios: ");
		for (int i : numAleatorios) {
			System.out.print((i) + " ");
		}

		System.out.println("\n" + "Sucessores numeros aleatórios: ");
		for (int i : numAleatorios) {
			System.out.print((i + 1) + " ");
		}

	}

}
