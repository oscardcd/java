/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Ejercicios;
import java.util.Random;
/**
 *
 * @author oscarcorrea
 */
public class Ejercicio4 {
    


    public  void OperacionesSumatoria() {
        int numero = 5; // Número definido previamente
        int sumatoria = 0;

        // Calcular la sumatoria desde 0 hasta el número definido
        for (int i = 0; i <= numero; i++) {
            sumatoria += i;
        }
        
        System.out.println("Sumatoria desde 0 hasta " + numero + " es: " + sumatoria);

        // 1. Raíz cuadrada de la sumatoria
        double raizCuadrada = Math.sqrt(sumatoria);
        System.out.println("Raíz cuadrada de la sumatoria: " + raizCuadrada);

        // 2. Generar un número aleatorio entre 1 y la sumatoria
        Random random = new Random();
        int numeroAleatorio = random.nextInt(sumatoria) + 1;
        System.out.println("Número aleatorio entre 1 y " + sumatoria + ": " + numeroAleatorio);

        // 3. Determinar los divisores de la sumatoria
        System.out.print("Divisores de " + sumatoria + ": ");
        for (int i = 1; i <= sumatoria; i++) {
            if (sumatoria % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        // 4. Calcular el factorial de la sumatoria
        long factorial = 1;
        for (int i = 1; i <= sumatoria; i++) {
            factorial *= i;
        }
        System.out.println("Factorial de la sumatoria: " + factorial);

        // 5. Verificar si la sumatoria es un número perfecto
        int sumaDivisores = 0;
        for (int i = 1; i < sumatoria; i++) {
            if (sumatoria % i == 0) {
                sumaDivisores += i;
            }
        }
        if (sumaDivisores == sumatoria) {
            System.out.println(sumatoria + " es un número perfecto.");
        } else {
            System.out.println(sumatoria + " no es un número perfecto.");
        }
    }


}
