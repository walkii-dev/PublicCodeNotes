package curso1.parte3;

import java.util.Scanner;

public class FatorialDeNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número:");
        int num = sc.nextInt();
        System.out.println("Fatorial de "+num+": "+fatorial(num));
    }

    public static int fatorial(int num){
        if (num <=1){
            return 1;
        }
        return num * fatorial(num - 1);
    }
}
