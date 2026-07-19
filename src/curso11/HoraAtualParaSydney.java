package curso11;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class HoraAtualParaSydney {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm");
        System.out.println("Hora atual do sistema: "+LocalTime.now().format(formatter));

        ZonedDateTime tempoSydney = ZonedDateTime.now(ZoneId.of("Australia/Sydney"));
        LocalTime horaSydney = tempoSydney.toLocalTime();

        System.out.println("Hora em Sydney: "+horaSydney.format(formatter));
    }
}
