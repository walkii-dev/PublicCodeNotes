package curso3.parte4;

import java.util.Comparator;

public class Titulo implements Comparable<Titulo> {
    private String nome;

    public Titulo(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Titulo() {
    }

    @Override
    public int compareTo(Titulo o) {
        return this.nome.compareTo(o.nome);
    }

    @Override
    public String toString() {
        return nome;
    }
}
