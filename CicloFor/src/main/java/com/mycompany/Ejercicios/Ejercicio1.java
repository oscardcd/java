/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Ejercicios;

/**
 *
 * @author oscarcorrea
 */
public class Ejercicio1 {

    public static void Factorial() {
        int numero = 5; // Número definido previamente
        long factorial = 1; // Se usa long para manejar números grandes

        for (int i = 1; i <= numero; i++) {
            factorial *= i; // Multiplicación acumulativa
        }

        System.out.println("El factorial de " + numero + " es: " + factorial);

    }

}
