package com.softtek.modelo;

public class Producto {
    protected String nombre;
    protected int cantidad;
    protected double pvp;

    public double cantidadAPagar() {
        return pvp*cantidad;
    }

    public Producto(String nombre, int cantidad, double pvp) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.pvp = pvp;
    }
}
