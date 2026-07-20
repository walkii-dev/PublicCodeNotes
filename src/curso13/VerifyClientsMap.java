package curso13;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class VerifyClientsMap {
    public static void main(String[] args) {
        Map<Integer,String> clientes = new HashMap<>();
        Scanner input = new Scanner(System.in);

        clientes.put(1, "Maria");
        clientes.put(2, "Marcos");
        clientes.put(3, "Ana");
        clientes.put(4, "Joana");
        clientes.put(5, "Karen");

        System.out.println("Digite o Id do usuário: ");
        int id = input.nextInt();

        if(clientes.containsKey(id)){
            System.out.printf("O nome do cliente com ID %d é: %s",id,clientes.get(id));
        } else {
            System.out.println("não existe nenhum id nesta lista.");
        }


    }
}
