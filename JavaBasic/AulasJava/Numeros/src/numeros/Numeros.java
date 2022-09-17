/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numeros;

import java.util.Scanner;

/**
 *
 * @author paulo
 */
public class Numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int n, s=0;
        String resp;
        Scanner tec = new Scanner(System.in);
        do {
            System.out.print("Digite um número de um a cinco: ");
            n = tec.nextInt();
            s += n; // s = s + n;
            System.out.print("Quer continuar? [S/N] ");
            resp = tec.next();
            
        } while (resp.equals("S"));
        System.out.println("A soma de todos os valores é " + s);
        
    }
    
}
