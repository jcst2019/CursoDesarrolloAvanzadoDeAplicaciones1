/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.idat.desarrolloavanzadodeaplicaciones1.ESTRUCTURAS_SECUENCIALES;

import java.util.Scanner;

/**
 *
 * @author Solaris
 * Este programa calcula el área de un rectángulo usando base y altura proporcionadas por el usuario.
 */
public class AreaRectangulo {
    
        public static void main(String[] args) {
        // Creamos un objeto Scanner para leer los datos del teclado
        Scanner input = new Scanner(System.in);

        // Solicitamos al usuario la base del rectángulo
        System.out.print("Introduce la base del rectángulo: ");
        double base = input.nextDouble(); // Leemos un valor decimal para la base

        // Solicitamos al usuario la altura del rectángulo
        System.out.print("Introduce la altura del rectángulo: ");
        double altura = input.nextDouble(); // Leemos un valor decimal para la altura

        // Calculamos el área del rectángulo
        double area = base * altura; // Multiplicamos base por altura

        // Mostramos el resultado al usuario
        System.out.println("El área del rectángulo es: " + area);
    }
    
}
