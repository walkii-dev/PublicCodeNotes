package curso7;

import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String entrada = "";
        int positivos = 0;
        int negativos = 0;
        while (!entrada.equalsIgnoreCase("fim")){

            System.out.println("Digite um número ou \"fim\" para sair:");
            entrada = input.nextLine();

            if (entrada.equalsIgnoreCase("fim")){
                break;
            }
            if (Integer.parseInt(entrada) > 0){
                positivos++;
            } else if (Integer.parseInt(entrada) < 0) {
                negativos++;
            }

        }
        System.out.println("Números positivos: "+positivos);
        System.out.println("Números negativos: "+negativos);
        input.close();
    }
}
