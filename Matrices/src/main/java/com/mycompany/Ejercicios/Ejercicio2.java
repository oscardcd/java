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
public class Ejercicio2 {

    public  void MatrizMayor() {
        Random random = new Random();
        int[][] matriz = new int[5][3];
        int mayor = Integer.MIN_VALUE;

        // Llenar la matriz con valores aleatorios y encontrar el mayor
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = random.nextInt(51);
                if (matriz[i][j] > mayor) {
                    mayor = matriz[i][j];
                }
            }
        }

        // Imprimir la matriz y el número mayor
        System.out.println("Matriz generada:");
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.print(valor + "\t");
            }
            System.out.println();
        }
        System.out.println("\nEl número mayor en la matriz es: " + mayor);
    }
}

    

