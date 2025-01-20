/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.idat.desarrolloavanzadodeaplicaciones1.ESTRUCTURAS_SECUENCIALES;

import java.util.Scanner;

/**
 *
 * @author Solaris
 * Este programa calcula el salario semanal de un trabajador basado en las horas trabajadas y el pago por hora.
 */
public class SalarioSemanal {
    
        public static void main(String[] args) {
        // Creamos un objeto Scanner para leer los datos del teclado
        Scanner input = new Scanner(System.in);

        // Solicitamos al usuario las horas trabajadas en la semana
        System.out.print("Introduce las horas trabajadas en la semana: ");
        double horasTrabajadas = input.nextDouble(); // Leemos un valor decimal para las horas trabajadas

        // Solicitamos al usuario el pago por hora
        System.out.print("Introduce el pago por hora: ");
        double pagoPorHora = input.nextDouble(); // Leemos un valor decimal para el pago por hora

        // Calculamos el salario semanal
        double salarioSemanal = horasTrabajadas * pagoPorHora; // Multiplicamos las horas trabajadas por el pago por hora

        // Mostramos el resultado al usuario
        System.out.println("El salario semanal es: " + salarioSemanal);
    }
}
