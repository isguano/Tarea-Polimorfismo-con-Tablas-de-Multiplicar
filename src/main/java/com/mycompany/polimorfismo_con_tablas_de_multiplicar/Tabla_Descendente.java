
package com.mycompany.polimorfismo_con_tablas_de_multiplicar;

 class Tabla_Descendente extends Tabla_Multiplicar {

    public Tabla_Descendente(int numero) {
        super(numero);
    }

    @Override
    public void mostrar() {
        System.out.println("Tabla del " + numero + " (Descendente):");
        for (int i = 10; i >= 1; i--) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }

    @Override
    public int sumarResultados() {
        int suma = 0;
        for (int i = 10; i >= 1; i--) {
            suma += numero * i;
        }
        return suma;
    }
}