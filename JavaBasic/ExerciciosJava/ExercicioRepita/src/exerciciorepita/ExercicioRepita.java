/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciorepita;

import javax.swing.JOptionPane;
/**
 *
 * @author paulo
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, s=0;
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "<html> Informe um número: <br><em>(valor 0 finaliza.)</br></em> </html>"));
            
            s+=n;
        }while (n != 0);
        JOptionPane.showMessageDialog(null, "<html>Resultado final <hr>" + 
                "<br>Somatório vale " + s + "</html>");
        
    }
    
}
