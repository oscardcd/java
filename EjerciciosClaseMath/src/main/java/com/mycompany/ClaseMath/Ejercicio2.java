/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ClaseMath;

/**
 *
 * @author oscarcorrea
 */
public class Ejercicio2 {
    public void calcularRaizCuadrada() {
        // Números dados
        int[] numeros = {2, 8, 9, 27, 28, 55, 121};

        // Calcular y mostrar la raíz cuadrada de cada número
        for (int num : numeros) {
            double raiz = Math.sqrt(num);
            System.out.println("Raíz cuadrada de " + num + " es: " + raiz);
        }
    }
}

