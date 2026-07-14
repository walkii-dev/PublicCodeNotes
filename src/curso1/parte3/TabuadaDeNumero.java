package curso1.parte3;

import java.util.Scanner;

public class TabuadaDeNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número para tabuada:");
        int numeroTabuada = sc.nextInt();
        System.out.println("1 x "+numeroTabuada+" = "+numeroTabuada * 1);
        System.out.println("2 x "+numeroTabuada+" = "+numeroTabuada * 2);
        System.out.println("3 x "+numeroTabuada+" = "+numeroTabuada * 3);
        System.out.println("4 x "+numeroTabuada+" = "+numeroTabuada * 4);
        System.out.println("5 x "+numeroTabuada+" = "+numeroTabuada * 5);
        System.out.println("6 x "+numeroTabuada+" = "+numeroTabuada * 6);
        System.out.println("7 x "+numeroTabuada+" = "+numeroTabuada * 7);
        System.out.println("8 x "+numeroTabuada+" = "+numeroTabuada * 8);
        System.out.println("9 x "+numeroTabuada+" = "+numeroTabuada * 9);
        System.out.println("10 x "+numeroTabuada+" = "+numeroTabuada * 10);
    }
}
