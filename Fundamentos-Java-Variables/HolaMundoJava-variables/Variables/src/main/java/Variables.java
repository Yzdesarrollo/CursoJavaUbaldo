
public class Variables {

    public static void main(String[] args) {
        
        String saludar = "saludos desde Java";
        
        System.out.println(saludar);
        System.out.println(saludar);
        System.out.println(saludar);
        
        var despedirse = "hasta luego"; // var infiere en el tipo de dato segun lo que este del lado derecho
        System.out.println(despedirse);
        
        var numero = 1; // var infiere en el tipo de dato
        System.out.println(numero);
        
    }
}
