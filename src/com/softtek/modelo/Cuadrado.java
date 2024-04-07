package com.softtek.modelo;

public class Cuadrado extends Figura{
    private double lado;

    @Override
    public double calcularArea(){
        return lado*lado;
    }

    public Cuadrado(int x, int y, double lado) {
        super(x, y);
        this.lado = lado;
    }

    public Cuadrado() {

    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}
