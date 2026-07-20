package curso13;

import java.util.List;

public class CalcTax {
    public static void main(String[] args) {
        List<Double> precosProdutos = List.of(29.99, 49.50, 15.75, 99.99);

        double totalGasto = precosProdutos.stream().reduce(0.0,Double::sum);
        System.out.println("valor total antes do imposto: "+totalGasto);
        totalGasto += totalGasto*0.08;
        System.out.printf("Valor total após o imposto de 8: %.2f",totalGasto);
    }
}
