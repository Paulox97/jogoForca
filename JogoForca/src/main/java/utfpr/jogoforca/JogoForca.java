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
        StringBuilder palavraAux = new StringBuilder();
        StringBuilder palavraEscolhida = new StringBuilder();
        Set<Character> letrasDigitadas = new HashSet<>();
        
        int escolhaJogador;
        int vidaJogador = 6;
        String aux;
        char letra;
        
        
        
        
        
        
        escolhaJogador = dificuldade.escolhaDificuldade();
        
        System.out.println("---------------------------------------");
        System.out.println("           INICIANDO O JOGO");
        System.out.println("---------------------------------------");
        
        aux = palavra.sorteador(escolhaJogador);
        
        System.out.println(aux);
        
        palavraEscolhida = caracteres.conversorCaracteres(aux);
        
        boolean palavraDescoberta = false;
        
                
        while (palavraDescoberta == false){
            letra = letraEscolhida.LetraEscolhida();

            if(letrasDigitadas.contains(letra)){ //verifica se a letra digitada já foi digitada antes
                System.out.println("Letra já digitada");
                
                continue;
            }
            

            letrasDigitadas.add(letra); //adiciona a letra digitada ao histórico de letras
            
            //Dar um jeito de fazer essa vida funcionar;

            
            palavraEscolhida = caracteres.acertoDeCaracteres(aux, palavraEscolhida, letra);
            
            int cont = 0; //Inicio do contador que irá auxiliar se o usuário acertou alguma letra
            for (int c = 0; c < aux.length(); c++){
                if (letra != aux.charAt(c)){
                    cont++; //Aqui pego o valor de quantas vezes a letra digitada existe dentro da palavra sorteada
                }
                if (cont == aux.length()){ //Caso a quantidade do contador for igual ao tamanho da palavra sorteada significa que o usuário errou, então descontamos uma vida
                        vidaJogador--;
                        System.out.println("Você perdeu uma vida \nVida atual: " + vidaJogador);
                }
            }
            
            System.out.println(palavraEscolhida);
            System.out.println("Letras digitadas: " + letrasDigitadas);
        }
//Vida -- feito
//Completar a palavra
//Boneco

    }
}
