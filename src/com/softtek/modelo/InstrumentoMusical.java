package com.softtek.modelo;

public class InstrumentoMusical {
    protected String marca;

    public String emitirSonido(){
        return "Sonido";
    }

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
