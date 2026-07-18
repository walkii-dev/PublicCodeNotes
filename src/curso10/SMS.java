package curso10;

public class SMS extends Notificacao{
    public SMS(String destinatario, String mensagem) {
        super(destinatario, mensagem);
    }

    @Override
    public void enviar() {
        System.out.println("Enviando SMS para: "+getDestinatario());
        System.out.println("Mensagem: "+getMensagem());

    }
}
