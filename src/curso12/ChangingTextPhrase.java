package curso12;

import java.util.Scanner;

public class ChangingTextPhrase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu texto completo: ");
        String textoCompleto = input.nextLine();

        System.out.println("Informe o trecho que gostaria de substituir: ");
        String textoParaRemover = input.nextLine();

        if (textoCompleto.contains(textoParaRemover)){
            System.out.println("Informe o novo texto:");
            String novoTexto = input.nextLine();
            System.out.println("Novo texto atualizado: "+textoCompleto.replace(textoParaRemover,novoTexto));
        } else {
            System.out.println("O trecho informado não está no texto.");
        }
        input.close();
    }
}
