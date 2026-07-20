package curso12;

import java.util.Scanner;

public class RemovingArchiveExtension {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o nome do arquivo: ");
        String filename = input.nextLine();
        System.out.println("Arquivo sem a extensão: "+filename
                .substring(0, filename.indexOf(".")));

    }
}
