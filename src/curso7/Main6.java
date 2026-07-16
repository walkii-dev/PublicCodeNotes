package curso7;

import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tentativas = 3;
        int senhaSecreta = 1432;
        int chute = 0;

        while(chute != senhaSecreta){
            System.out.println("digite seu chute (Tentativas restantes:"+tentativas+"):");
            chute = input.nextInt();

            if (chute == senhaSecreta){
                System.out.println("Senha correta!");
                break;
            } else {
                tentativas--;
                if (tentativas == 0){
                    System.out.println("não dá mais.");
                    break;
                }
                System.out.println("Errou! Tente novamente");
            }
        }
        input.close();
    }
}
