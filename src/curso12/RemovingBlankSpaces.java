package curso12;

import java.util.Scanner;

public class RemovingBlankSpaces {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um nome: ");
        String entrada = input.nextLine();
        System.out.println(entrada.trim());
        input.close();
    }
}
