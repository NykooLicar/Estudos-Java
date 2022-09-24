package me.nykoo.exec;

public class Exec {

    public static void main(String[] args) {

        APP Garrafa = new APP();

        Garrafa.color = "Vermelha";
        Garrafa.agua = 0;
        Garrafa.modelo = "Tupperware";
        Garrafa.destampar();
        Garrafa.consumir();
        Garrafa.lacinho();
        Garrafa.status();


    }

}
