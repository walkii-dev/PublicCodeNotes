package curso9;

public class ContaDigital {
    private String titular;
    private double saldo;

    public ContaDigital(String titular) {
        this.titular = titular;
        this.saldo = 0;
    }

    public void depositar(double valor){
        if (valor < 0){
            System.out.println("Valor inválido.");
        } else {
            saldo += valor;
        }
    }

    public void sacar(double valor){
        if (valor < 0) {
            System.out.println("Valor inválido.");
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente para saque.");
        } else{
            saldo -= valor;
        }
    }

    public void exibirSaldo(){
        System.out.printf("Saldo atual da conta de %s : R$ %.2f%n",titular,saldo);
    }

    public static void main(String[] args) {
        ContaDigital conta1 = new ContaDigital("Lucas");
        ContaDigital conta2 = new ContaDigital("Ellen");

        conta1.depositar(2900);
        conta2.depositar(5500);

        conta1.sacar(4000);
        conta2.sacar(4000);

        conta1.exibirSaldo();
        conta2.exibirSaldo();

    }
}
