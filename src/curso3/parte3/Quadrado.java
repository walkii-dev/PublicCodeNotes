package curso3.parte3;

public class Quadrado implements Forma{

    private double lado;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public Quadrado() {
    }

    @Override
    public double calcularArea() {
        return lado*lado;
    }
}
