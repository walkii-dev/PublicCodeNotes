package curso8;

import java.util.Scanner;

public class Colaborador {


    public Scanner input = new Scanner(System.in);

    private String nome;
    private String cargo;
    private int nivelAcesso;

    public Colaborador(String nome, String cargo, int nivelAcesso) {
        this.nome = nome;
        this.cargo = cargo;
        this.nivelAcesso = nivelAcesso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(int nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }

    public Colaborador() {

    }

    public void exibirInfo(){
        System.out.println("Nome :"+nome);
        System.out.println("Cargo :"+cargo);
        System.out.println("Nível de acesso:"+nivelAcesso);
    }

    public void alteraNivelAcesso() {
        System.out.print("Digite seu novo nível de acesso: ");
        this.nivelAcesso = input.nextInt();
        System.out.println("Novo Nível de acesso: "+this.nivelAcesso);

    }
    public void alteraCargo(){
        System.out.print("Digite seu novo cargo: ");
        this.cargo = input.nextLine();
        System.out.println("Novo Cargo: "+this.cargo);
        input.close();
    }

    public static void main(String[] args) {
        Colaborador c1 = new Colaborador();
        c1.setNome("Lucas Oliveira");
        c1.setCargo("Ajudador");
        c1.setNivelAcesso(1);
        c1.exibirInfo();

        c1.alteraNivelAcesso();
        c1.alteraCargo();
        c1.exibirInfo();




    }


}


