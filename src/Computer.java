public class Computer extends Processor{
    String Marca;
    String Modelo;

    public Computer(int cantNucleos, int cantHilos, String marca, String modelo) {
        super(cantNucleos, cantHilos);
        Marca = marca;
        Modelo = modelo;
    }
}
