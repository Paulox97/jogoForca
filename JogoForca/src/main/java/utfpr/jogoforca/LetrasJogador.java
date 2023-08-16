
package utfpr.jogoforca;

import java.util.Scanner;


public class LetrasJogador {
    
    Scanner ler = new Scanner(System.in);
    
    public char LetraEscolhida(){
        
        System.out.println("\nInforme uma letra: ");
        String letraUsuario = ler.next();
        while (letraUsuario.length() > 1){
            System.out.println("Você digitou mais de uma letra, por gentileza digite somente uma letra: ");
            letraUsuario = ler.next();
        }
        char primeiraLetra = letraUsuario.charAt(0);
        
        return primeiraLetra;
    }
    
}
