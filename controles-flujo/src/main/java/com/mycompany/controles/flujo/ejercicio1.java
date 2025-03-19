/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controles.flujo;

/**
 *
 * @author oscarcorrea
 */
public class ejercicio1 {
    
    public void validateRandomNumber(){
        int randomNumber=(int)(Math.random() * 100);
        System.out.println(randomNumber);
        
        if(randomNumber>50){
            System.out.println("el numero random es mayor");
        }else{
            System.out.println("el numero random es menor");
        
        }
        
        
    }
    
}
