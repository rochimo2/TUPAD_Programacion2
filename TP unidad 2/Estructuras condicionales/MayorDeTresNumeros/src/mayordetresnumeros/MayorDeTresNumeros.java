/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mayordetresnumeros;

import java.util.Scanner;

/**
 *
 * @author Rocío
 */
public class MayorDeTresNumeros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, num3;
        
        System.out.println("Ingrese el primer numero: ");
        num1 = Integer.parseInt(input.nextLine());
        
        System.out.println("Ingrese el segundo numero: ");
        num2 = Integer.parseInt(input.nextLine());
        
        System.out.println("Ingrese el tercer numero: ");
        num3 = Integer.parseInt(input.nextLine());
        
        if ( num1 > num2 ) {
            if ( num1 > num3 ){
                System.out.println("El mayor es " + num1);
            } else {
                System.out.println("El mayor es " + num3);
            }        
        } else if (num2 > num3){
            System.out.println("El mayor es " + num2);
        } else{
            System.out.println("El mayor es " + num3);
        }
        
    }
    
}
