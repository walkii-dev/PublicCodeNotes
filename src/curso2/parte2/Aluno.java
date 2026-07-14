package curso2.parte2;

public class Aluno {
    private String nome;
    private double notaBimestre1;
    private double notaBimestre2;
    private double notaBimestre3;
    private double notaBimestre4;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNotaBimestre1() {
        return notaBimestre1;
    }

    public void setNotaBimestre1(double notaBimestre1) {
        this.notaBimestre1 = notaBimestre1;
    }

    public double getNotaBimestre2() {
        return notaBimestre2;
    }

    public void setNotaBimestre2(double notaBimestre2) {
        this.notaBimestre2 = notaBimestre2;
    }

    public double getNotaBimestre3() {
        return notaBimestre3;
    }

    public void setNotaBimestre3(double notaBimestre3) {
        this.notaBimestre3 = notaBimestre3;
    }

    public double getNotaBimestre4() {
        return notaBimestre4;
    }

    public void setNotaBimestre4(double notaBimestre4) {
        this.notaBimestre4 = notaBimestre4;
    }

    public double calculaMedia(){
        return (notaBimestre1+notaBimestre2+notaBimestre3+notaBimestre4)/4;
    }
}
