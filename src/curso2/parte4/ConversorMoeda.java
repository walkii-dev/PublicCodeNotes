package curso2.parte4;

public class ConversorMoeda implements ConversaoFinanceira {
    @Override
    public double dolarParaReal(double dolar){
        return dolar * 4.94;
    }

}
