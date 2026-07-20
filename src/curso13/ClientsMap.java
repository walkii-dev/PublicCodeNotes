package curso13;

import java.util.HashMap;
import java.util.Map;

public class ClientsMap {
    public static void main(String[] args) {
        Map<Integer,String> clientes = new HashMap<>();
        clientes.put(1,"Ana");
        clientes.put(2,"Beatriz");
        clientes.put(3,"Carlos");

        System.out.println("Cliente: "+ clientes.get(2));
    }
}
