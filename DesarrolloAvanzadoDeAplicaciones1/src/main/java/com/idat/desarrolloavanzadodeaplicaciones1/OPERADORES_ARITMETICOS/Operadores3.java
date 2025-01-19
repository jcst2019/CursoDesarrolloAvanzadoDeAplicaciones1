/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.idat.desarrolloavanzadodeaplicaciones1.OPERADORES_ARITMETICOS;

/**
 *
 * @author Solaris
 * Este programa demuestra el uso de operadores de incremento y decremento.
 */
public class Operadores3 {
    
     public static void main(String[] args) {
        // Declaramos una variable entera con un valor inicial
        int contador = 10; // Asignamos el valor 10 a 'contador'

        // Mostramos el valor inicial
        System.out.println("Valor inicial: " + contador); // Mostramos el valor de 'contador'

        // Usamos el operador de incremento para aumentar el valor en 1
        contador++; // Incrementamos el valor de 'contador' en 1
        System.out.println("Después de incremento: " + contador); // Mostramos el valor después del incremento

        // Usamos el operador de decremento para disminuir el valor en 1
        contador--; // Decrementamos el valor de 'contador' en 1
        System.out.println("Después de decremento: " + contador); // Mostramos el valor después del decremento

        // Incrementamos el valor en 5 usando el operador de suma
        contador += 5; // Aumentamos el valor de 'contador' en 5
        System.out.println("Después de sumar 5: " + contador); // Mostramos el nuevo valor

        // Disminuimos el valor en 3 usando el operador de resta
        contador -= 3; // Disminuimos el valor de 'contador' en 3
        System.out.println("Después de restar 3: " + contador); // Mostramos el resultado final
    } 
}
