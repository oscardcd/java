/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejerciciosvariables;

import java.util.Scanner;

/**
 *
 * @author oscarcorrea
 */
public class EjerciciosVariables {

    public static void main(String[] args) {
        
        Scanner sr=new Scanner(System.in);
        ejercicio1 ejercicio1 = new ejercicio1();
        ejercicio2 ejercicio2= new ejercicio2();
        
        
        System.out.println("indique que ejercicio quiere visualizar:\n 1. Ejercicio 1.\n 2. Ejercicio 2.");
        int option= sr.nextInt();
        
        if(option==1){
            ejercicio1.showValues();
        }else{
            ejercicio2.showFixedVariables();
        }
        
        
        sr.close();
    }

}
