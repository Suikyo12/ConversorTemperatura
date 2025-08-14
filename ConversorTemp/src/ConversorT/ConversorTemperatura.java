package ConversorT;

import java.util.Scanner;

/**
 * Programa de conversión de temperaturas.
 * <p>
 * Permite convertir valores entre grados Celsius y grados Fahrenheit
 * mediante un menú interactivo. El usuario puede elegir la dirección
 * de la conversión o salir del programa.
 * </p>
 * 
 * Fórmulas utilizadas:
 * <ul>
 *   <li>Celsius a Fahrenheit: (C × 9/5) + 32</li>
 *   <li>Fahrenheit a Celsius: (F − 32) × 5/9</li>
 * </ul>
 * 
 * Ejemplo de uso:
 * <pre>
 * 1. Convertir Celsius a Fahrenheit
 * 2. Convertir Fahrenheit a Celsius
 * 3. Salir
 * </pre>
 * 
 * @author Francisco Valencia
 */

public class ConversorTemperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n || Bienvenido al sistema de conversión de temperaturas || \n");
            System.out.println("1. Convertir Celsius a Fahrenheit");
            System.out.println("2. Convertir Fahrenheit a Celsius");
            System.out.println("3. Salir del programa \n");
            System.out.print("Seleccione una de las opciones: \n");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Digite la temperatura en grados Celsius C°: ");
                    double celsius = sc.nextDouble();

                    double fahrenheit = (celsius * 9 / 5) + 32;
                    System.out.println("La temperatura en grados Fahrenheit es: " + fahrenheit + " °F");
                    break;

                case 2:
                    System.out.println("Digite la temperatura en grados Fahrenheit °F: ");
                    double fahrenheitEntrada = sc.nextDouble();

                    double fahrenheitACelsius = (fahrenheitEntrada - 32) * 5 / 9;
                    System.out.println("La temperatura en grados Celsius es: " + fahrenheitACelsius + " C°");
                    break;

                case 3:
                    System.out.print("Saliendo del programa... Adios!");
                    break;

                default:
                    System.out.print("Opción inválida. Ingrese datos correctos.");
                    break;
            }
        } while (opcion != 3);
        {
            sc.close();
        }
    }

}
