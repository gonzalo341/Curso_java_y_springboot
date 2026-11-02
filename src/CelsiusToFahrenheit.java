public class CelsiusToFahrenheit implements Converter{
    @Override
    public double convert(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}
