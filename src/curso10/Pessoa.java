package curso10;

public class Pessoa {
    protected String nome; // dá para simplificar sem precisar usar protected, pegando o getter!
    protected int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void exibirDados(){
        System.out.printf("Pessoa %s - Idade : %d",nome,idade);
    }
}
