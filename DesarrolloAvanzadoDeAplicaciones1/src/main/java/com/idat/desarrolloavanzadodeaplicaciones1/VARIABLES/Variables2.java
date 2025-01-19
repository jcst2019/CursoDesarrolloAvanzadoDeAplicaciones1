/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.idat.desarrolloavanzadodeaplicaciones1.VARIABLES;

/**
 *
 * @author Solaris
 * Este programa muestra cómo intercambiar los valores de dos variables.
 */
public class Variables2 {
    
    public static void main(String[] args) {
        
        // Declaramos dos variables
        int a = 3; // Valor inicial de la variable 'a'
        int b = 7; // Valor inicial de la variable 'b'

        // Mostramos los valores iniciales
        System.out.println("Antes del intercambio:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Intercambiamos los valores usando una variable temporal
        int temporal = a; // Guardamos el valor de 'a' en la variable temporal
        a = b; // Asignamos el valor de 'b' a 'a'
        b = temporal; // Asignamos el valor original de 'a' (almacenado en temporal) a 'b'

        // Mostramos los valores después del intercambio
        System.out.println("Después del intercambio:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    
}
