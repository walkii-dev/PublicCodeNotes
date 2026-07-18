package curso9;

import java.util.ArrayList;
import java.util.List;

public class Contato {
    private String nome;
    private String contato;

    public Contato(String nome, String contato) {
        this.nome = nome;
        this.contato = contato;
    }

    public String getNome() {
        return nome;
    }

    public String getContato() {
        return contato;
    }

    public static void main(String[] args) {
        List<Contato> contatos = new ArrayList<>();
        contatos.add(new Contato("Maria","(21)99999-9999"));
        contatos.add(new Contato("Carlos","(21)88888-9999"));
        contatos.add(new Contato("Safira","(21)99999-8888"));
        contatos.forEach( c-> System.out.println(c.getNome()+" - "+ c.getContato()));
    }
}
