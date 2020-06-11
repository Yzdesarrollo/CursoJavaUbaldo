
import java.util.Scanner;

public class OperadoresAritmeticos {

    public static void main(String[] args) {

        int a = 3, b = 2; // var no se usa para trabajar en una misma linea

        // Suma
        var resultado = a + b;
        System.out.println("resultado suma = " + resultado);
        System.out.println("resultado suma = " + (a  + b) ); // Para que no concatene lo dejamos en parentesis
       
        // Resta
        resultado = a - b;
        System.out.println("resultado resta = " + resultado);
        System.out.println("resultado resta = " + (a - b));
        
        // Multiplicacion
        resultado = a * b;
        System.out.println("resultado multiplicacion = " + resultado);
        System.out.println("resultado multiplicacion = " + (a * b));
        
        double resultado2 = 3D / b; // Para que esto devuelva la division con decimales tambien podemos usar var.
        System.out.println("resultado division = " + resultado2);
        
        // Modulo o Porcentaje
        resultado = a % b; // Es residuo entero de la division
        System.out.println("resultado modulo= " + resultado);
        
        resultado = a % 2; // Si el operando a es un numero par 1 es impar 0 es par 
        System.out.println("resultado = " + resultado);
        
        resultado = b % 2;
        System.out.println("resultado = " + resultado);
        
        if(resultado == 0)
            System.out.println("es numero par");
        else
            System.out.println("es numero impar");
    }
}
