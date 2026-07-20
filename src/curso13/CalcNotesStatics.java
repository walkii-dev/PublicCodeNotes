package curso13;

import java.util.List;

public class CalcNotesStatics {
    public static void main(String[] args) {
        List<Double> notas = List.of(7.5, 8.0, 6.5, 9.0, 10.0);
        double somaTotal = notas.stream().reduce(0.0,Double::sum);
        System.out.println("Soma total das notas: "+somaTotal);
        double mediaNotas = somaTotal / notas.size();
        System.out.println("Média das notas: "+mediaNotas);
        double maiorNota = notas.stream().reduce(0.0,Double::max);
        double menorNota = notas.stream().reduce(notas.getFirst(),Double::min);

        System.out.println("Menor nota: "+menorNota);
        System.out.println("Maior nota: "+maiorNota);
    }
}
