package curso4;

import java.util.Scanner;

public class DivisaoComExcecao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int num1 = input.nextInt();

        System.out.println("Digite o segundo número:");
        int num2 = input.nextInt();

        try{
            int divisao = num1/num2;
            System.out.println(divisao);
        } catch (ArithmeticException e) {
            System.out.println("Não pode!");
        }



    }
}
