/*Facturación de 2 productos: La empresa Amazon.com le contrata como desarrollador 
de Sistemas Informáticos para programar su sistema de compras online, el cual calcule
el precio total de la compra para un cliente. Para ello, se necesita utilizar
estructuras secuenciales y de selección (if simple, doble y/o anidadas), sin aplicar ciclos repetitivos.
*/
import java.util.Scanner;
public class Ejercicio_1 {
public class AmazonBillingSystem {
    public static void main(String[] args) {
        // Declaración de variables
        double precio_producto1, precio_producto2, subtotal, iva, descuento, envio, total;
        double porcentaje_iva = 0.10;
        double descuento_5 = 0.05;
        double descuento_20 = 0.20;
        double costo_envio = 50.00;

        // Entrada de datos
        Scanner tcl = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto 1: ");
        precio_producto1 = tcl.nextDouble();

        System.out.print("Ingrese el precio del producto 2: ");
        precio_producto2 = tcl.nextDouble();

        // Cálculo del subtotal e IVA
        subtotal = precio_producto1 + precio_producto2;
        iva = subtotal * porcentaje_iva;

        // Determinar el descuento
        if (subtotal > 1000) {
            descuento = subtotal * descuento_20;
        } else if (subtotal >= 1000) {
            descuento = subtotal * descuento_5;
        } else {
            descuento = 0.0;
        }

        // Determinar el costo de envío
        if (subtotal > 5000) {
            envio = 0.0;
        } else {
            envio = costo_envio;
        }

        // Calcular el total
        total = (subtotal + iva - descuento) + envio;

        // Mostrar los detalles de la factura
        System.out.println("\n--- Factura de Compra ---");
        System.out.printf("Precio Producto 1: $%.2f\n", precio_producto1);
        System.out.printf("Precio Producto 2: $%.2f\n", precio_producto2);
        System.out.printf("Subtotal (sin IVA): $%.2f\n", subtotal);
        System.out.printf("IVA (10%%): $%.2f\n", iva);
        System.out.printf("Descuento aplicado: $%.2f\n", descuento);
        System.out.printf("Costo de envío: $%.2f\n", envio);
        System.out.printf("Monto Total a pagar: $%.2f\n", total);
    }
}

}
