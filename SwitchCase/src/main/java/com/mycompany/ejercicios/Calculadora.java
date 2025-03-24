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
public class Calculadora {

    public  void calculate() {
        Scanner scanner = new Scanner(System.in);

        // Definir los números
        int num1 = 10;
        int num2 = 5;

        // Pedir el operador
        System.out.print("Ingrese un operador (+, -, *, /, %): ");
        char operador = scanner.next().charAt(0);

        // Variable para almacenar el resultado
        int resultado;

        // Evaluar el operador con switch-case
        switch (operador) {
            case '+':
                resultado = num1 + num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '-':
                resultado = num1 - num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '*':
                resultado = num1 * num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("Error: División por cero.");
                }
                break;
            case '%':
                if (num2 != 0) {
                    resultado = num1 % num2;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("Error: División por cero.");
                }
                break;
            default:
                System.out.println("Operador no válido.");
        }

        scanner.close();
    }
    
}
