package tiposprimitivos;

import java.util.Scanner;

public class TiposPrimitivos {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Olá, poderia informar seu nome de Usuario.");
        String nome = teclado.nextLine();
        System.out.println("Olá, obrigado pela visita, qual seria o seu salario?");
        float nota = teclado.nextFloat();
        System.out.format("Olá %s, Então seu salario é %.2f certo ? \n", nome, nota);
        
    }
    
}
