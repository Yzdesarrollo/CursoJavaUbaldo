
public class CaracteresEspeciales {

    public static void main(String[] args) {

        var nombre = "Karla";
        var apellido = "Esparza";
        
        System.out.println(nombre + " " + apellido);
        
        // Imprimir en una nueva linea
        System.out.println("Nueva linea: \n" + nombre);
        
        // Agrega espacio de un tabulador
        System.out.println("Tabulador: \t" + nombre);
        
        // Borra y retrocede un espacio
        System.out.println("Retroceso: \b\b" + nombre);
        
        // Parecido a \n
        System.out.println("Retorno de carro: \r" + nombre);
        
        // Para envolver en comillas simples
        System.out.println("Comilla simple: \'" + nombre + "\'");
        
        // Para envolver en comillas Dobles
        System.out.println("Comilla doble: \"" + nombre + "\"");
        
        System.out.println("saludos");
        System.out.print("adios"); // No agrega salto de linea
        System.out.println("nos vemos");
    }
}
