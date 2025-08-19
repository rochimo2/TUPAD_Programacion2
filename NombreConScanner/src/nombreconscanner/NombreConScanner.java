/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nombreconscanner;

import java.util.Scanner;

/**
 *
 * @author Rocío
 */
public class NombreConScanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese su nombre: ");
        String nombre = input.nextLine();
        
        System.out.println("Ingrese su edad: ");
        int edad = input.nextInt();
        
        System.out.println("Hola " + nombre + " de " + edad + " años!");
        
        
    }
    
}
