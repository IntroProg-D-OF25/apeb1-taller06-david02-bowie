
/*Convertir un número de mes a nombre. Dado un número del 1 al 12, que representa 
un mes del año, muestra el nombre del mes correspondiente. Por ejemplo, si el 
usuario ingresa 1, debe mostrar "Enero"; si ingresa 2, debe mostrar "Febrero", y así sucesivamente.
*/
import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);

        // Declaración de variables
        int numero_mes;
        String nombre_mes;

        // Solicitar al usuario el número del mes
        System.out.println("Ingrese un número del 1 al 12 que represente un mes del año: ");
        numero_mes = tcl.nextInt();

        // Determinar el nombre del mes
        switch (numero_mes) {
            case 1:
                nombre_mes = "Enero";
                break;
            case 2:
                nombre_mes = "Febrero";
                break;
            case 3:
                nombre_mes = "Marzo";
                break;
            case 4:
                nombre_mes = "Abril";
                break;
            case 5:
                nombre_mes = "Mayo";
                break;
            case 6:
                nombre_mes = "Junio";
                break;
            case 7:
                nombre_mes = "Julio";
                break;
            case 8:
                nombre_mes = "Agosto";
                break;
            case 9:
                nombre_mes = "Septiembre";
                break;
            case 10:
                nombre_mes = "Octubre";
                break;
            case 11:
                nombre_mes = "Noviembre";
                break;
            case 12:
                nombre_mes = "Diciembre";
                break;
            default:
                nombre_mes = "error. or favor ingrese un número entre 1 y 12.";
        }

        // Mostrar el nombre del mes
        System.out.println("el mes correspondiente es: " + nombre_mes);
    }
}
