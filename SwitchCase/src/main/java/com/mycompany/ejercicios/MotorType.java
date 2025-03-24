/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios;

import java.util.Scanner;

/**
 *
 * @author oscarcorrea
 */
public class MotorType {
    public void validateType() {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el tipo de motor
        System.out.print("Ingrese el tipo de motor (0-3): ");
        int motorType = scanner.nextInt();

        // Determinar el tipo de fluido con switch-case
        switch (motorType) {
            case 0:
                System.out.println("No hay establecido un valor definido para el tipo.");
                break;
            case 1:
                System.out.println("Agua");
                break;
            case 2:
                System.out.println("Gasolina");
                break;
            case 3:
                System.out.println("Hormigón");
                break;
            default:
                System.out.println("No existe un valor válido.");
                break;
        }

        scanner.close();
    }
}
