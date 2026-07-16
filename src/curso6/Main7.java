package curso6;

import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor do emprestimo: ");
        int valorEmprestimo = input.nextInt();

        if (valorEmprestimo > 1000 && valorEmprestimo < 5000) {
            System.out.println("Valor "+valorEmprestimo+" válido para empréstimo");
        } else {
            System.out.println("Valor "+valorEmprestimo+" inválido para empréstimo");
        }

    }
}
