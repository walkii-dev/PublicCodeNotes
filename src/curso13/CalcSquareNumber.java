package curso13;

import java.util.List;

public class CalcSquareNumber {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(2, 3, 5, 7, 11);

        List<Integer> quadradoNumeros = numeros.stream().map(n-> n*n).toList();
        System.out.println(quadradoNumeros);
    }
}
