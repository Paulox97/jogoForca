
package utfpr.jogoforca;

import java.util.Scanner;


public class LetrasJogador {
    
    Scanner ler = new Scanner(System.in);
    
    public char LetraEscolhida(){
        
        System.out.println("\nINFORME UMA LETRA: ");
        String letraUsuario = ler.next();
        while (letraUsuario.length() > 1){
            System.out.println("VOCÊ DIGITOU MAIS DE UMA LETRA, POR GENTILEZA DIGITE SOMENTE UMA: ");
            letraUsuario = ler.next();
        }
        char primeiraLetra = letraUsuario.charAt(0);
        return primeiraLetra;
    }
    
}
