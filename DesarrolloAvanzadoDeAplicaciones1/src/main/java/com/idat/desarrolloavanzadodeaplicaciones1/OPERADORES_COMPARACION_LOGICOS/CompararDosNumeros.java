/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.idat.desarrolloavanzadodeaplicaciones1.OPERADORES_COMPARACION_LOGICOS;

import java.util.Scanner; // Importamos la clase Scanner para leer datos del usuario

/**
 *
 * @author Solaris
 * Este programa compara dos números enteros ingresados por el usuario usando estructuras condicionales.
 */
public class CompararDosNumeros {
    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer datos del teclado
        Scanner input = new Scanner(System.in);

        // Solicitamos al usuario el primer número
        System.out.print("Introduce el primer número: ");
        int numero1 = input.nextInt(); // Leemos un número entero

        // Solicitamos al usuario el segundo número
        System.out.print("Introduce el segundo número: ");
        int numero2 = input.nextInt(); // Leemos otro número entero

        // Comparamos si el primer número es mayor que el segundo
        if (numero1 > numero2) { // Evaluamos si 'numero1' es mayor que 'numero2'
            System.out.println("El primer número es mayor que el segundo."); // Mostramos el resultado si la condición es verdadera
        } else if (numero1 == numero2) { // Verificamos si los números son iguales
            System.out.println("Ambos números son iguales."); // Mostramos el resultado si son iguales
        } else { // Si ninguna de las condiciones anteriores se cumple
            System.out.println("El segundo número es mayor que el primero."); // Mostramos el resultado
        }
    }
}
