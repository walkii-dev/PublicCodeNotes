package curso10;

public class Ebook extends Midia{

    private String formato;

    public Ebook(String titulo, int anoPublicacao, String formato) {
        super(titulo, anoPublicacao);
        this.formato = formato;
    }

    @Override
    public void exibirInfo() {
        System.out.printf("Código: %s | Ebook : \"%s\" - Formato: %s %n ",geraCodigo(),getTitulo(),formato);
    }
}
