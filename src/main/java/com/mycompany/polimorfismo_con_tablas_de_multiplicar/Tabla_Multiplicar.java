
package com.mycompany.polimorfismo_con_tablas_de_multiplicar;

abstract class Tabla_Multiplicar {
    
    protected int numero;

    public Tabla_Multiplicar(int numero) {
        this.numero = numero;
    }

    public abstract void mostrar();

    public abstract int sumarResultados();
}
