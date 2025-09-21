/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package validacionnota;

import java.util.Scanner;

/**
 *
 * @author Rocío
 */
public class ValidacionNota {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int nota;
        
        do {            
           System.out.print("Ingrese una nota (0-10): ");
           nota = input.nextInt();
           if (nota < 0 || nota > 10) {
                System.out.println("Error: Nota invalida. Ingrese una nota entre 0 y 10.");
            }
        } while (nota < 0 || nota > 10); // si Nota = 8 → condición falsa → sale del while → imprime “Nota guardada correctamente.”
            
        System.out.println("Nota guardada correctamente.");
    }
    
}
