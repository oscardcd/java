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
public class ContarCifras {
    public void mostrarCifrasContadas(){
          Scanner scanner = new Scanner(System.in);

        // Solicitar el número al usuario
        System.out.print("Ingrese un número (máximo 4 cifras): ");
        int numero = scanner.nextInt();

        // Convertir el número a cadena para contar sus cifras
        String numeroStr = Integer.toString(Math.abs(numero)); // Se usa Math.abs para manejar números negativos

        // Verificar si el número tiene más de 4 cifras
        if (numeroStr.length() > 4) {
            System.out.println("El número supera las 4 cifras.");
        } else {
            System.out.println("El número tiene " + numeroStr.length() + " cifras.");
        }

        scanner.close();
    }
    
}
