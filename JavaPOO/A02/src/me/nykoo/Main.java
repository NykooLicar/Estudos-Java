package me.nykoo;

public class Main {

    public static void main(String[] args){

        Caneta c1 = new Caneta();
        c1.modelo = "Tesla model S";
        c1.cor = "Branca";
        //c1.ponta = 0.7f;
        c1.carga = 50;
        //c1.tampada = true;
        c1.status();
        c1.rabiscar();



    }
}
