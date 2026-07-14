package curso2.parte4;

public class ProdutoFisico implements Calculavel{
    private double preco;
    private double taxaEntrega;

    @Override
    public double calcularPrecoFinal(double preco) {
        return preco + taxaEntrega;
    }
}
