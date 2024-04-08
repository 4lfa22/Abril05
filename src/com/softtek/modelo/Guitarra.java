package com.softtek.modelo;

public class Guitarra extends InstrumentoMusical{

    private String Cuerdas;

    @Override
    public String emitirSonido() {
        return "Sonido guitarra";
    }

    public Guitarra(String marca, String cuerdas) {
        super(marca);
        Cuerdas = cuerdas;
    }

    public Guitarra() {

    }

    public String getCuerdas() {
        return Cuerdas;
    }

    public void setCuerdas(String cuerdas) {
        Cuerdas = cuerdas;
    }
}
