/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.idat.desarrolloavanzadodeaplicaciones1.OPERADORES_COMPARACION_LOGICOS;

import java.util.Scanner;

/**
 *
 * @author Solaris
 * Este programa verifica si un año es bisiesto usando condiciones con 'if'.
 */
public class DeterminaBisiesto {
    
        public static void main(String[] args) {
        // Creamos un objeto Scanner para leer datos del teclado
        Scanner input = new Scanner(System.in);

        // Solicitamos al usuario el año
        System.out.print("Introduce un año: ");
        int anio = input.nextInt(); // Leemos un número entero que representa el año

        // Verificamos si el año es divisible entre 4
        if (anio % 4 == 0) { 
            // Si es divisible entre 4, verificamos si también es divisible entre 100
            if (anio % 100 == 0) { 
                // Si es divisible entre 100, verificamos si también es divisible entre 400
                if (anio % 400 == 0) {
                    // Es divisible entre 4, 100 y 400: Es bisiesto
                    System.out.println("El año " + anio + " es bisiesto.");
                } else {
                    // Es divisible entre 4 y 100, pero no entre 400: No es bisiesto
                    System.out.println("El año " + anio + " no es bisiesto.");
                }
            } else {
                // Es divisible entre 4, pero no entre 100: Es bisiesto
                System.out.println("El año " + anio + " es bisiesto.");
            }
        } else {
            // No es divisible entre 4: No es bisiesto
            System.out.println("El año " + anio + " no es bisiesto.");
        }
    }
    
}
