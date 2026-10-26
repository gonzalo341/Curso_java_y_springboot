public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    // Sobreescritura especializada del comportamiento del padre
    @Override
    public void makeSaidSound() {
        System.out.println("El gato maúlla: ¡Miau!");
    }
}
