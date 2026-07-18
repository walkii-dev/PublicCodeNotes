package curso10;

public class ReservaVIP extends Reserva{

    @Override
    public void reservar() {
        System.out.println("Reserva VIP Confirmada com atendimento exclusivo!");
    }
}
