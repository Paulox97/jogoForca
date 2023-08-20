
package utfpr.jogoforca;

import java.util.Scanner;


public class Dificuldade {
    
    Scanner ler = new Scanner(System.in);
    int dificuldade;
    
    public int escolhaDificuldade(){
        System.out.println("---------------------------------------");
        System.out.println("         ESCOLHA DA DIFICULDADE");
        System.out.println("---------------------------------------");
        System.out.println("1 - FÁCIL \n"
                + "2 - MÉDIO \n"
                + "3 - DIFÍCIL \n");
        dificuldade = ler.nextInt();
        while (dificuldade != 1 && dificuldade != 2 && dificuldade != 3){
            System.out.println("\n------------------------------------------");
            System.out.println("!! ESCOLHA INVÁLIDA, DIGITE NOVAMENTE !!");
            System.out.println("------------------------------------------");
            System.out.println("1 - FÁCIL \n"
                + "2 - MÉDIO \n"
                + "3 - DIFÍCIL \n");
            dificuldade = ler.nextInt();
        }
        return dificuldade;
    }
   
}
