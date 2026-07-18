package curso10;

public class DocenteEscola extends Pessoa{
    private String disciplina;

    public DocenteEscola(String nome, int idade, String disciplina) {
        super(nome, idade);
        this.disciplina = disciplina;
    }

    @Override
    public void exibirDados(){
        System.out.printf("Pessoa %s - Idade : %d - Disciplina: %s %n",nome,idade,disciplina);
    }
}
