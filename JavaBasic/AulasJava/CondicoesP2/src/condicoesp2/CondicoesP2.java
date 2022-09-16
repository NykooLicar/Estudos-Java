/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package condicoesp2;

import java.util.Scanner;

/**
 *
 * @author paulo
 */
public class CondicoesP2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String tipo;
        System.out.println("Quantas pernas?");
        int perna = teclado.nextInt();
        System.out.print("Isso é um(a) ");
        switch (perna) {
            case 1:
                tipo = "Sacy";
                break;
            case 2:
                tipo = "Bípede";
                break;
            case 4:
                tipo = "Quadrupede";
                break;
            case 6:
                tipo = "Aranha";
                break;
            default:
                tipo = "ET";
        }
        System.out.println(tipo);
        
        
        
    }
    
}
