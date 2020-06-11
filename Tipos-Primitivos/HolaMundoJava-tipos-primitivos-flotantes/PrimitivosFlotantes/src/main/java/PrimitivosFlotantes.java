
import java.util.Scanner;

public class PrimitivosFlotantes {

    public static void main(String[] args) {
        
        // PRIMITIVOS FLOTANTES

        var floatVar = 1000.10F; // Variable de tipo flotante ya que la indicamos con la literal
        System.out.println("floatVar = " + floatVar);
        
        // Limites del tipo Float
        System.out.println("bits tipo float:" + Float.SIZE);
        System.out.println("bytes tipo float:" + Float.BYTES);
        System.out.println("valor minimo tipo float:" + Float.MIN_VALUE);
        System.out.println("valor maximo tipo float:" + Float.MAX_VALUE);
        
        var doubleVar = 100D; // Variable de tipo double ya que la indicamos con la literal
        System.out.println("doubleVar = " + doubleVar);
        
        // Limites del tipo Double
        System.out.println("bits tipo double:" + Double.SIZE);
        System.out.println("bytes tipo double:" + Double.BYTES);
        System.out.println("valor minimo tipo double:" + Double.MIN_VALUE);
        System.out.println("valor maximo tipo double:" + Double.MAX_VALUE);
        
    }
}
