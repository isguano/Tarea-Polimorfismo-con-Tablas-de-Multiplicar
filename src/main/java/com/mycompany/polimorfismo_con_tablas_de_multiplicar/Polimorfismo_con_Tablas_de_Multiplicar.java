
package com.mycompany.polimorfismo_con_tablas_de_multiplicar;
import java.util.Scanner;


public class Polimorfismo_con_Tablas_de_Multiplicar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

System.out.println("Ingresa el rango inicial de la tabla de multiplicar:");
        int inicio = scanner.nextInt();

        System.out.println("Ingresa el rango final de la tabla de multiplicar:");
        int fin = scanner.nextInt();

        int sumaTotal = 0;

        for (int i = inicio; i <= fin; i++) {
            Tabla_Multiplicar tabla = new Tabla_Multiplicar(i);
            tabla.realizarOperacion();
            int sumaTabla = tabla.sumarTabla();
            System.out.println("Suma de los resultados: " + sumaTabla);
            sumaTotal += sumaTabla;
        }

        System.out.println("\n¿Quieres ver las tablas invertidas? (sí/no):");
        String respuesta = scanner.next().toLowerCase();

        if (respuesta.equals("sí")) {
            for (int i = inicio; i <= fin; i++) {
                Tabla_Multiplicar tabla = new Tabla_Multiplicar(i);
                tabla.mostrarTablaInvertida();
            }
        }

        System.out.println("La suma total de todas las tablas de multiplicar es: " + sumaTotal);
        scanner.close();
    }
}
