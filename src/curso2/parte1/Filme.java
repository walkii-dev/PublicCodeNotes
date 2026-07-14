package curso2.parte1;

public class Filme {
    private String nome;
    private int anoLancamento;
    private int duracaoMinutos;
    private boolean incluidoNoPlano;
    private double somaAvaliacoes;
    private int totalAvaliacoes;

    public String exibeFichaTecnica() {
        return "Filme: " + nome +"\n"+
                "Ano de Lançamento: " + anoLancamento +"\n"+
                "Duração em Minutos: " + duracaoMinutos +"\n"+
                "Incluso no plano? " + incluidoNoPlano +"\n"+
                "Soma das avaliações: " + somaAvaliacoes +"\n"+
                "Total de avaliações: " + totalAvaliacoes;
    }

    public void avalia(double nota){    //aqui não deveria ser o filme , mas sim uma nota.
        somaAvaliacoes += nota;
        totalAvaliacoes++;
    }

    public double pegaMedia(){
        return somaAvaliacoes / totalAvaliacoes;
    }
}
