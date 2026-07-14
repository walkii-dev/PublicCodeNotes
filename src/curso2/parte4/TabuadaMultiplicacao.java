package curso2.parte4;

public class TabuadaMultiplicacao implements Tabuada {
    @Override
    public String mostrarTabuada(int num) {
        return "\n" +
                "1 X "+num+" = "+num * 1+"\n"+
                "2 X "+num+" = "+num * 2+"\n"+
                "3 X "+num+" = "+num * 3+"\n"+
                "4 X "+num+" = "+num * 4+"\n"+
                "5 X "+num+" = "+num * 5+"\n"+
                "6 X "+num+" = "+num * 6+"\n"+
                "7 X "+num+" = "+num * 7+"\n"+
                "8 X "+num+" = "+num * 8+"\n"+
                "9 X "+num+" = "+num * 9+"\n"+
                "10 X "+num+" = "+num * 10;
    }
}
