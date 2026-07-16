package curso6;

import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o código de acesso:");
        int codigoAcesso = input.nextInt();

        System.out.println("Digite seu nível de Acesso:");
        int nivelAcesso = input.nextInt();

        input.close();

        if (codigoAcesso == 2023 &&
            nivelAcesso == 1 || nivelAcesso == 2 || nivelAcesso ==3) {
            System.out.println("acesso liberado!");
        } else {
            System.out.println("Acesso negado!");
        }
    }
}
