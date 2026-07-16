package curso6;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro: ");
        int num1 = input.nextInt();
        System.out.print("Digite o segundo: ");
        int num2 = input.nextInt();

        if (num1 > num2){
            System.out.println(num1+" é maior que "+num2);
        } else if (num1 == num2) {
            System.out.println("Ambos são iguais.");
        } else {
            System.out.println(num1+" é menor que "+num2);
        }
    }
}
