/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosvariables;

import java.util.Scanner;

/**
 *
 * @author ESTUDIANTES
 */
public class ClaseVariable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("seleccione una opcion en el siguiente menu:\n"
                + "1-> mostrar variables del ejercicio 1. \n"
                + "2-> mostrar variables ejercicio 2 \n"
                + "3-> ingresar al menu de ejercicios de operadores \n"
                + "4-> ingresar a los ejercicios de la clase math");
        
        int optionSelected= sc.nextInt();
        
        if(optionSelected ==(int) optionSelected ){
            switch(optionSelected){
                case 1:
                    ejercicio1 variables= new ejercicio1();
                    variables.showVariables();
                       break;
            }
        }
        
    }
    
}
