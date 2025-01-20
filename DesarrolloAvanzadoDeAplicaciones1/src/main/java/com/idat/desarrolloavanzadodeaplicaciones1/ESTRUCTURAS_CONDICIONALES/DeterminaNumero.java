/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.idat.desarrolloavanzadodeaplicaciones1.ESTRUCTURAS_CONDICIONALES;

import java.util.Scanner;

/**
 *
 * @author Solaris
 * Este programa verifica si un número es positivo, negativo o igual a cero
 */
public class DeterminaNumero {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in); // Crear un objeto Scanner para leer datos

        System.out.print("Introduce un número: "); // Pedimos al usuario un número
        int numero = input.nextInt(); // Leemos el número ingresado

        // Verificamos si el número es positivo
        if (numero > 0) { 
            System.out.println("El número es positivo."); // Mensaje si es mayor a 0
        } 
        // Verificamos si el número es negativo
        else if (numero < 0) { 
            System.out.println("El número es negativo."); // Mensaje si es menor a 0
        } 
        // Si no es ni positivo ni negativo, debe ser cero
        else { 
            System.out.println("El número es cero."); // Mensaje si es igual a 0
        }
    }
}
