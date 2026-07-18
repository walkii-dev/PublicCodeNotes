package curso8;

import java.util.ArrayList;
import java.util.List;

public class Tarefa {
    String descricao;
    boolean concluida;

    void exibirInfo(){
        System.out.println("Descrição: "+ descricao);
        if (concluida) {
            System.out.println("Status: Concluída");
        } else {
            System.out.println("Status: Pendente.");
        }
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "descricao='" + descricao + '\'' +
                ", concluida=" + concluida +
                '}';
    }

    public static void main(String[] args) {
        Tarefa t1 = new Tarefa();
        Tarefa t2 = new Tarefa();
        Tarefa t3 = new Tarefa();
        Tarefa t4 = new Tarefa();
        Tarefa t5 = new Tarefa();

        t1.descricao = "Jogar bola";
        t1.concluida = true;
        t2.descricao = "Jogar lol";
        t2.concluida = false;
        t3.descricao = "Dar tiro pra cima";
        t3.concluida = true;
        t4.descricao = "Jogar no bicho";
        t4.concluida = true;
        t5.descricao = "isolar a bola do vizinho";
        t5.concluida = false;

        List<Tarefa> tarefas = new ArrayList<>();
        tarefas.add(t1);
        tarefas.add(t2);
        tarefas.add(t3);
        tarefas.add(t4);
        tarefas.add(t5);
        tarefas.forEach(Tarefa::exibirInfo );




    }

}
