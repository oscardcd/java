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
public class Ejercicio2 {

    public class MayorDeTres {

        public void mostrarMayor() {
            Scanner scanner = new Scanner(System.in);

            // Solicitar los tres números al usuario
            System.out.print("Ingrese el primer número: ");
            int num1 = scanner.nextInt();

            System.out.print("Ingrese el segundo número: ");
            int num2 = scanner.nextInt();

            System.out.print("Ingrese el tercer número: ");
            int num3 = scanner.nextInt();

            // Determinar el número mayor
            int mayor = num1;

            if (num2 > mayor) {
                mayor = num2;
            }
            if (num3 > mayor) {
                mayor = num3;
            }

            // Mostrar el resultado
            System.out.println("El número mayor es: " + mayor);

            scanner.close();
        }

    }
}
