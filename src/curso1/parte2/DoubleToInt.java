package curso1.parte2;

public class DoubleToInt {
    public static void main(String[] args) {
        double num1 = 9.0;
        int num2 = (int) num1;
        System.out.println(num2);
        //casting implícito (dado maior para dado menor; precisa definir o tipo entre () para aceitar)

        int num3 = 9;
        double num4 = num3;
        System.out.println(num4);
        //casting explícito (dado menor para dado maior na memória; feito automaticamente)



    }
}
