package com.softtek.modelo;

public abstract class InstrumentoMusical {
    protected String marca;

    public abstract String emitirSonido();

    public InstrumentoMusical(String marca){
        this.marca=marca;
    }

    public InstrumentoMusical(){

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
