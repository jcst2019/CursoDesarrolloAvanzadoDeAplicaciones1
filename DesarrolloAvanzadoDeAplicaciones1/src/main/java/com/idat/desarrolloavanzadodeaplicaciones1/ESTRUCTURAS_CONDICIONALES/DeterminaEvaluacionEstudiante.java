/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.idat.desarrolloavanzadodeaplicaciones1.ESTRUCTURAS_CONDICIONALES;

import java.util.Scanner;

/**
 *
 * @author Solaris
 * Este programa determina si un estudiante aprueba o reprueba con base en su calificación
 */
public class DeterminaEvaluacionEstudiante {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in); // Crear un objeto Scanner para leer datos

        System.out.print("Introduce la calificación del estudiante: "); // Solicitamos la calificación
        double calificacion = input.nextDouble(); // Leemos la calificación ingresada

        // Validamos si la calificación está fuera del rango permitido
        if ((calificacion < 0) || (calificacion > 20)) {  //  ALT + 124   Obtenemos el caracter |
            System.out.println("Valor de nota fuera de rango.");
        } 
        // Verificamos si el estudiante aprueba
        else if (calificacion >= 13) {
            System.out.println("El estudiante aprueba."); // Mensaje de aprobación
        } 
        // Si no cumple las condiciones anteriores, reprueba
        else {
            System.out.println("El estudiante reprueba."); // Mensaje de reprobación
        }
    }
}
