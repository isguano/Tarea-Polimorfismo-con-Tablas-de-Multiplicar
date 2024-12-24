
package com.mycompany.polimorfismo_con_tablas_de_multiplicar;


 class Tabla_Ascendente extends Tabla_Multiplicar {
    

    public Tabla_Ascendente(int numero) {
        super(numero);
    }

    @Override
    public void mostrar() {
        System.out.println("Tabla del " + numero + " (Ascendente):");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }

    @Override
    public int sumarResultados() {
        int suma = 0;
        for (int i = 1; i <= 10; i++) {
            suma += numero * i;
        }
        return suma;
    }
}
