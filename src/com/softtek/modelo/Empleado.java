package com.softtek.modelo;

public class Empleado {
    protected String nombre;
    protected double sueldo;
    protected double PORCENTAJE;

    public double calcularNomina(){
        return sueldo * PORCENTAJE;
    }

    public Empleado(String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.PORCENTAJE = 0.75;
    }
}
