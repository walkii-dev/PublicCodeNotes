package curso10;

public class Revista extends Midia{
    private int edicao;

    public Revista(String titulo, int anoPublicacao, int edicao) {
        super(titulo, anoPublicacao);
        this.edicao = edicao;

    }

    @Override
    public void exibirInfo() {
        System.out.printf("Código: %s | Revista : \"%s\" - Edição: %d %n",geraCodigo(),getTitulo(),edicao);
    }
}
