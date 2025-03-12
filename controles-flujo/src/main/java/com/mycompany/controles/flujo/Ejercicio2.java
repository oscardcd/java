/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controles.flujo;

/**
 *
 * @author oscarcorrea
 */
public class Ejercicio2 {

    public void findGreater() {
        int number1, number2, greaterNumber, minorNumber;
    
        utils util = new utils();

        number1 = Integer.parseInt(util.readFromScanner("please enter first number"));


        number2 = Integer.parseInt(util.readFromScanner("please enter first number"));

        if (number1 < number2) {
            greaterNumber = number2;
            minorNumber = number1;
        } else {
            greaterNumber = number1;
            minorNumber = number2;
        }

        System.out.println("the pow of the greater number at minor number  is:" + minorNumberPow(greaterNumber, minorNumber));

    }

    public int minorNumberPow(int greaterNumber, int minorNumber) {
        return (int) Math.pow(greaterNumber, minorNumber);
    }
}
