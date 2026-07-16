package curso3.parte4;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> listInteiros = Arrays.asList(21,6,98,35,77,2,-33);
        Collections.sort(listInteiros);
        System.out.println(listInteiros);

        List<Titulo> listTitulos = new ArrayList<>();
        listTitulos.add(new Titulo("Inglaterra"));
        listTitulos.add(new Titulo("Chile"));
        listTitulos.add(new Titulo("Brasil"));
        Collections.sort(listTitulos);
        System.out.println(listTitulos);

        List<String> otherList = new ArrayList<>();
        otherList.add("b");
        otherList = new LinkedList<>();
        otherList.add("a");
        System.out.println(otherList);

    }
}
