package curso2.parte4;

public class Livro implements Calculavel{

    private double preco;
    private final double desconto = 0.15;

    @Override
    public double calcularPrecoFinal(double preco) {
        return preco - desconto;
    }
}
