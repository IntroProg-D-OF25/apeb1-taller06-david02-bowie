/*Costo de envío de paquetes Un servicio de envío cobra diferentes tarifas según 
la región y el peso del paquete. Si el peso es menor de 5 kg y la región es "local"
, el costo es de $5. Si pesa entre 5 y 10 kg, el costo es de $10 para la región
"nacional". Para cualquier otro caso, el costo es de $15.
*/
import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {
        // Declaración de variables
        double peso;
        String region;
        double costo;

        // Entrada de datos
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el peso del paquete (en kg): ");
        peso = scanner.nextDouble();
        scanner.nextLine(); // Consumir la nueva línea pendiente

        System.out.print("Ingrese la región del envío (local/nacional/internacional): ");
        region = scanner.nextLine().toLowerCase(); // Convertir a minúsculas para evitar problemas de comparación

        // Determinar el costo del envío
        if (peso < 5 && region.equals("local")) {
            costo = 5.0;
        } else if (peso >= 5 && peso <= 10 && region.equals("nacional")) {
            costo = 10.0;
        } else {
            costo = 15.0;
        }

        // Mostrar el resultado
        System.out.printf("El costo del envío es: $%.2f\n", costo);

        scanner.close();
    }
}
