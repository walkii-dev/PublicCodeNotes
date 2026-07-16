package curso7;

import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome = " ";
        while (nome.length() < 3){
            System.out.println("Digite seu nome: ");
            nome = input.nextLine();
            if (nome.length() >= 3){
                System.out.println("Nome válido!");
                break;
            }
            System.out.println("nome inválido.");
        }
    }
}
