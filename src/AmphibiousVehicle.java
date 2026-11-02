public class AmphibiousVehicle extends Vehicle implements Sailable, Drivable{
    public AmphibiousVehicle(String brand, String model, double speed) {
        super(brand, model, speed);
    }

    @Override
    public void conducir(){
        System.out.println("El auto va por tierra");
    }

    @Override
    public void navegar(){
        System.out.println("El auto va por agua");
    }
}
