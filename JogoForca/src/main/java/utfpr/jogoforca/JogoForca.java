package utfpr.jogoforca;

import java.util.HashSet;
import java.util.Set;


public class JogoForca {
  

    public static void main(String[] args) {
        //Instancias
        Palavras palavra = new Palavras();
        Dificuldade dificuldade = new Dificuldade();
        LetrasJogador letraEscolhida = new LetrasJogador();
        Caracteres caracteres = new Caracteres();
        StringBuilder palavraEscondida = new StringBuilder();
        
        int escolhaJogador;
        String aux;
        char letra;
        
        
        
        
        escolhaJogador = dificuldade.escolhaDificuldade();
        
        System.out.println("---------------------------------------");
        System.out.println("           INICIANDO O JOGO");
        System.out.println("---------------------------------------");
        
        aux = palavra.sorteador(escolhaJogador);
        
        System.out.println(aux);
        
        caracteres.conversorCaracteres(aux);
        
        boolean palavraDescoberta = false;
        
        while (palavraDescoberta == false){
            letra = letraEscolhida.LetraEscolhida();
            
            //caracteres.acertoDeCaracteres(aux, letra);
            System.out.println(palavraEscondida.append(caracteres.acertoDeCaracteres(aux, letra)));
        }
        
// Metodo para salvar a letra digitada
//Set<Character> letrasDigitadas = new HashSet<>();
        
        
       
           
    }
}
