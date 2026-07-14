package curso2.parte2;

public class FilmeAtt {
    private String nome;
    private int anoLancamento;
    private int duracaoMinutos;
    private boolean incluidoNoPlano;
    private double somaAvaliacoes;
    private int totalAvaliacoes;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public double getSomaAvaliacoes() {
        return somaAvaliacoes;
    }

    public void setSomaAvaliacoes(double somaAvaliacoes) {
        this.somaAvaliacoes = somaAvaliacoes;
    }

    public int getTotalAvaliacoes() {
        return totalAvaliacoes;
    }

    public void setTotalAvaliacoes(int totalAvaliacoes) {
        this.totalAvaliacoes = totalAvaliacoes;
    }

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
