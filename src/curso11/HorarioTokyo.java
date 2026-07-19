package curso11;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class HorarioTokyo {
    public static void main(String[] args) {
        DateTimeFormatter formt = DateTimeFormatter.ofPattern("hh:mm:ss");
        String horaTokyo = LocalTime.now(ZoneId.of("Asia/Tokyo")).format(formt);

        System.out.println("Hora Atual em Tokyo: "+horaTokyo);
    }
}
