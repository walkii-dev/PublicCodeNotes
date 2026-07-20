package curso13;

import java.util.List;

public class SelectingShortNames {
    public static void main(String[] args) {
        List<String> funcionarios = List.of("Ana", "Bruno", "Carlos", "Amanda", "Alice", "Daniel", "Caroline");

        List<String> nomesCurtos = funcionarios.stream().filter(f -> f.length() <= 5).toList();
        System.out.println(nomesCurtos);
    }

}
