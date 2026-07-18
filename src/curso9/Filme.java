package curso9;

import java.util.ArrayList;
import java.util.List;

public class Filme {
    private String nome;
    private List<Integer> avaliacoes;

    public Filme(String nome) {
        this.nome = nome;
        this.avaliacoes = new ArrayList<>();
    }

    public void adicionarAvaliacao(int nota){
        if (nota > 0 && nota < 6){
            avaliacoes.add(nota);
        }
    }
     public void exibirMedia(){
        double valorTotal = 0;
        for (Integer av :avaliacoes){
            valorTotal += av;
        }
         System.out.println("Média das Avaliações para "+nome+": "+valorTotal/avaliacoes.size());
     }

    public static void main(String[] args) {
        Filme filme1 = new Filme("Borat");
        filme1.adicionarAvaliacao(5);
        filme1.adicionarAvaliacao(4);
        filme1.adicionarAvaliacao(5);
        filme1.adicionarAvaliacao(3);
        filme1.adicionarAvaliacao(4);

        filme1.exibirMedia();

    }
}
