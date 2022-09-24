package me.nykoo;

public class Caneta {

    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

        void status(){
            System.out.println("Modelo: " + this.modelo);
            System.out.println("Caneta cor " + this.cor);
            System.out.println("Tampada? " + this.tampada);
            System.out.println("Qual a ponta? " + this.ponta);
            System.out.println("Qual a carga? " + this.carga + "%");
            System.out.println("");

        }

        void rabiscar(){
            if (this.tampada == true) {
                System.out.println("ERRO! Sem rasbico");
            }else {
                System.out.println("Rabixxxxxca!");
            }
        }
        void tampar(){
            this.tampada = true;
            }

        void destampar() {
                this.tampada = false;
            }



}
