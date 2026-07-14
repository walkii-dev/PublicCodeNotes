package curso2.parte3;

public class Carro {
    private String modelo;
    private double mediaAno1;
    private double mediaAno2;
    private double mediaAno3;

    public String getModelo() {
        return modelo;
    }

    public double getMediaAno1() {
        return mediaAno1;
    }

    public void setMediaAno1(double mediaAno1) {
        this.mediaAno1 = mediaAno1;
    }

    public double getMediaAno2() {
        return mediaAno2;
    }

    public void setMediaAno2(double mediaAno2) {
        this.mediaAno2 = mediaAno2;
    }

    public double getMediaAno3() {
        return mediaAno3;
    }

    public void setMediaAno3(double mediaAno3) {
        this.mediaAno3 = mediaAno3;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public double maiorPreco(){
        double maiorPreco = mediaAno1;
        if(mediaAno2 > maiorPreco){
            maiorPreco = mediaAno2;
        }
        if (mediaAno3 > maiorPreco){
            maiorPreco = mediaAno3;
        }
        return maiorPreco;

    }
    public double menorPreco(){
        double menorPreco = mediaAno1;
        if(mediaAno2 < menorPreco){
            menorPreco = mediaAno2;
        }
        if (mediaAno3 < menorPreco){
            menorPreco = mediaAno3;
        }
        return menorPreco;
    }

    public void exibirInfos(){
        System.out.println(
                "Modelo do carro:"+modelo+"\n"+
                "Preço no ano x:"+mediaAno1+"\n"+
                "Preço no ano y:"+mediaAno2+"\n"+
                "Preço no ano z:"+mediaAno3+"\n"+
                "Maior preço do carro:"+maiorPreco()+"\n"+
                "menor preço do carro:"+menorPreco()

        );
    }

}

