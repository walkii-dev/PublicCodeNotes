package curso12;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePasswords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a senha: ");
        String senha = input.nextLine();

        String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\\\d)(?=.*[@$!%*?&])[A-Za-z\\\\d@$!%*?&]{8,}$";

        Pattern pattern = Pattern.compile(regex);

        if (senha.matches(regex)) {
            System.out.println("A senha é válida.");
        } else {
            System.out.println("A senha não é válida.");
        }

    }
}
