package com.softtek.presentacion;

import com.softtek.modelo.Cuadrado;
import com.softtek.modelo.Figura;
import com.softtek.modelo.Triangulo;

public class PruebaFigura {
    public static void main(String[] args){
        Cuadrado cPeque = new Cuadrado();
        cPeque.setX(2);
        cPeque.setY(4);
        cPeque.setLado(3.5);
        Figura cMediano = new Cuadrado(5, 6,5.4);
        Triangulo tPeque = new Triangulo();
        tPeque.setY(3);
        tPeque.setX(6);
        tPeque.setAltura(4.9);
        tPeque.setBase(3.7);
        Figura tMediano = new Triangulo(6, 85, 4.2, 7.9);
        Figura[] Figuras = new Figura[4];
        Figuras[0]=cPeque;
        Figuras[1]=cMediano;
        Figuras[2]=tPeque;
        Figuras[3]=tMediano;
        for (Figura f: Figuras) {
            System.out.println(f.calcularArea());
        }

    }
}
