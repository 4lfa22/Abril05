package com.softtek.modelo;

public class Gerente extends Empleado{
    private double bono;

    @Override
    public double calcularNomina(){
        return (bono+sueldo)*PORCENTAJE;
    }

    public Gerente(String nombre, double sueldo, double bono) {
        super(nombre, sueldo);
        this.bono = bono;
    }
}
