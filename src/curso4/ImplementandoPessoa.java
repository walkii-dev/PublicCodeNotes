package curso4;

import com.google.gson.Gson;

public class ImplementandoPessoa {
    public static void main(String[] args) {
        Gson gson = new Gson();
        String pessoaJson = "{\"nome\":\"Lucas\",\"idade\":26,\"cidade\":\"Maricá\",\"Bairro\":\"Itaipuaçu\"}";
        Pessoa pessoa = gson.fromJson(pessoaJson,Pessoa.class);
        System.out.println(pessoa);

    }
}
