/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sumanumerospares;

import java.util.Scanner;

/**
 *
 * @author Rocío
 */
public class SumaNumerosPares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int numero = -1;
      int sumaPares = 0;
        
      while (numero != 0){
        System.out.print("Ingrese un numero (0 para terminar): ");
        numero = input.nextInt();

        if (numero % 2 == 0 && numero != 0) {
            sumaPares += numero;
           }
       }

       System.out.println("La suma de los números pares es: " + sumaPares);
    }
}
