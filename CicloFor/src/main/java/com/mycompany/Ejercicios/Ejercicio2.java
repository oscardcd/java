/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Ejercicios;

/**
 *
 * @author oscarcorrea
 */
public class Ejercicio2 {

    public void Divisores() {
        int numero = 24; // Número definido previamente

        System.out.println("Los divisores de " + numero + " son:");

        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) { // Verifica si i es divisor de numero
                System.out.print(i + " ");
            }
        }

    }

}
