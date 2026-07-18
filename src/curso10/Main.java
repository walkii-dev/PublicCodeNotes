package curso10;

public class Main {
    public static void main(String[] args) {
//        Aluno a1= new Aluno("Lucas","Regular");
//        Bolsista b1 = new Bolsista("Ellen");
//
//        a1.identificar();
//        b1.identificar();

//        AlunoEscola a1 =new AlunoEscola("Lucas",12,7.5);
//        AlunoEscola a2 =new AlunoEscola("Ellen",9,8.2);
//
//        DocenteEscola d1 = new DocenteEscola("Ratinho",54,"Ed.Física");
//        DocenteEscola d2 = new DocenteEscola("Faustão",55,"Artes");
//
//        a1.exibirDados();
//        a2.exibirDados();
//
//        d1.exibirDados();
//        d2.exibirDados();
//        Revista revista = new Revista("Playboy",1999,27);
//        Livro livro = new Livro("Hentai",2026,"Tite Kubo");
//        Ebook ebook = new Ebook("Como ser Vagabundo",1999,"Amazon Kindle");
//
//        revista.exibirInfo();
//        livro.exibirInfo();
//        ebook.exibirInfo();
//        Email email = new Email("bakuganpk@hotmail.com","Bora jogar viado","convocação");
//        SMS sms = new SMS("(21)9866-1576","cuidado na rua");
//        Email push = new Email("app_user_android","Você recebeu uma nova Curtida","Nova Curtida");
//
//        email.enviar();
//        sms.enviar();
//        push.enviar();

Pix pix= new Pix(250);
CartaoCredito credito = new CartaoCredito(250);
BoletoBancario boleto= new BoletoBancario(250);

pix.confirmarPagamento();
boleto.confirmarPagamento();
credito.confirmarPagamento();



    }
}
