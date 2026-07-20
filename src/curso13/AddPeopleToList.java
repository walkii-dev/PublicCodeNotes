package curso13;


import java.util.LinkedList;
import java.util.List;

public class AddPeopleToList {
    public static void main(String[] args) {
        List<String> funcionarios = new LinkedList<>();
        funcionarios.add("João");
        funcionarios.add("Maria");
        funcionarios.add("Vitor");
        funcionarios.add("Ana");
        System.out.println(funcionarios);

    }
}
