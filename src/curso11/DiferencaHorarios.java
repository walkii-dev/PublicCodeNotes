package curso11;

import java.time.Duration;
import java.time.LocalTime;
import java.time.Period;

public class DiferencaHorarios {
    public static void main(String[] args) {
        LocalTime primeiroHorario = LocalTime.of(14,30,00);
        LocalTime segundoHorario = LocalTime.of(16,45,00);

        long difHoras = Duration.between(primeiroHorario,segundoHorario).toHours();
        long difMinutos = Duration.between(primeiroHorario,segundoHorario).toMinutes();

        System.out.printf("Diferença de Tempo é de %d horas e %d minutos.",difHoras,difMinutos%60);
    }
}
