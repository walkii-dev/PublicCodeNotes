package curso2.parte3;

public class VerificadorPrimo extends NumerosPrimos {
    public void verificarSeEPrimo(int num){
        if (verificarPrimalidade(num)){
            System.out.println("o número "+num+" é primo.");
        } else {
            System.out.println("o número "+num+" não é primo.");
        }
    }
}
