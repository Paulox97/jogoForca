
package utfpr.jogoforca;


public class Caracteres {
    
    public StringBuilder conversorCaracteres(String palavra){
        char[] tracos = palavra.toCharArray();
        StringBuilder palavraEscondida = new StringBuilder();
        System.out.println("---------------------------------------");
        System.out.println("     A PALAVRA CONTÉM " + palavra.length() + " CARACTERES");
        System.out.println("---------------------------------------");
        for (char c : tracos) {
            System.out.print("_ ");
            palavraEscondida.append("_");
        }
        System.out.println("");
        return palavraEscondida;
    }
    
    public StringBuilder acertoDeCaracteres(String palavra, StringBuilder palavraEscondida, char d){
        char[] espacos = palavra.toCharArray();

        //System.out.println(palavraEscondida);
            for (int c = 0; c < palavra.length(); c++) {
                    
                if (d == espacos[c]) {
                    palavraEscondida.setCharAt(c, espacos [c]);
                }
            }
            return palavraEscondida;
        }
}

