package com.softtek.presentacion;

import com.softtek.modelo.Empleado;
import com.softtek.modelo.Gerente;
import com.softtek.modelo.Operador;
import com.softtek.modelo.Vendedor;

public class PruebaEmpleado {

    public static void main(String[] args){
        Empleado e1 = new Empleado("Jesús", 1000.04);
        e1.calcularNomina();
        Gerente g1 = new Gerente("Javier", 1300.64, 100);
        g1.calcularNomina();
        Vendedor v1 = new Vendedor("Laura", 1400, 30, 20);
        v1.calcularNomina();
        Operador o1 = new Operador("Francisco", 1200, 23, 10.54);
        o1.calcularNomina();
    }
}
