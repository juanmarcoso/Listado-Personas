import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Por Juan Orellana
 * juanmadev69@gmail.com
*/

public class ListadoPersonasApp {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        // Definimos la lista fuera del ciclo while
        List<Persona> personas = new ArrayList<>();

        // Definimos el menu
        var salir= false;

        while(!salir){

            mostrarMenu();

            try{
                salir = ejecutarOperacion(teclado, personas);
            } catch(Exception e){
                System.out.println("Ocurrio un error: " + e.getMessage());
            }
            
            System.out.println("");
        }

        teclado.close();
    }

    private static void mostrarMenu(){
        // Mostrar las opciones
        System.out.print("""

                *** Listado de Personas ***

                1. Agregar
                2. Listar 
                3. Salir

                """);

        System.out.print("Proporciona la opcion: ");
    }

    private static boolean ejecutarOperacion(Scanner teclado, List<Persona> personas){

        int opcion = Integer.parseInt(teclado.nextLine());
        var salir = false;

        // Revisamos la opcion proporcionada
        switch (opcion) {
            case 1: // Agregar persona la lista
                System.out.println(" ");
                System.out.print("Proporciona el nombre: ");
                var nombre = teclado.nextLine();
                System.out.print("Proporciona el telefono: ");
                var tel = teclado.nextLine();
                System.out.print("Proporciona el email: ");
                var email = teclado.nextLine();

                // Creamos el objeto persona
                var persona = new Persona(nombre, tel ,email);

                // Lo agregamos a la lista
                personas.add(persona);
                System.out.println("La lista tiene: " + personas.size() + " elementos");

                break;

            case 2: // Listamos personas
                System.out.println("Listado de Personas");

                // Mejora usando lambda y metodo de referencia
                personas.forEach(System.out::println); // Con :: llamamos a cada objeto de la lista.

                break;

            case 3: 
                System.out.println("Hasta pronto!");
                salir = true;
                break;
                        
            default:
                System.out.println("Opcion erronea: " + opcion);
                break;
        }
        return salir;
    }

}
