package curso2.parte1;

public class Carro {
    private String modelo;
    private int ano;
    private String cor;

    public void fichaTecnica(){
        System.out.println(
                "Nome: "+modelo+"\n"+
                "Ano: "+ano+"\n"+
                "Cor: "+cor);
    }

    public void idadeCarro(){
        int anoAtual = 2026;
        System.out.println("Idade do carro: "+(anoAtual - ano));
    }
}
