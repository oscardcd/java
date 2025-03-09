/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciosvariables;

/**
 *
 * @author oscarcorrea
 */
public class ejercicio2 {

    public void showFixedVariables() {
        // 1. Cambiar "Double" (clase envolvente) por "double" (tipo primitivo)
        double a = 8;

        // 2. 'A' es un carácter, no se puede asignar a un int directamente
        char b = 'A';

        // 3. Correcto: String usa comillas dobles
        String c = "Colombia";

        // 4. Los caracteres en Java se definen con comillas simples, no dobles
        char d = 'A';

        // 5. Los valores numéricos no pueden llevar 'M', eso es de C#.
        float e = 745548f;

        // 6. No se pueden usar números al inicio de un nombre de variable
        int numero;

        // 7. Los nombres de variables no pueden llevar guiones, usar camelCase
        String nombrePersona;

        // 8. Correcto: Declaración de variable double
        double edad;

        // 9. Double.parseDouble() devuelve un double, pero la variable es int
        // Se debe convertir a int después de parsear
        String altura = "180"; // Se asume que 'altura' es un String válido
        int alturaReal = (int) Double.parseDouble(altura);

        // 10. "int double" es un error, ya que "double" es palabra reservada
        int numeroDoble = 96;

        // 11. No se puede asignar un int a un double sin conversión
        a = 98.0;

        // 12. No se puede asignar un double a un int sin conversión explícita
        int x = (int) a;

        // 13. Correcto: int se puede asignar a otro int
        int y = 25;

        // 14. No se puede asignar un int a un String directamente
        String g = String.valueOf(y);

        // Imprimir los valores corregidos
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        System.out.println("alturaReal = " + alturaReal);
        System.out.println("numeroDoble = " + numeroDoble);

    }

}
