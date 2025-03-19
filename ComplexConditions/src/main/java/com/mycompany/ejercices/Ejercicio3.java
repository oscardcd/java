/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercices;

import java.util.Scanner;

/**
 *
 * @author oscarcorrea
 */
public class Ejercicio3 {

    public void NivelPostulante(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar datos al usuario
        System.out.print("Ingrese la cantidad total de preguntas: ");
        int totalPreguntas = scanner.nextInt();

        System.out.print("Ingrese la cantidad de respuestas correctas: ");
        int respuestasCorrectas = scanner.nextInt();

        // Validar que las respuestas correctas no excedan el total de preguntas
        if (respuestasCorrectas > totalPreguntas || totalPreguntas <= 0 || respuestasCorrectas < 0) {
            System.out.println("Error: Datos inválidos. Verifique los valores ingresados.");
        } else {
            // Calcular porcentaje de respuestas correctas
            double porcentaje = (respuestasCorrectas * 100.0) / totalPreguntas;

            // Determinar el nivel según el porcentaje obtenido
            String nivel;
            if (porcentaje >= 90) {
                nivel = "Nivel máximo";
            } else if (porcentaje >= 75) {
                nivel = "Nivel medio";
            } else if (porcentaje >= 50) {
                nivel = "Nivel regular";
            } else {
                nivel = "Fuera de nivel";
            }

            // Mostrar el resultado
            System.out.printf("Porcentaje obtenido: %.2f%%\n", porcentaje);
            System.out.println("Nivel asignado: " + nivel);
        }

        scanner.close();
    }
}
