
package com.mycompany.polimorfismo_con_tablas_de_multiplicar;


class Tabla_Multiplicar extends Operaciones  {
    
    public Tabla_Multiplicar(int numero) {
        super(numero);
    }

    @Override
    public void realizarOperacion() {
        System.out.println("Tabla del " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}