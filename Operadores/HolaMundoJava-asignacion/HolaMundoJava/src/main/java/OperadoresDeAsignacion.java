
import java.util.Scanner;

public class OperadoresDeAsignacion {

    public static void main(String[] args) {

        int a = 3, b = 2;

        int c = a + 5 - b;
        System.out.println("c = " + c);

        // Incremento
        a += 1;// a=a+1 se ejecuta siempre lo que esta en el lado derecho
        System.out.println("a = " + a);
        
        a += 3;//a=a+3
        System.out.println("a = " + a);
        
        // Drecremento
        b -= 1;//b=b-1
        System.out.println("b = " + b);
        
        // *=, /=, %= 
    }
}
