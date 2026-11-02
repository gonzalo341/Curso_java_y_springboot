public class Car extends Vehicle{
    public Car(String brand, String model, double speed) {
        super(brand, model, speed);
    }

    public void showData(){
        System.out.println("Brand:  " + this.brand + "\nModel:  " + this.model);
    }

    public void honk(){
        System.out.println("El auto toca la bocina");
    }
}
