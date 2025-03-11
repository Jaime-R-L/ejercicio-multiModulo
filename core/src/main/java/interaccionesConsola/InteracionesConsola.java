package interaccionesConsola;

import java.util.Scanner;

public class InteracionesConsola {

    public static String leerConsola(String mensaje) {
        Scanner scanner = new Scanner(System.in); // Crea un scanner
        System.out.print(mensaje);

        return scanner.nextLine(); // Captura el texto ingresado y lo devuelve
    }

    public static void mostrarConsola(String datos) {

        System.out.println(datos);
    }
}
