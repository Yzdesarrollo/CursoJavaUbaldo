
import java.util.Scanner;

public class SistemasNumericos {

    public static void main(String[] args) {

        var numeroDecimal = 10;
        System.out.println("numeroDecimal = " + numeroDecimal);

        var numeroOctal = 012; // Este valor es de tipo Octal poniendole al principio un cero
        System.out.println("numeroOctal = " + numeroOctal);
        
        var numeroHexadecimal = 0xA; // Este valor es de tipo Hexadecimal porque inica con 0x
        System.out.println("numeroHexadecimal = " + numeroHexadecimal);
        
        var numberoBinario = 0b1010; // Este valor es de tipo binario porque inicia 0b
        System.out.println("numberoBinario = " + numberoBinario);
    }
}
