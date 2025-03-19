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
public class utils {
    
    public String readFromScanner(String message){
        Scanner sc= new Scanner(System.in);
        System.out.println(message);
        return sc.next();
        sc.close();
    }
}
