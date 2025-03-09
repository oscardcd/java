/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ClaseMath;

/**
 *
 * @author oscarcorrea
 */
public class Ejercicio4 {
    public void mostrarNumeroMayor() {
        // Generar 2 números aleatorios entre 1 y 50 con decimales
        double num1 = 1 + (Math.random() * 49);
        double num2 = 1 + (Math.random() * 49);

        // Redondear los números con Math.round
        long redondeado1 = Math.round(num1);
        long redondeado2 = Math.round(num2);

        // Obtener el número mayor con Math.max
        long mayor = Math.max(redondeado1, redondeado2);

        // Mostrar resultados
        System.out.println("Número 1: " + num1 + " -> Redondeado: " + redondeado1);
        System.out.println("Número 2: " + num2 + " -> Redondeado: " + redondeado2);
        System.out.println("El número mayor es: " + mayor);
    }
}

