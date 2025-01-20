/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.idat.desarrolloavanzadodeaplicaciones1.ESTRUCTURAS_CONDICIONALES;

import java.util.Scanner;

/**
 *
 * @author Solaris
 * Este programa realiza operaciones básicas: suma, resta, multiplicación y división
 */
public class Calculadora {
    
        public static void main(String[] args) {
            
        Scanner input = new Scanner(System.in); // Crear un objeto Scanner para leer datos

        System.out.print("Introduce el primer número: "); // Solicitamos el primer número
        double num1 = input.nextDouble(); // Leemos el primer número

        System.out.print("Introduce el segundo número: "); // Solicitamos el segundo número
        double num2 = input.nextDouble(); // Leemos el segundo número

        System.out.println("Selecciona una operación: "); // Mostramos las opciones de operación
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        int opcion = input.nextInt(); // Leemos la opción seleccionada

        // Usamos switch para realizar la operación seleccionada
        switch (opcion) {
            case 1: // Suma
                System.out.println("Resultado: " + (num1 + num2)); 
                break;
            case 2: // Resta
                System.out.println("Resultado: " + (num1 - num2));
                break;
            case 3: // Multiplicación
                System.out.println("Resultado: " + (num1 * num2));
                break;
            case 4: // División
                if (num2 != 0) { // Verificamos que el divisor no sea 0
                    System.out.println("Resultado: " + (num1 / num2));
                } else {
                    System.out.println("Error: División entre cero.");
                }
                break;
            default: // Opción inválida
                System.out.println("Opción no válida.");
        }
    }
}
