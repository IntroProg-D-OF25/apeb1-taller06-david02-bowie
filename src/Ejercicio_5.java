
/*Determinar el tipo de operación matemática. Dado un número del 1 al 4 que
representa una operación matemática básica (suma, resta, multiplicación, división),
muestra el nombre de la operación correspondiente. Por ejemplo, si el usuario 
ingresa 1, debe mostrar "Suma"; si ingresa 2, debe mostrar "Resta", y así sucesivamente.
*/
import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);

        // Declaración de variables
        int numero_operacion;
        String nombre_operacion;

        // Solicitar al usuario el número de la operación
        System.out.println("Ingrese un número del 1 al 4 que represente una operación matemática:");
        System.out.println("1: Suma");
        System.out.println("2: Resta");
        System.out.println("3: Multiplicación");
        System.out.println("4: División");
        numero_operacion = tcl.nextInt();

        // Determinar el nombre de la operación
        switch (numero_operacion) {
            case 1:
                nombre_operacion = "Suma";
                break;
            case 2:
                nombre_operacion = "Resta";
                break;
            case 3:
                nombre_operacion = "Multiplicación";
                break;
            case 4:
                nombre_operacion = "División";
                break;
            default:
                nombre_operacion = "número inválido. Por favor ingrese un número entre 1 y 4.";
        }

        // Mostrar el nombre de la operación
        System.out.println("la operación seleccionada es: " + nombre_operacion);
    }
}
