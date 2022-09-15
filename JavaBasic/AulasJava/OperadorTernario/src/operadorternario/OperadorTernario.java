/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadorternario;

/**
 *
 * @author paulo
 */
public class OperadorTernario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1, n2, r;
        n1 = 14;
        n2 = 8;
        //se o n1 for maior que o n2 === n1 recebe o primeiro valor antes do : , senão recebe o outro valor;
        r = (n1>n2)?n1+n2:n1-n2;
        System.out.println(r);
    }
    
}
