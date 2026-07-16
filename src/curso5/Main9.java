package curso5;

public class Main9 {
    public static void main(String[] args) {
        double consumoMedio = 12.5;
        double capacidadeTanque = 50;
        double combustivelAtual = 20;
        double distanciaViagem = 200;


        double autonomiaMaxima = consumoMedio * capacidadeTanque;
        double autonomiaAtual = consumoMedio * combustivelAtual;

        System.out.printf("Autonomia máxima do veículo (tanque cheio): %f Km",autonomiaMaxima);
        System.out.printf("Autonomia Atual do veículo (tanque atual): %f Km",autonomiaAtual);

        if (autonomiaAtual > distanciaViagem) {
            System.out.println("Dá pra viajar sem abastecer.");
        } else {
            System.out.println("Vai ter que abastecer pae");
        }


    }
}
