package curso12;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VerifyCPF {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o CPF: ");
        String cpf = input.nextLine();

        String regex = "^\\d{3}.\\d{3}.\\d{3}-\\d{2}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(cpf);

        if (matcher.find()){
            System.out.printf("O CPF %s está no formato válido.",matcher.group());
        } else {
            System.out.printf("O CPF %s está no formato válido.",cpf);
        }
    }
}
