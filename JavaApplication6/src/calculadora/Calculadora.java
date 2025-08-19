/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author Rocío
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese un numero entero: ");
        int numero1 = input.nextInt();
        
        System.out.println("Ingrese otro numero entero: ");
        int numero2 = input.nextInt();
        
        int suma = numero1 + numero2;
        int resta = numero1 - numero2;
        int multiplicacion = numero1 * numero2;
        int division = numero1 / numero2;
        
        System.out.println("Estos son los resultados: suma " + suma + " resta: " + resta + " multiplicacion: " + multiplicacion + " division: " + division );
    }
    
}
