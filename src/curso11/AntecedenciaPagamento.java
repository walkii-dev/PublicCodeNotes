package curso11;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class AntecedenciaPagamento {
    public static void main(String[] args) {
        LocalDate dataPagamento = LocalDate.of(2026,7,27);
        int diasAntecedentes = 7;
        LocalDate lembretePagamento = dataPagamento.minusDays(7);

        DateTimeFormatter formt = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        System.out.println("Data da notificação prévia: "+lembretePagamento.format(formt));

    }
}
