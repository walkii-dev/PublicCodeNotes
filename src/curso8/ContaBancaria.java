package curso8;

public class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public ContaBancaria(){}


    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void zerarSaldo(){
        saldo = 0;
    }

    public void exibirSaldo(){
        System.out.printf("Saldo: R$ %.2f %n",saldo);
    }
}
