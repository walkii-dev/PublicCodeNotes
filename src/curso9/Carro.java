package curso9;

public class Carro {
    private String modelo;
    private String placa;
    private int ano;

    public Carro(String modelo,String placa, int ano){
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public int getAno() {
        return ano;
    }

    public static void main(String[] args) {
        Carro car = new Carro("Fiat Uno","BCW-5544",2016);

        System.out.println("Veículo Cadastrado:");
        System.out.println("Modelo: "+car.getModelo());
        System.out.println("Placa: "+car.getPlaca());
        System.out.println("Ano: "+car.getAno());


    }
}
