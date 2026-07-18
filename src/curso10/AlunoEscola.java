package curso10;

public class AlunoEscola extends Pessoa{
    private double notaFinal;

    public AlunoEscola (String nome, int idade, double notaFinal){
        super(nome,idade);
        this.notaFinal = notaFinal;
    }

    @Override
    public void exibirDados(){
        System.out.printf("Pessoa %s - Idade : %d - Nota final: %.2f %n",nome,idade,notaFinal);
    }
}
