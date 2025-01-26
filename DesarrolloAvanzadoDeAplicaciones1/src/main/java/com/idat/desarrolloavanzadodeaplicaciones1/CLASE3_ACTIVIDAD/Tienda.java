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
public class Tienda {

    // Método para leer el producto
    public static String leerProducto(Scanner scanner) {
        System.out.print("Ingrese el producto (P1, P2, P3): ");
        return scanner.nextLine().toUpperCase();
    }

    // Método para leer la cantidad
    public static int leerCantidad(Scanner scanner) {
        System.out.print("Ingrese la cantidad de unidades adquiridas: ");
        return scanner.nextInt();
    }

    // Método para calcular el importe
    public static double calcularImporte(String producto, int cantidad) {
        double precio = 0.0;

        switch (producto) {
            case "P1":
                precio = 15.0;
                break;
            case "P2":
                precio = 17.5;
                break;
            case "P3":
                precio = 20.0;
                break;
            default:
                System.out.println("Producto inválido. Se asume precio 0.");
        }

        return precio * cantidad;
    }

    // Método para determinar el regalo
    public static String determinarRegalo(int cantidad) {
        if (cantidad >= 1 && cantidad <= 25) {
            return "un lapicero";
        } else if (cantidad >= 26 && cantidad <= 50) {
            return "un cuaderno";
        } else if (cantidad > 50) {
            return "una agenda";
        } else {
            return "Ningún regalo";
        }
    }
    
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer datos del cliente
        String producto = leerProducto(scanner);
        int cantidad = leerCantidad(scanner);

        // Calcular importe y regalo
        double importe = calcularImporte(producto, cantidad);
        String regalo = determinarRegalo(cantidad);

        // Mostrar resultados
        System.out.println("Importe a pagar: S/. " + importe);
        System.out.println("Regalo: " + regalo);

        scanner.close();
    }
}
