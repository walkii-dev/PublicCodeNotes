package curso1.parte4;

import java.util.Scanner;

public class TrabalhoFinal {
    public static void main(String[] args) {
        int opcao = 99;
        double saldo = 0;
        double valor;
        Scanner sc = new Scanner(System.in);
        System.out.println("Saldo atual: $"+saldo);

        while (opcao != 0) {
            String menu = """
                    1. Verificar Saldo
                    2. Receber valor
                    3. Transferir Valor
                    
                    0. Sair
                    """;
            System.out.println(menu);
            System.out.println("Digite um número: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Saldo atual: $"+saldo);
                    break;
                case 2:
                    System.out.println("digite o valor a ser recebido:");
                    valor = sc.nextDouble();

                    if (valor <= 0){
                        System.out.println("Valor insuficiente para recebimento.");
                    } else {
                        saldo += valor;
                        System.out.println("Novo Saldo: $"+saldo);
                    }

                    break;
                case 3:
                    System.out.println("digite o valor a ser transferido a outrem:");
                    valor = sc.nextDouble();

                    if (valor <= 0){
                        System.out.println("Valor insuficiente para transferência.");
                    } else {
                        saldo -= valor;
                        System.out.println("Novo Saldo: $" + saldo);
                    }
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("opção inválida.");

            }
        }
    }
}
