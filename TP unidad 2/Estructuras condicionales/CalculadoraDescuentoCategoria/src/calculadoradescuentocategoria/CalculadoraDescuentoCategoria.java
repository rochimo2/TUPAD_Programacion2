/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadoradescuentocategoria;

import java.util.Scanner;

/**
 *
 * @author Rocío
 */
public class CalculadoraDescuentoCategoria {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double precio;
        char categoria;
        double descuento;
        
        System.out.print("Ingrese la categoria del producto (A, B o C): ");
        categoria = input.nextLine().charAt(0);
        
        System.out.print("Ingrese el precio del producto: ");
        precio = input.nextDouble();
        
        switch (categoria) {
            case 'A', 'a':
                descuento = precio * 0.10;
                precio = precio - descuento;
                System.out.println("Descuento aplicado: 10%");
                System.out.println("Precio final: $" + precio);
                break;
            case 'B', 'b':
                descuento = precio * 0.15;
                precio = precio - descuento;
                System.out.println("Descuento aplicado: 15%");
                System.out.println("Precio final: $" + precio);
               
            case 'C', 'c':
                descuento = precio * 0.20;
                precio = precio - descuento;
                System.out.println("Descuento aplicado: 20%");
                System.out.println("Precio final: $" + precio);
            default:
                System.out.println("CAtegoria inválida");
        }
    }
}
