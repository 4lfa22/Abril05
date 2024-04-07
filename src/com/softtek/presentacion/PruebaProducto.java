package com.softtek.presentacion;

import com.softtek.modelo.ProductoPerecedero;

import java.time.LocalDate;

public class PruebaProducto {
    public static void main(String[] args){
        ProductoPerecedero p1 = new ProductoPerecedero("tomate", 20, 1.2, LocalDate.of(2024, 4, 10), LocalDate.of(2024, 4, 5));
        System.out.println(p1.cantidadAPagar() + "$");
        System.out.println(p1.tiempoConsumicion() + " días");
    }

}
