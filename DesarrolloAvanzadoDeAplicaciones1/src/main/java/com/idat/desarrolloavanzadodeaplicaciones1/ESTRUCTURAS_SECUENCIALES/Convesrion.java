/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.idat.desarrolloavanzadodeaplicaciones1.ESTRUCTURAS_SECUENCIALES;

import java.util.Scanner;

/**
 *
 * @author Solaris
 *  Este programa convierte una temperatura de grados Celsius a grados Fahrenheit
 */
public class Convesrion {
    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer los datos del teclado
        Scanner input = new Scanner(System.in);

        // Solicitamos al usuario la temperatura en grados Celsius
        System.out.print("Introduce la temperatura en grados Celsius: ");
        double celsius = input.nextDouble(); // Leemos un valor decimal para los grados Celsius

        // Convertimos la temperatura a grados Fahrenheit usando la fórmula
        double fahrenheit = (celsius * 9 / 5) + 32; // Fórmula de conversión

        // Mostramos el resultado al usuario
        System.out.println("La temperatura en grados Fahrenheit es: " + fahrenheit);
    }
}
