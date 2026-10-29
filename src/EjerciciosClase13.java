import java.util.Scanner;

public class EjerciciosClase13 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//
//        Dog dog1 = new Dog("Lucky", "Chihuahua");
//        Cat cat1 = new Cat("Mishi");
//
//        System.out.println(dog1.getName()); // Nombre de dog1
//        dog1.eat();
//
//        dog1.makeSaidSound(); // Resultado: El animal emite un sonido genérico.
//        cat1.makeSaidSound(); // Resultado: El gato maúlla: ¡Miau!

//        // =============================================================================================================
//        //                                              Ejercicios
//        // =============================================================================================================
//        System.out.println("\n ---------- Ejercicio 1: Cuenta Bancaria Segura (BankAccount) ----------\n");
//        // Diseña una clase BankAccount con el atributo privado balance. Crea métodos deposit(double) y withdraw(double)
//        // que validen que no se ingresen montos negativos ni se retire más dinero del saldo disponible.
//
//        BankAccount account1 = new BankAccount(340567.45);
//
//        account1.mostrarBalance();
//
//        System.out.println("Ingrese el monto que desea agregar: ");
//        account1.deposit(sc.nextDouble());
//
//        System.out.println("Ingrese el monto que desea retirar: ");
//        account1.withDraw(sc.nextDouble());
//
//        sc.nextLine();
//        // =============================================================================================================
//        System.out.println("\n ---------- Ejercicio 2: Validación de Producto (Product) ----------\n");
//        // Crea una clase Product con un atributo privado price. Utiliza un setter que impida asignar precios menores
//        // o iguales a cero.
//
//        Product product2 = new Product("Notebook Lenovo", 1);
//
//
//        System.out.println("Ingrese el precio del producto: ");
//        product2.setPrice(sc.nextDouble());
//
//        System.out.println("El precio es de: " + product2.getPrice());
//
//        sc.nextLine();
//        // =============================================================================================================
//        System.out.println("\n ---------- Ejercicio 3: Encapsulamiento de Estudiante ----------\n");
//        // Define la clase Student con atributos privados name y grade. Permite ajustar la nota mediante un setter que
//        // solo acepte valores entre 0.0 y 10.0.
//
//        Student student2 = new Student("", 1);
//
//        System.out.println("Ingrese el nombre del alumno: ");
//        student2.setName(sc.nextLine());
//
//        System.out.println("Ingrese el grado del alumno: ");
//        student2.setGrade(sc.nextInt());
//
//        sc.nextLine();
//        // =============================================================================================================
//        System.out.println("\n ---------- Ejercicio 4: Jerarquía de Vehículos (Vehicle y Car) ----------\n");
//        // Crea la superclase Vehicle con el metodo startEngine() y una subclase Car que herede de ella mediante extends
//        // y añada el metodo honk().
//
//        Car car2 = new Car();
//
//        car2.starEngine();
//        car2.honk();
//
//        // =============================================================================================================
//        System.out.println("\n ---------- Ejercicio 5: Constructor con super ----------\n");
//        // Implementa la superclase Person con el atributo privado name y su constructor. Crea la subclase Employee que
//        // añada el atributo salary y llame al constructor del padre usando super(name).
//
//        Employee employee1 = new Employee("Juan", 34, 750000.65);
//
//        System.out.println(String.format("Nombre: %s | Edad: %d | Salario: %.2f", employee1.getName(), employee1.getAge(), employee1.getSalary()));
//
        // =============================================================================================================
        System.out.println("\n ---------- Ejercicio 6: Sobreescritura de Sonidos ----------\n");
        // Diseña una superclase Animal con el metodo makeSound(). Crea las subclases Dog y Cat que sobreescriban dicho
        // metodo usando @Override para emitir sonidos específicos.

        Dog dog2 = new Dog("","");
        Cat cat2 = new Cat("");

        dog2.makeSaidSound();

        cat2.makeSaidSound();

        // =============================================================================================================
        System.out.println("\n ---------- Ejercicio 7: Sistemas de Empleados (Manager) ----------\n");
        // Crea la superclase Employee con atributo salary y metodo getSalary(). Diseña la subclase Manager que herede
        // de Employee, agregue un atributo bonus y sobreescriba getSalary() retornando el salario base más el bono.


        // =============================================================================================================
        System.out.println("\n ---------- Ejercicio 8: Protección con protected ----------\n");
        // Crea una superclase Shape con un atributo protected String color. Crea una subclase Circle que acceda
        // directamente al atributo color heredado para imprimir los detalles de la figura.
        // =============================================================================================================
        System.out.println("\n ---------- Ejercicio 9: Control de Velocidad (SportsCar) ----------\n");
        // Diseña una clase Vehicle con el atributo privado speed y su setter que no permita superar los 120 km/h.
        // Crea una subclase SportsCar que sobreescriba el comportamiento para permitir hasta 300 km/h.
        // =============================================================================================================
        System.out.println("\n ---------- Ejercicio 10: Colección Polimórfica de Animales ----------\n");
        // Crea un ArrayList<Animal> que contenga instancias de las subclases Dog, Cat y Animal. Recorre la lista con
        // un bucle for-each e invoca el metodo makeSound() en cada objeto observando cómo responde según su tipo.
    }
}
