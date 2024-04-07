package com.softtek.presentacion;

import com.softtek.modelo.Bateria;
import com.softtek.modelo.Flauta;
import com.softtek.modelo.Guitarra;
import com.softtek.modelo.InstrumentoMusical;

public class PruebaInstrumento {

    public static void main(String[] args){
        InstrumentoMusical guido = new Guitarra("guido", "metal");
        InstrumentoMusical bataca = new Bateria("bataca", 3);
        InstrumentoMusical ham = new Flauta("ham", "madera");
        InstrumentoMusical[] intrumentos = new InstrumentoMusical[3];
        intrumentos[0]=guido;
        intrumentos[1]=bataca;
        intrumentos[2]=ham;
        for (InstrumentoMusical iM: intrumentos) {
            System.out.println(iM.emitirSonido());
        }
    }
}
