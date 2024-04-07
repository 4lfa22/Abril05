package com.softtek.modelo;

public class Vendedor extends Empleado{

    private double ventas;
    private double comision;

    @Override
    public double calcularNomina() {
        return ((ventas*comision)+sueldo)*PORCENTAJE;
    }

    public Vendedor(String nombre, double sueldo, double ventas, double comision) {
        super(nombre, sueldo);
        this.ventas = ventas;
        this.comision = comision;
    }
}
