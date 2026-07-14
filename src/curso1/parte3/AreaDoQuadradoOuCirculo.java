package curso1.parte3;

import java.util.Scanner;

public class AreaDoQuadradoOuCirculo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lado;
        int raio;

        double area;

        System.out.println("""
                Escolha entre: 
                1. Área do quadrado
                2. Área do triângulo
                """);
        int choice = input.nextInt();

        if (choice == 1){
            System.out.println("digite o lado");
            lado = input.nextInt();
            area = lado * lado;
            System.out.println("área do quadrado: "+area);
        } else if (choice == 2) {
            System.out.println("digite o raio");
            raio = input.nextInt();
            area = 3.14 * (raio * raio);
            System.out.println("área do círculo: "+area);
        }

    }
}
