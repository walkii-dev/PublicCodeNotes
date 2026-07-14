package curso1.parte2;
import java.util.Scanner;
public class ConversorTemperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int celsius;
        celsius = sc. nextInt();
        double farenheit = (celsius * 1.8) + 32;
        System.out.println("A temperatura de "+celsius+"ºC para Farenheit é "+farenheit+"ºF.");

    }
}
