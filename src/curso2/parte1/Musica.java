package curso2.parte1;

public class Musica {
    private String nome;
    private String artista; //poderia ser uma entidade
    private int anoLancamento;
    private double avaliacao;
    private int numAvaliacoes;


    public void fichaTecnica() {
        System.out.println("Música: " + nome + "\n" +
                "Artista: " + artista + "\n" +
                "Ano de Lançamento: " + anoLancamento +"\n"+
                "Avaliação: " + avaliacao +"\n"+
                "Total de Avaliações: " + numAvaliacoes +"\n");
    }

    public void avalia(double nota){
        avaliacao+=nota;
        numAvaliacoes++;
    }

    public double pegaMedia(){
        return avaliacao/numAvaliacoes;
    }
}
