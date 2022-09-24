package me.nykoo;

public class Main {

    public static void main(String[] args){

        Caneta c1 = new Caneta();
        c1.cor = "azul";
        c1.ponta = 0.7f;
        c1.carga = 90;
        c1.modelo = "Bic 100";
        c1.tampar();

        c1.rabiscar();
        c1.status();

        Caneta canetona = new Caneta();

        canetona.modelo = "Hornet 360";
        canetona.ponta = 5.6f;
        canetona.cor = "Amarela";
        canetona.carga = 12;
        canetona.destampar();
        canetona.rabiscar();
        canetona.status();


    }
}
