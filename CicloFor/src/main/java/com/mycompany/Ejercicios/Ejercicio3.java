package com.mycompany.Ejercicios;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author oscarcorrea
 */
public class Ejercicio3 {
    
   
    public  void NumeroPerfecto() {
        int numero = 28; // Número definido previamente
        int sumaDivisores = 0;

        // Encontrar los divisores propios y sumarlos
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                sumaDivisores += i;
            }
        }

        // Verificar si el número es perfecto
        if (sumaDivisores == numero) {
            System.out.println(numero + " es un número perfecto.");
        } else {
            System.out.println(numero + " no es un número perfecto.");
        }
    }

}
