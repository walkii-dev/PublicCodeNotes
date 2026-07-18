package curso10;

public class Notificacao {
    private String destinatario;
    private String mensagem;

    public Notificacao(String destinatario, String mensagem) {
        this.destinatario = destinatario;
        this.mensagem = mensagem;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public void enviar(){
        System.out.println("Enviando Notificação para:"+destinatario);
        System.out.println("Mensagem: "+mensagem);
    }
}
