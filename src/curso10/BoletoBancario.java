package curso10;

public class BoletoBancario extends Pagamento{
    private double taxa;

    public BoletoBancario(double valor) {
        super(valor);
        this.taxa = getValor() * 0.1;
    }

    @Override
    public void confirmarPagamento() {
        System.out.printf("Boleto de R$ %.2f gerado com sucesso (Taxa: R$ %.2f) %n",getValor() + taxa,taxa);
    }
}
