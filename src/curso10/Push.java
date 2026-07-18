package curso10;

public class Push extends Notificacao{
    private String titulo;

    public Push(String destinatario, String mensagem, String titulo) {
        super(destinatario, mensagem);
        this.titulo = titulo;
    }

    @Override
    public void enviar() {
        System.out.println("Enviando Notificação Push para:"+getDestinatario());
        System.out.println("Título: "+titulo);
        System.out.println("Conteúdo: "+getMensagem());
    }
}
