package curso10;

public class Pagamento {
    private double valor;

    public Pagamento(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void confirmarPagamento(){
        System.out.printf("Pagamento de  R$ %.2f Confirmado! %n",valor);
    }
}
