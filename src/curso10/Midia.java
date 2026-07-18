package curso10;

public class Midia {
    private String titulo;
    private int anoPublicacao;

    public String getTitulo() {
        return titulo;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public Midia(String titulo, int anoPublicacao) {
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
    }
    public String geraCodigo(){
        return "LIB-"+titulo.substring(0,3)+anoPublicacao;
    }

    public void exibirInfo(){
        System.out.printf("Código: %s | Mídia : \"%s\" - Ano de Publicação: %d ",geraCodigo(),titulo,anoPublicacao);
    }

}
