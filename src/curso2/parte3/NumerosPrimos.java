package curso2.parte3;

public class NumerosPrimos {

    public boolean verificarPrimalidade(int num) {
        int divisor = 0;

        if (num == 1) {
            return true;
        } else if (num == 2) {
            return true;
        } else if (num > 2 && num % 2 == 0) {
            return false;
        } else if(num == 0 || num < 0){
            return false;
        } else {
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    divisor++;
                }
            }

            if (divisor > 2) {
                return false;
            } else {
                return true;
            }
        }
    }

    public void listarPrimos(int num){
        for (int i =0;i <= num;i++){
            if(verificarPrimalidade(num)){
                System.out.println(num);
            }
        }

    }
}
