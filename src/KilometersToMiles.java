public class KilometersToMiles implements Converter{
    private static final double KM_TO_MILES_FACTOR = 0.621371;

    @Override
    public double convert(double kilometers) {
        return kilometers * KM_TO_MILES_FACTOR;
    }
}
