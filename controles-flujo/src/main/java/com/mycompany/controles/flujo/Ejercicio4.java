/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controles.flujo;

/**
 *
 * @author oscarcorrea
 */
public class Ejercicio4 {
    
    public void MultiploChecker(){
        utils utils= new utils();
        
        int num1=0,num2=0;
        
        num1= Integer.parseInt(utils.readFromScanner("ingrese el primer numero")); 
        num2= Integer.parseInt(utils.readFromScanner("ingrese el segundo numero")); 
        
        if (num1 % num2 == 0) {
            System.out.println(num1 + " es múltiplo de " + num2);
        } else if (num2 % num1 == 0) {
            System.out.println(num2 + " es múltiplo de " + num1);
        } else {
            System.out.println("Ninguno de los números es múltiplo del otro.");
        }
        
        
    }
    
}
