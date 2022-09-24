package me.nykoo;

public class Main {

    public static void main(String[] args){

        Caneta c1 = new Caneta();
        c1.cor = "azul";
        c1.ponta = 0.7f;
        c1.carga = 90;
        c1.modelo = "Bic 100";
        c1.destampar();
        c1.rabiscar();
        c1.status();



    }
}
