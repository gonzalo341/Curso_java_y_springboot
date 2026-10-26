public class Animal {
    private String name;


    public Animal(String name) {
        this.name = name;
    }


    public void eat() {
        System.out.println(this.name + " está comiendo.");
    }


    public String getName() {
        return this.name;
    }

    public void makeSaidSound() {
        System.out.println("El animal emite un sonido genérico.");
    }
}