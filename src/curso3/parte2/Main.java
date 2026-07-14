package curso3.parte2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto("A", 1.0,1);
        Produto p2 = new Produto("B", 2.0,2);
        Produto p3 = new Produto("C", 3.0,3);

        List<Produto> listaDeProdutos = new ArrayList<>();
        listaDeProdutos.add(p1);
        listaDeProdutos.add(p2);
        listaDeProdutos.add(p3);
        listaDeProdutos.add(new Produto("D",4.0,4));
        System.out.println("Tamanho: "+listaDeProdutos.size());
        System.out.println(listaDeProdutos.get(2));

        ProdutoPerecivel pp1 = new ProdutoPerecivel("E",5.0,5,"01/01/2001");
    }
}
