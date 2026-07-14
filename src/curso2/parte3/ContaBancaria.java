package curso2.parte3;

public class ContaBancaria {
    protected double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor){
        saldo+=valor;
    }
    public void sacar(double valor){
        saldo-=valor;
    }

    public void consultarSaldo(){
        System.out.println("Saldo atual: "+saldo);
    }
}
