/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controles.flujo;

/**
 *
 * @author oscarcorrea
 */
public class ejercicio3 {
    
    public void validateNumberSign(){
        utils utils= new utils();
        
        int number=Integer.parseInt(utils.readFromScanner("enter a number integer negative or positive: ")) ;
        
        if(number<0){
            System.out.println("the number"+ number + "is negative" );
        }else{
            System.out.println("the number"+ number + "is positive" );
        }
    }
    
}
