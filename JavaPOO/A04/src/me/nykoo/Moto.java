package me.nykoo;

public class Moto {

   private String modelo;
   private String color;
   private boolean abertita;
   private boolean fechadita;

   public Moto(String m, String c, boolean a) { //Metodo construtor
       this.modelo = m;
       this.color = c;
       this.abertita = a;
       this.fechada();
   }

   public String getModelo(){
       return this.modelo;
   }

   public void setModelo(String m) {
       this.modelo = m;
   }

   public String getColor() {
       return this.color;
   }

   public void aberta() {
       this.abertita = true;
   }

   public void fechada() {
       this.fechadita = false;
   }
   public void setColor(String c){
       this.color = c;
   }

   public void status(){
       System.out.println("Modelo: " + this.getModelo());
       System.out.println("Color: " + this.getColor());
       System.out.println("Aberta: " + this.abertita);
   }

}
