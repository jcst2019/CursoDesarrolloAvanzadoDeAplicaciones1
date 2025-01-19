/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.idat.desarrolloavanzadodeaplicaciones1.VARIABLES;

/**
 *
 * @author Solaris
 * Este programa realiza operaciones básicas (suma, resta, multiplicación y división) con variables numéricas.
 */
public class Variables2 {
    
    public static void main(String[] args) {
        
        // Declaramos dos variables enteras
        int numero1 = 10; // Primer número
        int numero2 = 5;  // Segundo número

        // Realizamos operaciones básicas
        int suma = numero1 + numero2; // Suma de los dos números
        int resta = numero1 - numero2; // Resta del primer número menos el segundo
        int multiplicacion = numero1 * numero2; // Multiplicación de los dos números
        int division = numero1 / numero2; // División del primer número entre el segundo

        // Mostramos los resultados en la consola
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
    }
}
