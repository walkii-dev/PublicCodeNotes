package curso9;

import java.sql.SQLOutput;
import java.util.Scanner;

public class DadosAcesso {
    private String login;
    private String senha;

    public DadosAcesso(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean validarSenha(String senhaInserida){
        if (senhaInserida.equals(senha)){
            System.out.println("Login feito com sucesso!");
            setSenha(senhaInserida);
            return true;
        } else {
            System.out.println("Senha Incorreta!");
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DadosAcesso acesso = new DadosAcesso("Lucas","1234");

        int tentativas = 3;
        while(tentativas != 0){
            System.out.println("Digite seu login:");
            acesso.setLogin(input.nextLine());
            System.out.println("Agora, digite sua senha");
            if(acesso.validarSenha(input.nextLine())){
                break;
            } else{
                tentativas--;
                System.out.println("Tentativas restantes: "+tentativas);
            }
        }
    }

}
