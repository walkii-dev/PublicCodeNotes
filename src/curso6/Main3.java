package curso6;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a senha: ");
        String tentativa = sc.nextLine();
        sc.close();

        if (tentativa.equals("123456")) {
            System.out.println("senha correta!");
        } else {
            System.out.println("senha incorreta!");
        }
    }
}
