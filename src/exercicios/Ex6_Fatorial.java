package br.com.dio.exercicios.exercicios;

import java.util.Scanner;

/*
 * Faça um prograa que calcule o fatorial de um numero inteiro fornecido pelo usuario.*/

public class Ex6_Fatorial {
	
	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			int num;
			int multiplicação = 1;
			
			
			System.out.println("Escolha um número inteiro:");
			num = scan.nextInt();
			
			System.out.print(num + "! = ");
			
			for(int i = num; i >= 1; i--) {
				
				multiplicação *= i;	
				
			}
					
			System.out.println(multiplicação);
		}
		
		
	}

}
