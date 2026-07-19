package curso11;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CalculandoTempoEntrega {
    public static void main(String[] args) {
        LocalDate dataInicial = LocalDate.of(2026,07,19);
        System.out.println("Data de Entrega: "+dataInicial
                .plusDays(15)
                .format(DateTimeFormatter
                        .ofPattern("dd/MM/yyyy")));
    }
}
