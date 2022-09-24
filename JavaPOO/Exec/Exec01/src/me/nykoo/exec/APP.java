package me.nykoo.exec;

public class APP {

    String color;
    String modelo;
    boolean tampado;
    int agua;
    boolean lacinho;


    void status() {
        if (this.tampado == false) {
            System.out.println("Modelo: " + this.modelo);
            System.out.println("Cor: " + this.color);
            System.out.println("Porcentagem de água: " + this.agua);
            System.out.println("Tem lacinho: " + this.lacinho);
            System.out.println("Tampado: " + this.tampado);
        }
    }

    void consumir() {
        if (this.tampado == true) {
            System.out.println("Não pode consumir");
        }else {
            System.out.println("Já pode consumir!");
        }
    }
    void tampar() {
        this.tampado = true;
    }

    void destampar() {
        this.tampado = false;

        if (this.tampado == false) {
            this.agua = 100;
        }

    }

    void lacinho() {
        this.lacinho = true;
    }


}
