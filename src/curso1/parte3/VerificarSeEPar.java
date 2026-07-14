package curso1.parte3;

import java.util.Scanner;

public class VerificarSeEPar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número:");
        int num = sc.nextInt();

        if (num % 2 == 0 ){
            System.out.println("é par.");
        } else {
            System.out.println("é impar.");
        }
    }
}
