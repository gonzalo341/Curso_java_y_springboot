public class Car extends Vehicle{
    public void showData(){
        System.out.println("Brand:  " + this.brand + "\nModel:  " + this.model);
    }

    public void honk(){
        System.out.println("El auto toca la bocina");
    }
}
