/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conversionesydivision;

import java.util.Scanner;

/**
 *
 * @author Rocío
 */
public class ConversionesYDivision {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese un numero entero: ");
        int numero1 = input.nextInt();
        
        System.out.println("Ingrese otro numero entero: ");
        int numero2 = input.nextInt();
        
        int division = numero1 / numero2;
        
        double divisionDouble = (double) numero1 / numero2;
        
        System.out.println("La division de tipo int da como resultado: " + division);
        System.out.println("La division de tipo double da como resultado: " + divisionDouble);
    }
    
}
