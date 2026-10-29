public class Dog extends Animal{
    private String breed; // Atributo específico de la subclase Dog

    public Dog(String name, String breed) {
        super(name); // Invoca al constructor de la superclase (Animal)
        this.breed = breed;
    }

    // Método especializado de la subclase Dog
    public void bark() {
        System.out.println(getName() + " está ladrando: ¡Guau!");
    }

    public void eat() {
        super.eat(); // Ejecuta primero la lógica de comer del padre
        System.out.println("El perro come alegremente en su plato.");
    }

    @Override
    public void makeSaidSound() {
        System.out.println("El perro ladra: ¡Guau!");
    }
}
