/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ClaseMath;

/**
 *
 * @author oscarcorrea
 */
public class Ejercicio3 {
    public  void promedioGenerado() {
        // Generar 5 números aleatorios entre 0 y 10
        int nota1 = (int) (Math.random() * 11);
        int nota2 = (int) (Math.random() * 11);
        int nota3 = (int) (Math.random() * 11);
        int nota4 = (int) (Math.random() * 11);
        int nota5 = (int) (Math.random() * 11);

        // Calcular el promedio
        double promedio = (nota1 + nota2 + nota3 + nota4 + nota5) / 5.0;

        // Mostrar resultados
        System.out.println("Notas generadas: " + nota1 + ", " + nota2 + ", " + nota3 + ", " + nota4 + ", " + nota5);
        System.out.println("Promedio: " + promedio);
    }
}

