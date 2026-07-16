package curso6;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor da compra: ");
        double valorCompra = input.nextDouble();

        if (valorCompra >= 100){
            valorCompra = valorCompra - (valorCompra / 10);
            System.out.println("Desconto de 10% Aplicado.\n Novo Valor: R$ "+valorCompra);
        } else {
            System.out.println("Nenhum desconto aplicado.\n Valor da Compra: R$ "+valorCompra);
        }
    }
}
