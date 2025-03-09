/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ClasesOperadores;

/**
 *
 * @author oscarcorrea
 */
public class Ejercicio1 {

    public void calcularPromedio() {
           // Variable para almacenar el nombre del estudiante
        String nombre = "Juan Pérez";

        // Variables para almacenar las 5 notas
        double nota1 = 8.5;
        double nota2 = 7.9;
        double nota3 = 9.2;
        double nota4 = 6.8;
        double nota5 = 8.0;

        // Cálculo del promedio
        double promedio = (nota1 + nota2 + nota3 + nota4 + nota5) / 5;

        // Mostrar el resultado
        System.out.println("Estudiante: " + nombre);
        System.out.println("Promedio final: " + promedio);
    }
}
