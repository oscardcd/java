/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ClasesOperadores;

/**
 *
 * @author oscarcorrea
 */
public class Ejercicio6 {

    public void mostrarAreas() {
        // Cuadrado
        int ladoCuadrado = 8;
        int areaCuadrado = ladoCuadrado * ladoCuadrado;
        int perimetroCuadrado = 4 * ladoCuadrado;

        // Triángulo
        int baseTriangulo = 9;
        int alturaTriangulo = 8;
        int ladoUnoTriangulo = 8;
        int ladoDosTriangulo = 8;
        double areaTriangulo = (baseTriangulo * alturaTriangulo) / 2.0;
        int perimetroTriangulo = baseTriangulo + ladoUnoTriangulo + ladoDosTriangulo;

        // Rectángulo
        int baseRectangulo = 8;
        int alturaRectangulo = 6;
        int areaRectangulo = baseRectangulo * alturaRectangulo;
        int perimetroRectangulo = 2 * (baseRectangulo + alturaRectangulo);

        // Mostrar resultados
        System.out.println("Cuadrado: Área = " + areaCuadrado + ", Perímetro = " + perimetroCuadrado);
        System.out.println("Triángulo: Área = " + areaTriangulo + ", Perímetro = " + perimetroTriangulo);
        System.out.println("Rectángulo: Área = " + areaRectangulo + ", Perímetro = " + perimetroRectangulo);
    }
}
