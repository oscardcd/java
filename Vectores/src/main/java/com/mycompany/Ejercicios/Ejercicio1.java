/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Ejercicios;

import java.util.Scanner;

/**
 *
 * @author oscarcorrea
 */
public class Ejercicio1 {

    public void PesoPersonas() {
        Scanner scanner = new Scanner(System.in);
        float[] pesos = new float[5]; // Vector para almacenar los pesos
        float suma = 0;
        int i = 0;

        // Leer los pesos
        while (i < 5) {
            System.out.print("Ingrese el peso de la persona " + (i + 1) + ": ");
            pesos[i] = scanner.nextFloat();
            suma += pesos[i]; // Acumular la suma
            i++;
        }

        // Calcular promedio
        float promedio = suma / 5;
        System.out.println("\nEl promedio de peso es: " + promedio);

        // Contar personas que superan o están por debajo del promedio
        int superiores = 0, inferiores = 0;
        i = 0;
        while (i < 5) {
            if (pesos[i] > promedio) {
                superiores++;
            } else if (pesos[i] < promedio) {
                inferiores++;
            }
            i++;
        }

        // Mostrar resultados
        System.out.println("Cantidad de personas que superan el promedio: " + superiores);
        System.out.println("Cantidad de personas que están por debajo del promedio: " + inferiores);

        scanner.close();
    }
}
