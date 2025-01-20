/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.idat.desarrolloavanzadodeaplicaciones1.ESTRUCTURAS_CONDICIONALES;

import java.util.Scanner;

/**
 *
 * @author Solaris
 * Este programa encuentra el mayor de tres números dados
 */
public class DeterminaMayorTresNumeros {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in); // Crear un objeto Scanner para leer datos

        System.out.print("Ingresa el primer número: "); // Solicitamos el primer número
        int num1 = input.nextInt(); // Leemos el primer número

        System.out.print("Ingresa el segundo número: "); // Solicitamos el segundo número
        int num2 = input.nextInt(); // Leemos el segundo número

        System.out.print("Ingresa el tercer número: "); // Solicitamos el tercer número
        int num3 = input.nextInt(); // Leemos el tercer número

        // Comparamos los tres números para encontrar el mayor
        if (num1 >= num2 && num1 >= num3) { 
            System.out.println("El mayor es: " + num1); // Si el primero es el mayor
        } 
        else if (num2 >= num1 && num2 >= num3) { 
            System.out.println("El mayor es: " + num2); // Si el segundo es el mayor
        } 
        else { 
            System.out.println("El mayor es: " + num3); // Si el tercero es el mayor
        }
    }
    
}
