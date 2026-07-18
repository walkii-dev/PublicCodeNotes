package curso9;

public class Bateria {
    private int nivel;


    public void setNivel(int nivel) {
        if (nivel >= 0 && nivel <= 100) {
            this.nivel = nivel;
        } else {
            System.out.println("Não é possível atribuir esse valor. defina de 0 a 100.");
        }
    }
    public String exibirStatus(){

        if (nivel <= 20) {
            return "Bateria Fraca.";
        } else if (nivel <= 80) {
            return "Bateria OK";
        } else {
            return "Bateria Cheia.";
        }
    }

    public static void main(String[] args) {
        Bateria bat = new Bateria();
        bat.setNivel(101);
        System.out.println("Status: "+bat.exibirStatus());
    }
}
