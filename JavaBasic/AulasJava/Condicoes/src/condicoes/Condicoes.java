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
        int i = 2022 - nasc;
        
        if (i < 16) {
            System.out.println("Não vota");
        } else {
            if (i>=16 && i<18 || (i>70)) {
                System.out.println("Voto opcional");
            } else {
                System.out.println("Voto obrigatório");
            }
        }
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
