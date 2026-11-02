public class Vehicle {
    String brand;
    String model;
    private double speed;

    public Vehicle(String brand, String model, double speed) {
        this.brand = brand;
        this.model = model;
        this.speed = speed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        if (speed >= 0 && speed <= 120) {
            this.speed = speed;
        } else {
            System.out.println("Velocidad invalida");
            this.speed = 0;
        }
    }

    public void starEngine(){
        System.out.println("El vehiculo encendió");
    }
}
