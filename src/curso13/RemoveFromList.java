package curso13;

import java.util.List;

public class RemoveFromList {
    public static void main(String[] args) {
    List<String> nomes = new java.util.ArrayList<>(List.of("Joana", "Lucas", "Pedro", "Antonio"));
        System.out.println(nomes);
        nomes.remove(2);
        System.out.println(nomes);
    }
}
