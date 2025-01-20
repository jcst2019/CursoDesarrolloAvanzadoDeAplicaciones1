/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.idat.desarrolloavanzadodeaplicaciones1.OPERADORES_COMPARACION_LOGICOS;

import java.util.Scanner;

/**
 *
 * @author Solaris
 * Este programa verifica si una persona tiene la edad suficiente para votar usando una estructura condicional.
 */
public class ValidaVotacion {
    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer datos del teclado
        Scanner input = new Scanner(System.in);

        // Solicitamos al usuario su edad
        System.out.print("Introduce tu edad: ");
        int edad = input.nextInt(); // Leemos la edad como un número entero

        // Verificamos si la persona tiene 18 años o más
        if (edad >= 18) { // Evaluamos si la edad es mayor o igual a 18
            System.out.println("Eres mayor de edad y puedes votar."); // Mensaje para mayores de 18
        } else { // Si la edad es menor a 18
            System.out.println("No tienes la edad suficiente para votar."); // Mensaje para menores de edad
        }
    }
}
