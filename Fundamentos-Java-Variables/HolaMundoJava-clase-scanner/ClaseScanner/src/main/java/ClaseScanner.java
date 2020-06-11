
import java.util.Scanner;

public class ClaseScanner {

    public static void main(String[] args) {
        
        // Se usa para capturar lo que se ingresa desde consola
        // Scanner con S mayuscula es el tipo esta clase
        // ejemploscanner es el identificador con el cual vamos a usar esta clase
        Scanner ejemploscanner = new Scanner(System.in);

        System.out.println("proporciona el valor del usuario en la consola:");
        var usuario = ejemploscanner.nextLine(); // nextLine va leer una linea en consola
        System.out.println("usuario = " + usuario);

    }
}
