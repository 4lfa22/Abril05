package com.softtek.modelo;

public class Operador extends Empleado{
    private int piezas;
    private double incentivo;

    @Override
    public double calcularNomina(){
        return ((piezas*incentivo)+sueldo)*PORCENTAJE;
    }

    public Operador(String nombre, double sueldo, int piezas, double incentivo) {
        super(nombre, sueldo);
        this.piezas = piezas;
        this.incentivo = incentivo;
    }
}
