package curso1.parte3;

import java.util.Scanner;

public class UmMaiorQueOutro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1;
        int num2;

        System.out.println("primeiro número:");
        num1 = sc.nextInt();
        System.out.println("segundo número:");
        num2 = sc.nextInt();

        if (num1 == num2){
            System.out.println("números iguais.");
        } else {
            System.out.println("números diferentes.");
        }

        if (num1 > num2) {
            System.out.println(num1+" é maior que "+num2);
        } else if (num2 > num1) {
            System.out.println(num2+" é maior que "+num1);
        }

    }
}
