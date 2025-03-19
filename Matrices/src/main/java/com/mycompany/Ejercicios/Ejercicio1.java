/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Ejercicios;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author oscarcorrea
 */
public class Ejercicio1 {

    public static void MatricesEjercicio1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Definir tamaño de la matriz
        System.out.print("Ingrese el número de filas (N): ");
        int N = scanner.nextInt();
        System.out.print("Ingrese el número de columnas (M): ");
        int M = scanner.nextInt();

        int[][] matrizPares = new int[N][M];
        int[][] matrizImpares = new int[N][M];
        int[][] matrizSuma = new int[N][M];

        // Llenar matrices con valores aleatorios
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                // Números pares entre 0 y 100
                matrizPares[i][j] = random.nextInt(51) * 2;
                // Números impares entre 0 y 50
                matrizImpares[i][j] = random.nextInt(25) * 2 + 1;
                // Suma de ambas matrices
                matrizSuma[i][j] = matrizPares[i][j] + matrizImpares[i][j];
            }
        }

        // Imprimir las matrices
        System.out.println("\nMatriz de números pares:");
        imprimirMatriz(matrizPares);
        System.out.println("\nMatriz de números impares:");
        imprimirMatriz(matrizImpares);
        System.out.println("\nMatriz suma:");
        imprimirMatriz(matrizSuma);

        scanner.close();
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.print(valor + "\t");
            }
            System.out.println();
        }
    }
}
