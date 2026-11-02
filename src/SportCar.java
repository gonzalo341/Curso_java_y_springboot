public class SportCar extends Vehicle{

    public SportCar(String brand, String model, double speed) {
        super(brand, model, speed);
    }

    @Override
    public void setSpeed(double speed) {
        if (speed >= 0 && speed <= 300) {
            super.setSpeed(speed);
        } else {
            System.out.println("Velocidad invalida");
        }
    }
}
