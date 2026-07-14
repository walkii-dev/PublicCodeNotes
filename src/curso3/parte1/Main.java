package curso3.parte1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("A",1);
        Pessoa p2 = new Pessoa("B",2);
        Pessoa p3 = new Pessoa("C",3);

        List<Pessoa> listaDePessoas = new ArrayList<Pessoa>();
        listaDePessoas.add(p1);
        listaDePessoas.add(p2);
        listaDePessoas.add(p3);
        System.out.println("Tamanho da lista: "+listaDePessoas.size());
        System.out.println(listaDePessoas.get(0).toString());
        System.out.println(listaDePessoas);
    }
}
