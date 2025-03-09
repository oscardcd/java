/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciosvariables;

/**
 *
 * @author oscarcorrea
 */
public class ejercicio1 {
    
   
    
    public void showValues(){
        
         // Variable to store a person's name
    String nombrePersona="Oscar correa";

    // Variable "x" to store a number with 2 decimal places
    double x= 10.50d;

    // Constant variable to store the dollar value
     final double dolarValue = 4125.50; 

    // Primitive float variable to store the first 7 decimals of "pi"
    float piValue =(float) Math.PI;

    // Double variable to store the first 15 decimals of "Euler"
    double eulerValue =(double) Math.E;
        
         nombrePersona = "Juan";
        x = 10.25;

        System.out.println("Nombre: " + nombrePersona);
        System.out.println("Valor de x: " + x);
        System.out.println("Valor del dólar: " + dolarValue);
        System.out.println("Valor de pi: " + piValue);
        System.out.println("Valor de Euler: " + eulerValue);
    }

   

}
