package curso8;

import java.util.ArrayList;
import java.util.List;

public class ProdutoCarrinho {
    String nome;
    double preco;
    int quantidade;

    double valorTotalDoItem(){
        return preco * quantidade;
    }

    public static void main(String[] args) {
        ProdutoCarrinho prod1 = new ProdutoCarrinho();
        prod1.nome = "mouse";
        prod1.preco = 9.90;
        prod1.quantidade= 1;
        ProdutoCarrinho prod2 = new ProdutoCarrinho();
        prod2.nome = "caixinha de som";
        prod2.preco = 29.90;
        prod2.quantidade = 2;
        ProdutoCarrinho prod3 = new ProdutoCarrinho();
        prod3.nome = "monitor";
        prod3.preco = 119.90;
        prod3.quantidade = 3;

        List<ProdutoCarrinho> lista = new ArrayList<>();
        lista.add(prod1);
        lista.add(prod2);
        lista.add(prod3);
        double valorTotal = 0;

        for (ProdutoCarrinho prod :lista){
            valorTotal+=prod.valorTotalDoItem();
        }


        System.out.printf("valor total da compra: R$ %.2f",valorTotal);
    }
}
