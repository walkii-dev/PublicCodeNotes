package curso12;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FormatMoneyType {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("digite o valor monetário: ");
        String valor = input.nextLine();
        input.close();

        String regexDinheiro = "\\d+,\\d+";
        Pattern pattern = Pattern.compile(regexDinheiro);

        Matcher matcher = pattern.matcher(valor);

        if (matcher.find()) {
            System.out.printf("Valor formatado: R$ %.2f %n",
                    Double.parseDouble(
                            matcher.group().replace(",",".")
                    )
            );

        }
    }
}
