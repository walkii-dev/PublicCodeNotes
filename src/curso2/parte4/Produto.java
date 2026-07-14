package curso2.parte4;

public class Produto implements Vendavel{
    @Override
    public double calcularPrecoTotal(double preco, int quantidade, double desconto) {
        return (preco * quantidade) - desconto;
    }
}
