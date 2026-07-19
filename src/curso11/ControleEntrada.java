package curso11;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ControleEntrada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

        System.out.print("Digite o horário de entrada (HH:mm): ");
        LocalTime entrada = LocalTime.parse(scanner.next(), formatter);

        System.out.print("Digite a carga horária em horas: ");
        int cargaHoraria = scanner.nextInt();

        System.out.print("Digite o horário de saida (HH:mm): ");
        LocalTime saida = LocalTime.parse(scanner.next(), formatter);

        Duration expedienteReal = Duration.between(entrada,saida);
        Duration expedienteEsperado = Duration.between(entrada,entrada.plusHours(cargaHoraria));
        Duration tempoEntreExpedientes = expedienteReal.minus(expedienteEsperado);

        System.out.println("Horário de entrada: "+ entrada);
        System.out.println("Horário de saída previsto: "+ entrada.plusHours(cargaHoraria));
        System.out.println("Horário  real de saida: "+ saida);
        System.out.printf("Saldo de Horas: %dh %dmin",tempoEntreExpedientes.toHours(),tempoEntreExpedientes.toMinutes());



    }
}
