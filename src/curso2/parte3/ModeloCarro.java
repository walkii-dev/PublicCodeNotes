package curso2.parte3;

public class ModeloCarro extends Carro{
    public static void main(String[] args) {
        ModeloCarro uno = new ModeloCarro();
        uno.setModelo("fiat Uno");
        uno.setMediaAno1(1000);
        uno.setMediaAno2(2000);
        uno.setMediaAno3(1200);
        uno.exibirInfos();
    }
}
