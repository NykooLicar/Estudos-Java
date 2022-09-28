package me.nykoo;

public class Moto {

   private String modelo;
   private String color;
   private boolean abertita;

    public Moto(String modelo, String color, boolean abertita) {
        this.modelo = modelo;
        this.color = color;
        this.abertita = abertita;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isAbertita() {
        return abertita;
    }

    public void setAbertita(boolean abertita) {
        this.abertita = abertita;
    }
}
