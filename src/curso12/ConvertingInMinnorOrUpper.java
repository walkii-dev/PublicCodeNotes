package curso12;

import java.util.Scanner;

public class ConvertingInMinnorOrUpper {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu texto: ");
        String entrada = input.nextLine();

        System.out.println("Texto em maiúsculo: "+entrada.toUpperCase());
        System.out.println("Texto em minúsculo: "+entrada.toLowerCase());
    }
}
