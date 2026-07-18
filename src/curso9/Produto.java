package curso9;

public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco > 0) {
            this.preco = preco;
        } else {
            System.out.println("Preço inválido.");
            this.preco = 0.0;
        }
    }

    void exibirInfo(){
        System.out.println("Nome: "+nome);
        System.out.printf("Preço: %.2f%n",preco);
    }

    public static void main(String[] args) {
        Produto prod = new Produto("Mouse Gamer", 22.90);
        prod.exibirInfo();
        prod.setPreco(-2.80);
        prod.exibirInfo();
    }
}
