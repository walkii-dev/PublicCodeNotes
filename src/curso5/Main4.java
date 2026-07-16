package curso5;

public class Main4 {
    public static void main(String[] args) {
        String titulo ="a";
        String autor = "a";
        int numPaginas = 12;
        double precoLivro = 12.90;
        char categoria = 'T';

        System.out.printf("""
                           Livro Cadastrado: %s , de %s.
                           Ele possui %d páginas, custando R$ %f
                           """,titulo,autor,numPaginas,precoLivro);

        if (categoria == 'F'){
            System.out.print("e pertence a categoria Ficção.");
        }if (categoria == 'N'){
            System.out.print("e pertence a categoria Não-Ficção.");
        }if (categoria == 'T'){
            System.out.print("e pertence a categoria Tecnologia.");
        }if (categoria == 'H'){
            System.out.print("e pertence a categoria História.");
        }
    }
}
