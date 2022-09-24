package me.nykoo;

public class Main {

    public static void main(String[] args){
        Moto moto = new Moto("XRE", "Vermelha", false);
        moto.status();


        Moto mm = new Moto("Honda biz", "Amarela", true);
        System.out.println("");
        mm.status();

    }
}
