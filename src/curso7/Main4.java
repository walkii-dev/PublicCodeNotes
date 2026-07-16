package curso7;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("digite um número: ");
        int num = input.nextInt();
        input.close();
        int fatorial = 1;
        for (int i = num; i > 0; i--){
            fatorial*=i;
        }
        System.out.println("Fatorial: "+fatorial);
    }
}
