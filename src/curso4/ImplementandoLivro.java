package curso4;

import com.google.gson.Gson;

public class ImplementandoLivro {
    public static void main(String[] args) {
        Gson gson = new Gson();
        String livro = "{\"titulo\":\"Harry Potter\",\"autor\":\"J.K. Rowling\",\"editora\":{\"nome\":\"Rocco\",\"anoInicio\":1997}}";
        Livro livroConv = gson.fromJson(livro,Livro.class);
        System.out.println(livroConv);
    }
}
