package curso12;

import java.util.Scanner;

public class VerifyWordOnText {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o texto: ");
        String texto = input.nextLine();
        System.out.println("Digite a palavra do texto que deseja verificar: ");
        String frase = input.nextLine();

        if (texto.contains(frase)){
            System.out.printf("A palavra \"%s\" está presente no texto.",frase);
        } else {
            System.out.printf("A palavra \"%s\" não está presente no texto.",frase);
        }
    }
}
