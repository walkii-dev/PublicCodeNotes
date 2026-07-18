package curso10;

public class Mensageria {

    public void enviarMensagem(String mensagem){
        System.out.printf("Mensagem enviada para todos: %s %n",mensagem);
    }

    public void enviarMensagem(String destinatario,String mensagem){
        System.out.printf("Mensagem enviada para %s : %s %n",destinatario,mensagem);
    }

    public void enviarMensagem(String destinatario,String mensagem,int quantidade){
        for (int i = 0; i < quantidade; i++) {
            System.out.printf("Mensagem enviada para %s : %s %n",destinatario,mensagem);
        }

    }
}
