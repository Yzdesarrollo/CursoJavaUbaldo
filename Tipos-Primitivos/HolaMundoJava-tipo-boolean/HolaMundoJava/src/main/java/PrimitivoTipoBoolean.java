
import java.util.Scanner;

public class PrimitivoTipoBoolean {

    public static void main(String[] args) {

        //boolean
        
        System.out.println("true tipo boolean: " + Boolean.TRUE);
        System.out.println("false tipo boolean: " + Boolean.FALSE);
        
        // Ejemplo 1
        boolean booleanVar = false;
        
        if(booleanVar)
        {
            System.out.println("el valor es verdadero");
        }
        else
        {
            System.out.println("el valor es falso");
        }
        
        // Ejemplo 2
        
        System.out.println("");
        
        var edad = 30;
        var esAdulto = edad >= 18;
        System.out.println("esAdulto = " + esAdulto);

    }
}
