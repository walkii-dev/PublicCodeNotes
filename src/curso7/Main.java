package curso7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("digite a quantidade de passos: ");
        int passos = input.nextInt();
        input.close();

        for (int i = 0; i <= passos; i++) {
            System.out.println("subindo o degrau "+i);
        }
        System.out.println("voce chegou ao topo!");
    }
}
