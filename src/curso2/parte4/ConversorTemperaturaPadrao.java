package curso2.parte4;

public class ConversorTemperaturaPadrao implements ConversorTemperatura{
    @Override
    public double celsiusParaFarenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    @Override
    public double farenheitParaCelsius(double farenheit) {
        return (farenheit - 32) * 5/9;
    }
}
