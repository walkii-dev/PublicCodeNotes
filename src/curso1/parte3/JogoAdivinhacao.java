package curso1.parte3;
import java.util.Random;
import java.util.Scanner;
public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tentativas = 5;
        int numeroSecreto = new Random().nextInt(100);
        while(tentativas != 0){
            System.out.print("Digite um número para chutar: ");
            int chute = sc.nextInt();
            if (chute < numeroSecreto){
                System.out.println("Errou, o número secreto é maior que o seu chute! tenta de novo!");
                tentativas--;
                System.out.println("tentativas: "+tentativas);
            } else if (chute > numeroSecreto) {
                System.out.println("Errou, o número secreto é menor que o seu chute! tenta de novo!");
                tentativas--;
                System.out.println("tentativas: "+tentativas);
            } else {
                System.out.println("parabéns! esse é o número!");
                break;
            }
        }


    }

}
