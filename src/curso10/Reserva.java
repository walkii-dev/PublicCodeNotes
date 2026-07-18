package curso10;

public class Reserva {

    public void reservar(){
        System.out.println("Reserva realizada!");
    }
    public void reservar(String data){
        System.out.println("Reserva realizada para o dia "+data);
    }
    public void reservar(String data, int quantidadePessoas){
        System.out.printf("Reserva realizada para o dia %s para %d pessoas. %n",data, quantidadePessoas);
    }
}
