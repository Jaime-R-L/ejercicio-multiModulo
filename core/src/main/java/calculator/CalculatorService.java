package calculator;

import interaccionesConsola.InteracionesConsola;
import operations.BasicOpertationsService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CalculatorService {

    public static void runCalculator() {
        String mensaje = "Select an operation:\n1. Split\n2. Sum\n3. String concatenation\n4. Exit\nOption: ";

        String operacion = InteracionesConsola.leerConsola(mensaje);

        String result = seleccionOperacion(operacion);

        System.out.println(result);
    }

    private static String seleccionOperacion(String operacion) {
        String result = "";
        switch (operacion) {
            case "1":
                String mensaje1 = "Introduzca el texto a separar: ";
                String mensaje2 = "Introduzca el caracter por el cual se debe separar: ";

                String dato1 = InteracionesConsola.leerConsola(mensaje1);
                String dato2 = InteracionesConsola.leerConsola(mensaje2);

                String[] cadenas = BasicOpertationsService.split(dato1, dato2);
                result = "Parte 1: " + cadenas[0];
                result += ", Parte 2: " + cadenas[1];
                break;
            case "2":
                List<Double> datos = introduccionOperandos();
                result = String.valueOf(BasicOpertationsService.suma(datos.get(0), datos.get(1)));

                break;
            case "3":
                String mensaje3 = "Introduzca la primera parte del texto: ";
                String mensaje4 = "Introduzca la segunda parte del texto: ";

                String texto1 = InteracionesConsola.leerConsola(mensaje3);
                String texto2 = InteracionesConsola.leerConsola(mensaje4);

                result = BasicOpertationsService.concatenation(texto1, texto2);
                break;
            case "4":
                break;
        }
        return result;
    }

    private static List<Double> introduccionOperandos() {
        List<Double> datos = new ArrayList<>();

        String mensaje1 = "Introduzca el primer valor: ";
        String mensaje2 = "Introduzca el segundo valor: ";

        String dato1 = InteracionesConsola.leerConsola(mensaje1);
        String dato2 = InteracionesConsola.leerConsola(mensaje2);

        datos.add(Double.parseDouble(dato1));
        datos.add(Double.parseDouble(dato2));

        return datos;
    }
}
