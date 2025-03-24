/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.Ejercicios;

import java.util.Scanner;

/**
 *
 * @author oscarcorrea
 */
public class Vectores {

    public static void main(String[] args) {
        int option = 0;
        Scanner sc = new Scanner(System.in);

        do {

            System.out.println("\ningrese la opcion deseada:\n"
                    + "1. ejercicio 1\n"
                    + "2. ejercicio2\n"
                    + "3. ejercicio3\n"
                    + "4. SALIR\n"
            );

            option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.println("***** Ejercicio " + option + " *******");
                    Ejercicio1 eje1 = new Ejercicio1();
                    eje1.PesoPersonas();
                    break;
                case 2:
                    System.out.println("***** Ejercicio " + option + " *******");
                    ejercicio2 eje2 = new ejercicio2();
                    eje2.PromedioGrupos();
                    break;
                case 3:
                    System.out.println("***** Ejercicio " + option + " *******");
                    Ejercicio3 eje3 = new Ejercicio3();
                    eje3.DividirPalabra();
                    break;
                case 4:
                    System.out.println("***** saliendo *******");

                default:
                    System.out.println("opcion seleccionada incorrecta");
                    break;

            }
        } while (option != 4);
        sc.close();

    }
}
