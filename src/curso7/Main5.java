package curso7;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a lista de números entre espaços: ");
        String lista = input.nextLine(); //next e nextLine são diferentes.
        input.close();

        String[] novaLista = lista.split(" ");

        int maiorValor = 0;

        for (String s : novaLista) {
            if (Integer.parseInt(s) > maiorValor) {
                maiorValor = Integer.parseInt(s);
            }
        }

        System.out.println("Maior valor: "+maiorValor);
    }
}
