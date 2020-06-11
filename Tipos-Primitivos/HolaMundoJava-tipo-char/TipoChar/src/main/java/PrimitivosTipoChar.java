
import java.util.Scanner;

public class PrimitivosTipoChar {

    public static void main(String[] args) {

        // Limites del Tipo Char
        System.out.println("bits tipo char:" + Character.SIZE);
        System.out.println("bytes tipo char:" + Character.BYTES);
        System.out.println("valor minimo tipo char:" + Character.MIN_VALUE);
        System.out.println("valor maximo tipo char:" + Character.MAX_VALUE);
        
        var varChar = '\u0021'; // Comillas simples /u0021 es un codigo de la lista de unicode
        System.out.println("varChar = " + varChar);
        
        char varCharDecimal = 33; // 33 es el codigo de la tabla unicode si usamos var no lo reconoce como char sino como un entero
        System.out.println("varCharDecimal = " + varCharDecimal);
        
        var varCharSimbolo = '!';
        System.out.println("varCharSimbolo = " + varCharSimbolo);
        
      
    }
}
