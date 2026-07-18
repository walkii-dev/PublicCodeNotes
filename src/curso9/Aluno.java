package curso9;

public class Aluno {
    private String nome;
    private int pontos;
    private int nivel;

    public Aluno(String nome) {
        this.nome = nome;
        this.pontos = 0;
        this.nivel = 1;
    }

    void ganharPontos(int quantidadePontos){
        this.pontos += quantidadePontos;
    }

    void verificarNivel(){
        if (this.pontos > 99){
            this.nivel = 2;
        } else if (this.pontos > 199 && this.pontos < 300) {
            this.nivel = 3;
        } else if (this.pontos > 300 && this.pontos < 400) {
            this.nivel = 4;
        }
    }

    void exibirStatus(){

        verificarNivel();

        System.out.println("Nome: "+nome);
        System.out.println("Pontos: "+pontos);
        System.out.println("Nível: "+nivel);
    }

    public static void main(String[] args) {
        Aluno a = new Aluno("Lucas");
        a.ganharPontos(80);
        a.exibirStatus();
        a.ganharPontos(80);
        a.exibirStatus();
    }
}
