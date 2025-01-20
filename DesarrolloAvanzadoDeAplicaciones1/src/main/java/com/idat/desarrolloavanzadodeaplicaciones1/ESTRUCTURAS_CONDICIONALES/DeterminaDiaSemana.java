/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.idat.desarrolloavanzadodeaplicaciones1.ESTRUCTURAS_CONDICIONALES;

import java.util.Scanner;

/**
 *
 * @author Solaris
 *  Este programa determina el día de la semana con base en un número del 1 al 7
 */
public class DeterminaDiaSemana {
    
public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in); // Crear un objeto Scanner para leer datos

        System.out.print("Introduce un número (1-7): "); // Solicitamos un número
        int dia = input.nextInt(); // Leemos el número ingresado

        // Usamos switch para verificar el día de la semana
        switch (dia) {
            case 1: // Si el número es 1
                System.out.println("Lunes"); // Día correspondiente
                break;
            case 2: // Si el número es 2
                System.out.println("Martes"); 
                break;
            case 3: // Si el número es 3
                System.out.println("Miércoles");
                break;
            case 4: // Si el número es 4
                System.out.println("Jueves");
                break;
            case 5: // Si el número es 5
                System.out.println("Viernes");
                break;
            case 6: // Si el número es 6
                System.out.println("Sábado");
                break;
            case 7: // Si el número es 7
                System.out.println("Domingo");
                break;
            default: // Si el número no está entre 1 y 7
                System.out.println("Número inválido."); // Mensaje de error
        }
    }   
}
