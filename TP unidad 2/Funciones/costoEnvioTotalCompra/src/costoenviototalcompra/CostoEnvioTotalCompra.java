/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package costoenviototalcompra;

import java.util.Scanner;

/**
 *
 * @author Rocío
 */
public class CostoEnvioTotalCompra {

    public static double calcularCostoEnvio(double peso, String zona) {
        double costo = 0;

        if (zona.equals("Nacional")) {
            costo = peso * 5;
        } else {
            costo = peso * 10;
        }

        return costo;
    }
    
    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }
    
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        double precioProducto = input.nextDouble();

        System.out.print("Ingrese el peso del paquete en kg: ");
        double peso = input.nextDouble();

        input.nextLine();
        System.out.print("Ingrese la zona de envio (Nacional/Internacional): ");
        String zona = input.nextLine();

        double costoEnvio = calcularCostoEnvio(peso, zona);

        double total = calcularTotalCompra(precioProducto, costoEnvio);

        System.out.println("El costo de envio es: " + costoEnvio);
        System.out.println("El total a pagar es: " + total);
    }
    
}
