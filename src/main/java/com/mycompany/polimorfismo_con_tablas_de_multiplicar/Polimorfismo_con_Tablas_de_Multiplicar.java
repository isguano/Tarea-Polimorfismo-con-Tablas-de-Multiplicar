
package com.mycompany.polimorfismo_con_tablas_de_multiplicar;
import java.util.Scanner;


public class Polimorfismo_con_Tablas_de_Multiplicar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el rango inicial de la tabla de multiplicar:");
        int inicio = scanner.nextInt();

        System.out.println("Ingrese el rango final de la tabla de multiplicar:");
        int fin = scanner.nextInt();

        System.out.println("Desea ver las tablas en orden ascendente (A) o descendente (D)?");
        char orden = scanner.next().toUpperCase().charAt(0);

        int sumaTotal = 0;

        for (int i = inicio; i <= fin; i++) {
            Tabla_Multiplicar tabla;

            if (orden == 'A') {
                tabla = new Tabla_Ascendente(i);
            } else if (orden == 'D') {
                tabla = new Tabla_Descendente(i);
            } else {
                System.out.println("Opción no válida. Saliendo del programa.");
                scanner.close();
                return;
            }

            tabla.mostrar();
            sumaTotal += tabla.sumarResultados();
        }

        System.out.println("\nSuma total de los resultados de todas las tablas: " + sumaTotal);

        scanner.close();
    }
}