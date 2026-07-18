package curso8;

public class Pedido {
    String nome;
    int diasAtraso;

    void exibirInfo(){
        System.out.println("Título: "+nome);
        double valorAtraso = 2.50 * diasAtraso;
        System.out.printf("Valor do atraso: R$ %.2f",valorAtraso);
    }

    public static void main(String[] args) {
        Pedido p1 = new Pedido();
        p1.nome = "Dom Casmurro";
        p1.diasAtraso = 4;

        p1.exibirInfo();
    }
}
