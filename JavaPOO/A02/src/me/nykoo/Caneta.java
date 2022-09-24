package me.nykoo;

public class Caneta {

    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;

        public void status(){
            System.out.println("Modelo: " + this.modelo);
            System.out.println("Cor da caneta: " + this.cor);
            System.out.println("Tampada: " + this.tampada);
            System.out.println("Qual a ponta: " + this.ponta);
            System.out.println("Qual a carga: " + this.carga + "%");
            System.out.println("");

        }

        public void rabiscar(){
            if (this.tampada == true) {
                System.out.println("ERRO! Sem rasbico");
            }else {
                System.out.println("Rabixxxxxca!");
            }
        }
        public void tampar(){
            this.tampada = true;
            }

        public void destampar() {
            this.tampada = false;
            }



}
