/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Ejercicios;

import java.util.Random;

/**
 *
 * @author oscarcorrea
 */
public class Ejercicio3 {

    public void MatrizParcial(String[] args) {
        Random random = new Random();
        int[][] matriz = new int[3][4];

        // Llenar la matriz con valores aleatorios
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = random.nextInt(101); // Números entre 0 y 100
            }
        }

        // Imprimir la matriz completa
        System.out.println("Matriz generada:");
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.print(valor + "\t");
            }
            System.out.println();
        }

        // Imprimir la primera fila
        System.out.println("\nPrimera fila:");
        for (int j = 0; j < 4; j++) {
            System.out.print(matriz[0][j] + "\t");
        }

        // Imprimir la segunda columna
        System.out.println("\n\nSegunda columna:");
        for (int i = 0; i < 3; i++) {
            System.out.println(matriz[i][1]);
        }

        // Imprimir la tercera fila
        System.out.println("\nTercera fila:");
        for (int j = 0; j < 4; j++) {
            System.out.print(matriz[2][j] + "\t");
        }
    }
}
