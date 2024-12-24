
package com.mycompany.polimorfismo_con_tablas_de_multiplicar;

abstract class Operaciones {
   
    protected int numero;

    public Operaciones (int numero) {
        this.numero = numero;
    }

    public abstract void realizarOperacion();

    public int sumarTabla() {
        int suma = 0;
        for (int i = 1; i <= 10; i++) {
            suma += numero * i;
        }
        return suma;
    }

    public void mostrarTablaInvertida() {
        System.out.println("Tabla del " + numero + " (Invertida):");
        for (int i = 10; i >= 1; i--) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}