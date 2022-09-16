/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package condicoes;

import java.util.Scanner;

/**
 *
 * @author paulo
 */
public class Condicoes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Qual o ano que você nasceu: ");
        int nasc = teclado.nextInt();
        int nascc = 2022 - nasc;
        
        if (nascc >= 18) {
            System.out.println("Olá senhor maior de idade." + "Você tem " + nascc + " anos de Idade.");
            
        } else {
            System.out.println("Você é menor de idade rapá, sai daqui! " + "você tem " + nascc + " anos de Idade.");
        } 
        
        /*System.out.print("Digite sua nota do primeiro semestre: ");
        float n1 = teclado.nextFloat();
        System.out.print("Digite sua nota do segundo semestre: ");
        float n2 = teclado.nextFloat();
        float m = (n1 + n2) / 2;
        if (m >= 9) {
            System.out.println("Parabéns, pequenino gafanhoto! Sua nota é " + m);
        } else {
            System.out.println("Sua nota é " + m);
        }
*/
    }
    
}
