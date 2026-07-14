package curso2.parte3;

public class GeradorPrimo extends NumerosPrimos{

    public void gerarProximoPrimo(int num){
        int numAlt = num + 1;
        while(!verificarPrimalidade(numAlt)){
            verificarPrimalidade(numAlt);
            if (verificarPrimalidade(num)){
                System.out.println(num);
                break;
            }
            numAlt++;
        }
    }
}
