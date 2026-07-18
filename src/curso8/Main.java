package curso8;

public class Main {
    public static void main(String[] args) {


        Produto p1 = new Produto();
        p1.setNome("Mouse Gamer");
        p1.setPreco(12.90);
        p1.setQuantidade(30);
        p1.exibirInfo();

        Livro l1 = new Livro();
        l1.setTitulo("Naruto Vol. 1");
        l1.setAutor("Masashi Kishmoto");
        l1.setPaginas(89);
        l1.resumirInfos();

        ContaBancaria c = new ContaBancaria();
        c.setSaldo(1579.42);
        c.exibirSaldo();
        c.zerarSaldo();
        c.exibirSaldo();

        VerificadorTemperatura verificador = new VerificadorTemperatura();
        verificador.setLocal("Baía");
        verificador.setTemperatura(40.2);
        verificador.exibirInfos();

        Aluno a1 = new Aluno();
        a1.setNome("Lucas");
        a1.setNota1(6.8);
        a1.setNota2(7.7);
        a1.calcularMedia();
        a1.exibirInfo();


    }
}
