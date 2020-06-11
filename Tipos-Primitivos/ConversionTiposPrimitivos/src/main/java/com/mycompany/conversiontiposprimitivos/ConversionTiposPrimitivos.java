/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.conversiontiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author yeison.ariel
 */
public class ConversionTiposPrimitivos {
    
    public static void main(String[] args) {
        
        // Conversion de String a Entero
        
        var edad = Integer.parseInt("20");
        System.out.println("edad = " + edad);
        
        // Conversion de String a Double
        
        double valorPi = Double.parseDouble("3.1416");
        System.out.println("valorPi = " + valorPi);
        
        // Seleccionar uno de los caracteres de tipo string
        char c = "hola".charAt(0); // Mencionamos la posicion empezamos desde cero
        System.out.println("c = " + c);
        
        // Convertir string a entero por consola
        System.out.println("Por favor ingrese la edad por aca...");
        var ejemploescaner = new Scanner(System.in);
        edad = Integer.parseInt(ejemploescaner.nextLine());
        System.out.println("edad = " + edad);
        
        // Selecionar uno de los caracteres de tipo Entero o String por consola
        System.out.println("Por favor ingrese el numero o palabra");
        char caracter = ejemploescaner.nextLine().charAt(0);
        System.out.println("caracter = " + caracter);
        
        // Convertir un Entero a String
        String edadTexto = String.valueOf(25); // Podemos usar un valor literal o tambien boolean
        System.out.println("edadTexto = " + edadTexto);
        
        // Casting o Castear
        short s =10;
        byte b = (byte) s;
        System.out.println("b = " + b);
        
    }
    
}
