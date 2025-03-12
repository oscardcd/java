/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controles.flujo;

import java.util.Scanner;

/**
 *
 * @author oscarcorrea
 */
public class Ejercicio2 {

    public void findGreater() {
        int number1, number2, greaterNumber, minorNumber;
        Scanner sc = new Scanner(System.in);

        System.out.println("please enter first number");
        number1 = sc.nextInt();
        System.out.println("please enter second number");
        number2 = sc.nextInt();

        if (number1< number2) {
            greaterNumber=number2;
            minorNumber=number1;
        }else{
            greaterNumber=number1;
            minorNumber=number2;
        }
        
        System.out.println("the minor number pow is:"+ minorNumberPow(greaterNumber,minorNumber));
        
        
    }
    
    public int minorNumberPow(int greaterNumber,int minorNumber){
        return (int) Math.pow(greaterNumber, minorNumber);
    }
}
