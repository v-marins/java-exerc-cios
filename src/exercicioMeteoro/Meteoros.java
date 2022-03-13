package br.com.dio.exercicios.src.exercicioMeteoro;

import java.util.Scanner;

public class Meteoros {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int x1, y1, x2, y2; // coordenadas da fazenda
        int x, y; // coordenadas do meteoro
        int n; // numero de meteoros
        int contador;
        int contTeste = 0;


        do {
            x1 = scan.nextInt();
            y1 = scan.nextInt();
            x2 = scan.nextInt();
            y2 = scan.nextInt();

            if (x1 != 0 || y1 != 0 || x2 != 0 || y2 != 0) { // Testa se existem 4 zeros, se sim, encerra o programa.

                n = scan.nextInt();
                contTeste++;
                contador = 0;

                for (int i = 0; i < n; i++) {

                    x = scan.nextInt();
                    y = scan.nextInt();
                    if (x >= x1 && x <= x2 && y >= y2 && y <= y1) {
                        contador++;
                    }
                }
                System.out.println("Teste "+contTeste);
                System.out.println(contador);
                System.out.println("");
            }

        } while(x1 != 0 ||y1 != 0 || x2 != 0 || y2 != 0); // Variáveis != 0 tornam a expressão verdadeira.
    }
}
