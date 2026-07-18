package curso8;

public class VerificadorTemperatura {
    private String local;
    private double temperatura;

    public VerificadorTemperatura(String local, double temperatura) {
        this.local = local;
        this.temperatura = temperatura;
    }

    public VerificadorTemperatura() {
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public void exibirInfos(){
        System.out.println("Sensor no Local: "+local);
        System.out.printf("Temperatura: %.1f ºC%n",temperatura);

        if (temperatura >= 39.2){
            System.out.println("Alerta! Temperatura acima do Limite!");
        }
    }
}
