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
public class ejercicio2 {

    public void PromedioGrupos(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numEstudiantes = 10;
        float[] grupoA = new float[numEstudiantes];
        float[] grupoB = new float[numEstudiantes];

        // Leer notas del Grupo A
        System.out.println("Ingrese las notas del Grupo A:");
        int i = 0;
        float sumaA = 0;
        while (i < numEstudiantes) {
            System.out.print("Nota del estudiante " + (i + 1) + ": ");
            grupoA[i] = scanner.nextFloat();
            sumaA += grupoA[i];
            i++;
        }

        // Leer notas del Grupo B
        System.out.println("\nIngrese las notas del Grupo B:");
        i = 0;
        float sumaB = 0;
        while (i < numEstudiantes) {
            System.out.print("Nota del estudiante " + (i + 1) + ": ");
            grupoB[i] = scanner.nextFloat();
            sumaB += grupoB[i];
            i++;
        }

        // Calcular promedios
        float promedioA = sumaA / numEstudiantes;
        float promedioB = sumaB / numEstudiantes;
        float promedioGeneral = (sumaA + sumaB) / (numEstudiantes * 2);

        // Determinar el grupo con mejor promedio
        String mejorGrupo = (promedioA > promedioB) ? "Grupo A" : "Grupo B";

        // Mostrar resultados
        System.out.println("\nPromedio del Grupo A: " + promedioA);
        System.out.println("Promedio del Grupo B: " + promedioB);
        System.out.println("Promedio general de ambos grupos: " + promedioGeneral);
        System.out.println("El grupo con mejor promedio es: " + mejorGrupo);

        scanner.close();
    }
}
