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

        // Verificamos si la calificación es mayor o igual a 10.5
        if (calificacion >= 10.5) { 
            System.out.println("El estudiante aprueba."); // Mensaje de aprobación
        } 
        // Si no cumple la condición anterior, reprueba
        else { 
            System.out.println("El estudiante reprueba."); // Mensaje de reprobación
        }
    }
}
