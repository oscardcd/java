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
public class Ejercicio3 {

    public  void DividirPalabra() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una palabra: ");
        String palabra = scanner.nextLine();

        // Crear un vector del tamaño de la palabra
        char[] caracteres = new char[palabra.length()];

        // Almacenar cada carácter en el vector
        for (int i = 0; i < palabra.length(); i++) {
            caracteres[i] = palabra.charAt(i);
        }

        // Mostrar los caracteres almacenados en el vector
        System.out.println("Los caracteres almacenados en el vector son:");
        for (char c : caracteres) {
            System.out.print(c + " ");
        }

        scanner.close();
    }
}


