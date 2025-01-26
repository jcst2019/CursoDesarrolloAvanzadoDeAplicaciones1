/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.idat.desarrolloavanzadodeaplicaciones1.CLASE3_ACTIVIDAD;

import java.util.Scanner;

/**
 *
 * @author Solaris
 */
public class Calendario {

    // Método para verificar si un año es bisiesto
    public static boolean esBisiesto(int anio) {
        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    // Método para obtener el nombre del mes
    public static String obtenerNombreMes(int mes) {
        switch (mes) {
            case 1: return "Enero";
            case 2: return "Febrero";
            case 3: return "Marzo";
            case 4: return "Abril";
            case 5: return "Mayo";
            case 6: return "Junio";
            case 7: return "Julio";
            case 8: return "Agosto";
            case 9: return "Septiembre";
            case 10: return "Octubre";
            case 11: return "Noviembre";
            case 12: return "Diciembre";
            default: return "Mes inválido";
        }
    }

    // Método para calcular los días del mes
    public static int calcularDiasMes(int mes, int anio) {
        // Verificar si es un año bisiesto
        boolean esBisiesto = esBisiesto(anio);
        
        // Días por mes (asumiendo no bisiesto)
        switch (mes) {
            case 1: // Enero
            case 3: // Marzo
            case 5: // Mayo
            case 7: // Julio
            case 8: // Agosto
            case 10: // Octubre
            case 12: // Diciembre
                return 31;
            case 4: // Abril
            case 6: // Junio
            case 9: // Septiembre
            case 11: // Noviembre
                return 30;
            case 2: // Febrero
                if (esBisiesto) {
                    return 29; // Si es bisiesto, tiene 29 días
                } else {
                    return 28; // Si no es bisiesto, tiene 28 días
                }
            default:
                return 0; // Si el mes no es válido
        }
    }

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer los valores ingresados por el usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar el número del mes y el año
        System.out.print("Ingresa el número del mes (1-12): ");
        int mes = scanner.nextInt();
        System.out.print("Ingresa el año: ");
        int anio = scanner.nextInt();

        // Obtener el nombre del mes
        String nombreMes = obtenerNombreMes(mes);

        // Calcular los días del mes
        int diasMes = calcularDiasMes(mes, anio);

        // Imprimir los resultados
        if (diasMes > 0) {
            System.out.println("El mes de " + nombreMes + " del año " + anio + " tiene " + diasMes + " días.");
        } else {
            System.out.println("Número de mes inválido.");
        }

        // Cerrar el scanner
        scanner.close();
    }
}