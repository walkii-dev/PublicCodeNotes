package curso6;

import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o dia da semana: ");
        String dSemana = input.next();
        input.close();
        if (dSemana.toLowerCase().equals("sábado") || dSemana.toLowerCase().equals("domingo")){
            System.out.println(dSemana + "não é um dia útil.");
        } else {
            System.out.println(dSemana + "é um dia útil.");
        }
    }
}
