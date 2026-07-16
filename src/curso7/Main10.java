package curso7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {
        List<String> convidados = new LinkedList<>();
        Scanner input = new Scanner(System.in);
        boolean exitCondition = true;

        while (exitCondition) {
            System.out.println("digite um comando. 'sair' para sair.");
            String option = input.nextLine();

            if (option.equals("ver")) {
                System.out.println(convidados);
            } else if (option.equals("sair")) {
                exitCondition = false;
            }

            if (!convidados.isEmpty()) { //lista com algo?
                String optionToAdd = "";

                for (String convidado : convidados) {
                    if(convidado.equalsIgnoreCase(option)){
                        System.out.println("já está na lista.");
                        break;
                    } else {
                        optionToAdd = option;
                    }
                }
                if (!optionToAdd.isEmpty()) {
                    convidados.add(optionToAdd);
                }

            } else {// lista vazia?
                convidados.add(option);
            }
        }
    }
}
