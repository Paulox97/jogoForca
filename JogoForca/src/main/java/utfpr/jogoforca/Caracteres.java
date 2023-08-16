
package utfpr.jogoforca;


public class Caracteres {
    
    public char[] conversorCaracteres(String palavra){
        char[] tracos = palavra.toCharArray();
        
        for (char c : tracos) {
            System.out.print("_ ");
        }
        return tracos;
    }
    
    public StringBuilder acertoDeCaracteres(String palavra, char d){
        char[] espacos = palavra.toCharArray();
        
        StringBuilder palavraEscondida = new StringBuilder();

      
        
            for (int c = 0; c < palavra.length(); c++) {
                palavraEscondida.append("_");
                if (d == espacos[c]) {
                    palavraEscondida.setCharAt(c, espacos [c]);
                    
                }
            }
            return palavraEscondida;
        }
}

