package curso11;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class VerificandoDataEvento {
    public static void main(String[] args) {
        LocalDate dataEvento = LocalDate.of(2026,7,25);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        System.out.println("Data do evento: "+dataEvento.format(formatter));
        System.out.println("Data Atual: "+LocalDate.now().format(formatter));

        if(dataEvento.isAfter(LocalDate.now())){
            System.out.println("Evento está pela frente.");
        } else {
            System.out.println("Evento já passou.");
        }
    }
}
