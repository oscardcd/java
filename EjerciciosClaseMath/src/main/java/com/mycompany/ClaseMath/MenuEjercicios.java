/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ClaseMath;

/**
 *
 * @author oscarcorrea
 */
import java.util.Scanner;

public class MenuEjercicios {

    public void showMenu() {

        Ejercicio1 E1 = new Ejercicio1();
        Ejercicio2 E2 = new Ejercicio2();
        Ejercicio3 E3 = new Ejercicio3();
        Ejercicio4 E4 = new Ejercicio4();

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== MENÚ PRINCIPAL ===");
            System.out.println("1. Calcular potencia (Ejercicio1)");
            System.out.println("2. Calcular raíz cuadrada (Ejercicio2)");
            System.out.println("3. Calcular promedio de notas (Ejercicio3)");
            System.out.println("4. Calcular mayor entre dos números redondeados (Ejercicio4)");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 ->
                    E1.mostrarExponente();
                case 2 ->
                    E2.calcularRaizCuadrada();
                case 3 ->
                    E3.promedioGenerado();
                case 4 ->
                    E4.mostrarNumeroMayor();
                case 5 ->
                    System.out.println("Saliendo del programa...");
                default ->
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        } while (opcion != 5);

        sc.close();
    }
}
