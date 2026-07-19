package curso11;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CalculandoAdiantamento {
    public static void main(String[] args) {
        LocalDate dataVencimento = LocalDate.of(2026,9,10);
        int mesesParaAdiantar = 2;
        System.out.println("Nova data de Vencimento: "+dataVencimento
                .plusMonths(mesesParaAdiantar)
                .format(DateTimeFormatter
                        .ofPattern("dd-MM-yyyy")));
    }
}
