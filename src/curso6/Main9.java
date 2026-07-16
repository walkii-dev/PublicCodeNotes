package curso6;

import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("digite a idade: ");
        int idade = input.nextInt();

        System.out.println("digite o peso: ");
        double peso = input.nextDouble();

        input.close();

        if( idade >= 18 && idade <= 65 && peso >50 ){
            System.out.println("pode doar");
        } else {
            System.out.println("não pode.");
        }

    }
}
