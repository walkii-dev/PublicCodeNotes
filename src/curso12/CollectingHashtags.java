package curso12;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CollectingHashtags {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o texto da sua rede social: ");
        String texto = input.nextLine();
        input.close();

        Pattern pattern = Pattern.compile("#\\w+\\p{L}+");
        Matcher matcher = pattern.matcher(texto);

        StringBuilder encontros = new StringBuilder();
        while (matcher.find()){
            encontros.append(matcher.group()).append(",");
        }
        System.out.println(encontros.deleteCharAt(encontros.length() - 1));
    }
}
