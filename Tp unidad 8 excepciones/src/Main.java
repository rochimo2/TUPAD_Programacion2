import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        // Ejercicio 1 de la parte 2: division segura
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Ingrese el dividendo (entero): ");
        int dividendo = sc.nextInt();
        System.out.print("Ingrese el divisor (entero): ");
        int divisor = sc.nextInt();

        try {
            int resultado = dividendo / divisor;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: división por cero.");
        }

        // Ejercicio 2 de la parte 2: conversion de cadena a numero

        sc.nextLine();
        System.out.print("Ejercicio 2, Ingrese un número: ");
        String texto = sc.nextLine();

        try {
            int num = Integer.parseInt(texto);
            System.out.println("Convertido: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Error: formato de número inválido.");
        }
        // Ejercicio 3 de la parte 2: Lectura de archivo
        String archivook = "archivoparaleerenpunto3.txt";
        String archivonook = "archivoinexistente.txt";


        lectorArchivo(archivook);
        lectorArchivo(archivonook);

        // Ejercicio 4 de la parte 2: Excepcion personalizada

        System.out.print("Ingrese su edad (entero): ");
        try {
            int edad = sc.nextInt();
            if (edad < 0 || edad > 120) {
                throw new EdadInvalidaException("Edad inválida: " + edad + ". Debe estar entre 0 y 120.");
            }
            System.out.println("Edad válida: " + edad);
        } catch (EdadInvalidaException e) {
            System.out.println("Error: " + e.getMessage());
        }
        // Ejercicio 5 de la parte 2: try-with-resources


        String archivoParaLeer = "archivo_para_try_with_resources.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(archivoParaLeer))) {
            String linea;
            System.out.println("Leyendo archivo: " + archivoParaLeer);
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo '" + archivoParaLeer + "': " + e.getMessage());
        }

    }

    private static void lectorArchivo(String nombreArchivo) {
        java.io.File file = new java.io.File(nombreArchivo);
        try (java.util.Scanner sc = new java.util.Scanner(file)) {
            while (sc.hasNextLine()) {
                String linea = sc.nextLine();
                System.out.println(linea);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado: " + nombreArchivo);
        }
    }


}
