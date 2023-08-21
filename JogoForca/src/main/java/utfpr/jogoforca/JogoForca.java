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
        StringBuilder palavraEscolhida = new StringBuilder();
        Set<Character> letrasDigitadas = new HashSet<>();
        VidaJogador vidaJogador = new VidaJogador();
        
        int escolhaJogador;
        int qtdVidas = 6;
        String aux;
        char letra;
        
        
        escolhaJogador = dificuldade.escolhaDificuldade();
        
        System.out.println("---------------------------------------");
        System.out.println("           INICIANDO O JOGO");
        System.out.println("---------------------------------------");
        
        aux = palavra.sorteador(escolhaJogador).toLowerCase();
        
        System.out.println(aux);
        
        palavraEscolhida = caracteres.conversorCaracteres(aux);
        
        boolean palavraDescoberta = false;
        
                
        while (palavraDescoberta == false){
            letra = Character.toLowerCase(letraEscolhida.LetraEscolhida());

            if(letrasDigitadas.contains(letra)){ //verifica se a letra digitada já foi digitada antes
                System.out.println("Letra já digitada");
                
                continue;
            }
            

            letrasDigitadas.add(letra); //adiciona a letra digitada ao histórico de letras

            
            palavraEscolhida = caracteres.acertoDeCaracteres(aux, palavraEscolhida, letra);
            
            qtdVidas = vidaJogador.vidasDoJogador(aux, letra, qtdVidas);
            
            if (qtdVidas == 0){
                System.out.println("QUE PENA, VOCÊ PERDEU O JOGO");
                //System.out.println("-------------------------------------------------");
                //System.out.println("GOSTARIA DE JOGAR NOVAMENTE?");
                
                break;
            }
            
            System.out.println("-------------------------------------------------");
            System.out.println(palavraEscolhida);
            System.out.println("-------------------------------------------------");
            System.out.println("LETRAS DIGITADAS: " + letrasDigitadas);
            
            if (palavraEscolhida.toString().equals(aux)){
                System.out.println("-------------------------------------------------");
                System.out.println("PARABÉNS VOCÊ VENCEU O JOGO!");
                break;
            }
        }
//Vida -- feito
//Completar a palavra -- feito
//Boneco -- feito

    }
}
