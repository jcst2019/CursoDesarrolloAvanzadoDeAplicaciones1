/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.idat.desarrolloavanzadodeaplicaciones1.OPERADORES_COMPARACION_LOGICOS;

import java.util.Scanner;

/**
 *
 * @author Solaris
 *  Este programa verifica si un número está entre 1 y 100 usando estructuras condicionales.
 */
public class ValidaNumero {
    
        public static void main(String[] args) {
        // Creamos un objeto Scanner para leer datos del teclado
        Scanner input = new Scanner(System.in);

        // Solicitamos al usuario un número
        System.out.print("Introduce un número: ");
        int numero = input.nextInt(); // Leemos un número entero

        // Verificamos si el número está en el rango de 1 a 100
        if (numero >= 1 && numero <= 100) { // Evaluamos si el número está dentro del rango
            System.out.println("El número está entre 1 y 100."); // Mensaje si la condición es verdadera
        } else { // Si el número no está en el rango
            System.out.println("El número no está entre 1 y 100."); // Mensaje si la condición es falsa
        }
    }
}
