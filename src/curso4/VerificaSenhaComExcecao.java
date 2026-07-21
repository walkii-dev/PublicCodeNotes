package curso4;

import java.util.Scanner;

public class VerificaSenhaComExcecao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira a senha:");
        String senha = input.nextLine();
        try{
            if (senha.length()<8){
                throw new SenhaInvalidaException("senha tem que ter mais de 8 caracteres");
            }
        } catch (SenhaInvalidaException e) {
            System.out.println("não pode, tá ouvindo?");
            e.printStackTrace();
        }

    }
}
