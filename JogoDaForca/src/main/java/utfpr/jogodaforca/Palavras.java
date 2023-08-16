package utfpr.jogodaforca;

import java.util.Random;




public class Palavras {
    Random gerador = new Random();
    
    String palavrasMedias[] = {"abafador", "baioneta", "carretel", "fantasia", "molinete"};
    String palavrasDificil[] = {"coqueteleira", "guarda-chuva", "metralhadora", "tornozeleira", "fita isolante"};
    
    public void sorteadorFacil(){
        String palavrasFaceis[] = {"baixo", "caixa", "disco", "foice", "harpa"};
        System.out.println(gerador.nextInt(0, 4));
    }
}
