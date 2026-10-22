public class Person {
    // Atributos o características
    String name;
    int age;


    // Constructor personalizado
    public Person(String name, int age) {
        this.name = name; // 'this.name' refiere al atributo, 'name' al parámetro
        this.age = age;
    }


    public void sayHello() {
        System.out.println("Hola, me llamo " + this.name + " y tengo " + this.age + " años.");
    }

}
