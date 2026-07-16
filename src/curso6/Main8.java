package curso6;

import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro lado: ");
        int lado1 = input.nextInt();
        System.out.println("Digite o segundo lado: ");
        int lado2 = input.nextInt();
        System.out.println("Digite o terceiro lado: ");
        int lado3 = input.nextInt();
        input.close();

        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado3 + lado2 > lado1 ) {
            System.out.println("pode ser sim um triangulo");
        } else {
            System.out.println("nao pode ser um triangulo.");
        }
    }
}
