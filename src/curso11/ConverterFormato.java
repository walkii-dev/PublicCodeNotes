package curso11;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class ConverterFormato {
    public static void main(String[] args) {
        String data = "Data atual formatada: "+LocalDate.now()
                .format(DateTimeFormatter
                        .ofPattern("dd/MM/yyyy"));
        System.out.println(data);

        String hora = "Hora atual formatada: "+LocalTime.now()
                .format(DateTimeFormatter
                        .ofPattern("HH:mm"));
        System.out.println(hora);

    }
}
