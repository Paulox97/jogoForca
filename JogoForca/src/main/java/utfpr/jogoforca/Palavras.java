package utfpr.jogoforca;

import java.util.Random;




public class Palavras {
    //Biblioteca de palavras do jogo, separado por dificuldade
    Random gerador = new Random();
    
    public String sorteador(int c){
        if (c == 1){
            //Array de palavras
            String palavrasFaceis[] = {"baixo", "caixa", "disco", "foice", "harpa"};
            //Seleciona uma palavra aleatória da biblioteca
            String escolha = palavrasFaceis[gerador.nextInt(0, 4)]; 
            //retorna a palavra
            return escolha;
        }
        else if (c == 2){
            //Array de palavras
            String palavrasMedias[] = {"abafador", "baioneta", "carretel", "fantasia", "molinete"};
            //Seleciona uma palavra aleatória da biblioteca
            String escolha = palavrasMedias[gerador.nextInt(0, 4)];
            //retorna a palavra
            return escolha;   
        }
        else {
            //Array de palavras
            String palavrasDificil[] = {"coqueteleira", "guarda-chuva", "metralhadora", "tornozeleira", "fita-isolante"};
            //Seleciona uma palavra aleatória da biblioteca
            String escolha = palavrasDificil[gerador.nextInt(0, 4)];
            //retorna a palavra
            return escolha;
        }
    }
}
