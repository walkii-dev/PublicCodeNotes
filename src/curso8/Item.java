package curso8;

public class Item {
    String nome;
    int quantidade;

    void verificarSaldo(){
        System.out.printf("Saldo atual de %s : %d unidades.",nome,quantidade);
    }

    void vender( int quantidadeVenda){

        if (quantidadeVenda > quantidade) {
            System.out.println("Estoque insuficiente.");
            return;
        }
        quantidade-=quantidadeVenda;
        System.out.println("Venda feita! Resta "+quantidade);
    }

    public static void main(String[] args) {
        Item i1 = new Item();
        i1.nome = "arroz";
        i1.quantidade = 13;

        i1.vender(4);
        i1.vender(6);
        i1.vender(4);
    }
}
