package curso8;

public class Aluno {
    private String nome;
    private double nota1;
    private double nota2;

    public Aluno() {
    }

    public Aluno(String nome, double nota1, double nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public void calcularMedia(){
        double media = nota1 + nota2 / 2;
        System.out.println("Média do aluno: "+media);
        if (media >=7){
            System.out.println("Situação: Aprovado");
        } else {
            System.out.println("Situação: Reprovado");
        }
    }

    public void exibirInfo(){
        System.out.println("nome: "+nome);
        System.out.println("nota 1: "+nota1);
        System.out.println("nota 2: "+nota2);
        calcularMedia();


    }


}
