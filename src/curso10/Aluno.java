package curso10;

public class Aluno {
    private String nome;
    protected String tipo;

    public Aluno(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    // ao invés de criar um outro metodo, eu poderia ter definido um valor

    public void identificar(){
        System.out.printf("Aluno %s - Tipo : %s %n",nome,tipo);
    }
}
