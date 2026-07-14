package curso1.parte2;

public class ValorDesconto {
    public static void main(String[] args) {
        double precoOriginal = 32.20;
        double percentualDesconto = 12;
        double novoPreco = precoOriginal - (precoOriginal/percentualDesconto);
        System.out.println("valor com desconto: "+novoPreco);

    }
}
