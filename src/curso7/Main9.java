package curso7;

import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = input.nextInt();

        for(int i=1; i <= numero; i++){
            if(!(i % 10 == 5)){
                System.out.print(i+" ");
            }
        }
    }
}
