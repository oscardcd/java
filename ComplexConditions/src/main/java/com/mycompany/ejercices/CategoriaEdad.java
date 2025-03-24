/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercices;

import java.util.Scanner;

/**
 *
 * @author oscarcorrea
 */
public class CategoriaEdad {

    public void veridicarCategoria() {
        Scanner scanner = new Scanner(System.in);

        // Ask for user input
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Determine the category
        String category;

        if (age >= 0 && age <= 5) {
            category = "Infante";
        } else if (age >= 6 && age <= 10) {
            category = "Niño";
        } else if (age >= 11 && age <= 15) {
            category = "Pre adolescente";
        } else if (age >= 16 && age <= 18) {
            category = "Adolescente";
        } else if (age >= 19 && age <= 25) {
            category = "Pre adulto";
        } else if (age >= 26 && age <= 40) {
            category = "Adulto";
        } else if (age >= 41 && age <= 55) {
            category = "Pre anciano";
        } else if (age >= 56) {
            category = "Anciano";
        } else {
            category = "Edad no válida";
        }

        // Display result
        System.out.println("Categoría: " + category);
        scanner.close();
    }

}
