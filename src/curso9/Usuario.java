package curso9;

public class Usuario {
    private String senha;

    public Usuario(String senha) {
        this.senha = senha;
    }

    public void setSenha(String senhaAnterior, String senha) {
        if (senhaAnterior.equals(this.senha)) {
            this.senha = senha;
            System.out.println("Senha Alterada com sucesso!");
        } else{
            System.out.println("não foi possível alterar a senha.");
        }
    }

    public static void main(String[] args) {
        Usuario user = new Usuario("bolas");
        user.setSenha("bolas","boladas");

        Usuario user2 = new Usuario("careta");
        user2.setSenha("carola","carreta");
    }
}
