/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ClasesOperadores;

/**
 *
 * @author oscarcorrea
 */
public class Ejercicio3 {

    public void cambiarNumeros() {
        // Variables enteras
        int numeroUno = 8;
        int numeroDos = 2;

        // Mostrar valores antes del intercambio
        System.out.println("Antes del intercambio:");
        System.out.println("numeroUno = " + numeroUno);
        System.out.println("numeroDos = " + numeroDos);

        // Intercambio de valores usando una variable auxiliar
        int auxiliar = numeroUno;
        numeroUno = numeroDos;
        numeroDos = auxiliar;

        // Mostrar valores después del intercambio
        System.out.println("\nDespués del intercambio:");
        System.out.println("numeroUno = " + numeroUno);
        System.out.println("numeroDos = " + numeroDos);
    }
}
