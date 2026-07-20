package curso12;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VerifyReferenceCode {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o código de referência:");
        String code = input.nextLine();

        String regex = "^\\D{3}-\\w{4}";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(code);

        if (matcher.matches()) {
            System.out.println("Código válido.");
        } else {
            System.out.println("Código inválido.");
        }
    }
}
