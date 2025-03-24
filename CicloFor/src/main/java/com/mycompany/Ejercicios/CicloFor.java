/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.Ejercicios;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author oscarcorrea
 */
public class CicloFor {

    public static void main(String[] args) {
        int option;
        System.out.println("ingrese el ejercicio:");

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("ingrese la opcion deseada:\n"
                    + "1. ejercicio 1\n"
                    + "2. ejercicio2\n"
                    + "3. ejercicio3\n"
                    + "4. ejercicio3\n"
                    + "5. SALIR\n"
            );

            option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.println("***** Ejercicio " + option + " *******");

                    Ejercicio1 eje1 = new Ejercicio1();
                    eje1.Factorial();
                    System.out.println("Fecha actual: " + LocalDate.now());
                    break;
                case 2:
                    System.out.println("***** Ejercicio " + option + " *******");

                    Ejercicio2 eje2 = new Ejercicio2();
                    eje2.Divisores();
                    System.out.println("Fecha actual: " + LocalDate.now());

                    break;
                case 3:
                    System.out.println("***** Ejercicio " + option + " *******");

                    Ejercicio3 eje3 = new Ejercicio3();
                    eje3.NumeroPerfecto();
                    System.out.println("Fecha actual: " + LocalDate.now());

                    break;
                case 4:
                    System.out.println("***** Ejercicio " + option + " *******");

                    Ejercicio4 eje4 = new Ejercicio4();
                    eje4.OperacionesSumatoria();
                    System.out.println("Fecha actual: " + LocalDate.now());

                    break;
                case 5:
                    System.out.println("***** saliendo *******");

                default:
                    System.out.println("opcion seleccionada incorrecta");
                    break;
            }
            System.out.println("\n");
        } while (option != 5);
        sc.close();
    }
}
