public class Person {
    // Atributos o características
    private String name;
    private int age;


    public Person(String name, int age) {
        this.name = name;
        setAge(age); // Se utiliza el setter para aplicar la validación desde la construcción
    }


    // Getter para leer el nombre
    public String getName() {
        return this.name;
    }


    // Setter con regla de negocio y validación
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Error: La edad no puede ser negativa.");
        }
    }


    // Getter para leer la edad
    public int getAge() {
        return this.age;
    }

    public void sayHello() {
        System.out.println("Hola, me llamo " + this.name + " y tengo " + this.age + " años.");
    }
}


