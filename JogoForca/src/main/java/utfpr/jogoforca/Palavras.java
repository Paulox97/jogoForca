package utfpr.jogoforca;

import java.util.Random;




public class Palavras {
    Random gerador = new Random();
    
    public String sorteador(int c){
        if (c == 1){
            String palavrasFaceis[] = {"baixo", "caixa", "disco", "foice", "harpa"};
            String escolha = palavrasFaceis[gerador.nextInt(0, 4)];
            return escolha;
        }
        else if (c == 2){
            String palavrasMedias[] = {"abafador", "baioneta", "carretel", "fantasia", "molinete"};
            String escolha = palavrasMedias[gerador.nextInt(0, 4)];
            return escolha;   
        }
        else {
            String palavrasDificil[] = {"coqueteleira", "guarda-chuva", "metralhadora", "tornozeleira", "fita-isolante"};
            String escolha = palavrasDificil[gerador.nextInt(0, 4)];
            return escolha;
        }
    }
}
