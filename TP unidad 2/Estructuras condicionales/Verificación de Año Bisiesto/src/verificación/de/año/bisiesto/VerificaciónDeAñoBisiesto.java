/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package verificación.de.año.bisiesto;
import java.util.Scanner;
/**
 *
 * @author Rocío
 */
public class VerificaciónDeAñoBisiesto {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int anio;
        
        System.out.println("Ingrese un anio: ");
        anio = Integer.parseInt(input.nextLine());
        
        if (anio % 4 == 0 ) {
            if (anio % 100 != 0) {
                if (anio % 400 == 0){
                    System.out.println("El anio " + anio + " es bisiesto");
            } else {
                System.out.println("El aanio " + anio + " es bisiesto");
            }
        } else {
            System.out.println("El anio " + anio + " no es bisiesto");
        }
    }
}
}
    
