
/*Costo de envío de paquetes Un servicio de envío cobra diferentes tarifas según 
la región y el peso del paquete. Si el peso es menor de 5 kg y la región es "local"
, el costo es de $5. Si pesa entre 5 y 10 kg, el costo es de $10 para la región
"nacional". Para cualquier otro caso, el costo es de $15.
*/
import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);

        // Declaración de variables
        String region;
        float peso;
        double costo;

        // Solicitar datos al usuario
        System.out.println("Ingrese la región (local/nacional): ");
        region = tcl.nextLine();

        System.out.println("Ingrese el peso del paquete en kg: ");
        peso = tcl.nextFloat();

        // Determinar el costo del envío
        if (peso < 5 && region.equalsIgnoreCase("local")) {
            costo = 5.0;
        } else if (peso >= 5 && peso <= 10 && region.equalsIgnoreCase("nacional")) {
            costo = 10.0;
        } else {
            costo = 15.0;
        }

        // Mostrar el resultado
        System.out.println("El costo de envío es: $" + costo);
    }
}