/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clasificaciondeedad;

import java.util.Scanner;

/**
 *
 * @author Rocío
 */
public class ClasificacionDeEdad {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int edad;
        
        System.out.println("Ingrese su edad ");
        edad = Integer.parseInt(input.nextLine());
        
        if (edad < 12 ){
            System.out.println("Eres un niño");
        } else if (edad >= 12 && edad <= 17){
            System.out.println("Eres un adolescente");
        }else if (edad >= 18 && edad <= 59){
            System.out.println("Eres un adulto");
        }else{
            System.out.println("Eres un adulto más mayor");
        }
    }
   
}
