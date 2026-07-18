package curso9;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private String nome;
    private List<Double> notas;

    public String getNome() {
        return nome;
    }

    public List<Double> getNotas() {
        return notas;
    }

    public Disciplina(String nome) {
        this.nome = nome;
        this.notas = new ArrayList<>();
    }

    void adicionarNota(double nota){
        notas.add(nota);

        if(nota < 0.0 || nota > 10.0){
            System.out.println("Nota ignorada: "+nota);
        }
    }

    public static void main(String[] args) {
        Disciplina artes = new Disciplina("Artes");
        artes.adicionarNota(10);
        artes.adicionarNota(-3.2);
        artes.adicionarNota(16);
        artes.adicionarNota(7.3);


        int notasvalidas=0;
        double calculoMedia =0;
        for(Double nota: artes.getNotas()){
            if (nota < 0.0 || nota > 10.0){
                notasvalidas++;
                calculoMedia+=nota;
            }
        }

        calculoMedia /= notasvalidas;
        System.out.println("Notas Válidas: "+notasvalidas);
        System.out.printf("Média da Disciplina %s : %.2f",artes.getNome(),calculoMedia);
    }
}
