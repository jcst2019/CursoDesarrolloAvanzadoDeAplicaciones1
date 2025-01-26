/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.idat.desarrolloavanzadodeaplicaciones1.CLASE3_ACTIVIDAD;

import static java.lang.Math.PI;
import static java.lang.Math.pow;
import java.util.Scanner;

/**
 *
 * @author Solaris
 */
public class Cilindro {
    
    // Método para calcular el área de la base
    public static double calcularAreaBase(double radio) {
        return PI * pow(radio, 2); // Área base = π * r^2
    }

    // Método para calcular el área lateral
    public static double calcularAreaLateral(double radio, double altura) {
        return 2 * PI * radio * altura; // Área lateral = 2 * π * r * h
    }

    // Método para calcular el área total
    public static double calcularAreaTotal(double radio, double altura) {
        return 2 * PI * radio * (radio + altura); // Área total = 2 * π * r * (r + h)
    }

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer los valores ingresados por el usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar el radio del cilindro
        System.out.print("Ingresa el radio del cilindro: ");
        double radio = scanner.nextDouble();

        // Solicitar la altura del cilindro
        System.out.print("Ingresa la altura del cilindro: ");
        double altura = scanner.nextDouble();

        // Calcular las áreas utilizando los métodos
        double areaBase = calcularAreaBase(radio);
        double areaLateral = calcularAreaLateral(radio, altura);
        double areaTotal = calcularAreaTotal(radio, altura);

        // Imprimir los resultados
        System.out.println("El área de la base del cilindro es: " + areaBase);
        System.out.println("El área lateral del cilindro es: " + areaLateral);
        System.out.println("El área total del cilindro es: " + areaTotal);

        // Cerrar el scanner
        scanner.close();
    }
}
