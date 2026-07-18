package curso10;

public class CartaoCredito extends Pagamento{

    public double taxa;

    public CartaoCredito(double valor) {
        super(valor);
        this.taxa = getValor() * 0.3;
    }

    @Override
    public void confirmarPagamento() {
        System.out.printf("Pagamento de R$ %.2f confirmado no Cartão de Crédito (Taxa: R$ %.2f) %n",getValor() + taxa,taxa);

    }
}
