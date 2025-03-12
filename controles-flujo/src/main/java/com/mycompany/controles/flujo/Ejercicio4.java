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
    
    public void determinePassOrFail(){
        utils utils=new utils();
        
        double nota = Double.parseDouble(utils.readFromScanner("ingrese nota para validar si el estudiante aprueba"));
        
        
        if(nota<6){
            System.out.println("El estudiante Reprobo");
        }else{
            System.out.println("El estudiante aprobo");
        }
        
    }
    
}
