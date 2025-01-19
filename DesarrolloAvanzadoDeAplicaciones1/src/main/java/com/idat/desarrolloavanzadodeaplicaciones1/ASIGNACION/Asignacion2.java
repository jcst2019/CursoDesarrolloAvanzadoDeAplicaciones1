/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.idat.desarrolloavanzadodeaplicaciones1.ASIGNACION;

/**
 *
 * @author Solaris
 * Este programa demuestra cómo asignar valores a una variable basándose en otra.
 */
public class Asignacion2 {
    
        public static void main(String[] args) {
        // Declaramos dos variables y asignamos valores iniciales
        int ancho = 5; // Ancho de un rectángulo
        int largo = 10; // Largo de un rectángulo

        // Calculamos el área basándonos en las variables ancho y largo
        int area = ancho * largo; // Asignamos a 'area' el resultado de multiplicar ancho por largo
        System.out.println("Área del rectángulo: " + area); // Mostramos el área calculada

        // Reasignamos un nuevo valor al ancho
        ancho = 7; // Cambiamos el valor de 'ancho' a 7
        // Recalculamos el área con el nuevo valor
        area = ancho * largo; // Asignamos a 'area' el nuevo cálculo
        System.out.println("Nueva área con ancho modificado: " + area); // Mostramos el área recalculada
    }
    
}
