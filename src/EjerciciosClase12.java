import java.util.ArrayList;
import java.util.Scanner;

public class EjerciciosClase12 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // =============================================================================================================
//        // Instanciación del objeto 'person1' de tipo 'Person'
//        Person person1 = new Person("Brais", 37);
//
//        // Invocación de sus métodos
//        person1.sayHello(); // Imprime: Hola, me llamo Brais y tengo 37 años.
//
//        // =============================================================================================================
//        Person person2 = new Person("MoureDev", 18);
//
//        person2.sayHello(); // Imprime: Hola, me llamo MoureDev y tengo 18 años.
//
        // =============================================================================================================

                                        // Ejercicios de Practica

        // =============================================================================================================
        System.out.println("\n ---------- Ejercicio 1: Clase Libro (Book) (Con IA) - Comentado por cambio en ejercicio 3 ----------\n");
        // Crea una clase Book con los atributos title y author. Instancia un objeto en la clase principal y asigna e
        // imprime sus valores por consola.

//        // 1. Instanciar el objeto
//        Book miLibro = new Book();
//
//        // 2. Asignar valores a los atributos
//        miLibro.title = "Don Quijote de la Mancha";
//        miLibro.author = "Miguel de Cervantes";
//
//        // 3. Imprimir los valores en la consola
//        System.out.println("Título del libro:   " + miLibro.title);
//        System.out.println("Autor del libro:    " + miLibro.author);


        // =============================================================================================================
        System.out.println("\n ---------- Ejercicio 2: Comportamiento Animal (Dog) ----------\n");
        // Crea una clase Dog con un atributo name y un metodo bark() que imprima por pantalla:
        //  "El perro [name] está ladrando: ¡Guau!".

        Dog dog1 = new Dog("Toby", "Caniche");

        dog1.bark();

        // =============================================================================================================
        System.out.println("\n ---------- Ejercicio 3: Constructor de Libro ----------\n");
        // Añade un constructor explícito a la clase Book que reciba title y author e inicialice los
        // atributos usando this.

        Book book1 = new Book("Don Quijote de la Mancha", "Miguel de Cervantes");

        System.out.println(String.format("Título del libro:   %s\nAutor del libro:    %s", book1.title, book1.author));

        // =============================================================================================================
        System.out.println("\n ---------- Ejercicio 4: Clase Vehículo (Car) ----------\n");
        // Diseña una clase Car con atributos brand y model, y un metodo showData() que muestre los detalles
        // del vehículo.

        Car car1 = new Car();

        car1.brand = "Tesla";
        car1.model = "Model Y";

        car1.showData();

        // =============================================================================================================
        System.out.println("\n ---------- Ejercicio 5: Evaluación de Estudiante (Student) ----------\n");
        // Crea una clase Student con el atributo score (double) y un metodo booleano hasPassed() que
        // devuelva true si la nota es mayor o igual a 6.0.

        Student student1 = new Student("Gonzalo", 2);

        System.out.println("Ingrese la nota del estudiante (por ej: 7.5): ");
        student1.score = sc.nextDouble();

        System.out.println("\n_ Esta aprobado?: " + student1.hasPassed());

        sc.nextLine();
        // =============================================================================================================
        System.out.println("\n ---------- Ejercicio 6: Cuenta Bancaria (BankAccount) ----------\n");
        // Diseña una clase BankAccount con el atributo balance (double) y un metodo deposit(double amount)
        // que incremente el saldo actual.

        BankAccount cuenta1 = new BankAccount(350000.00);

        cuenta1.mostrarBalance();

        System.out.println("Ingrese el monto que desea agregar: ");
        cuenta1.deposit(sc.nextDouble());

        cuenta1.mostrarBalance();

        sc.nextLine();
        // =============================================================================================================
        System.out.println("\n ---------- Ejercicio 7: Cálculo Geométrico (Rectangle) ----------\n");
        // Crea una clase Rectangle con atributos width y height, y un metodo que devuelva el área total
        // del rectángulo (width * height).

        Rectangle rectangle1 = new Rectangle();

        System.out.println("\nIngrese la altura en decimal del rectángulo: ");
        rectangle1.height = sc.nextDouble();

        System.out.println("\nIngrese el ancho en decimal del rectángulo: ");
        rectangle1.width = sc.nextDouble();

        System.out.println("\nEl area es de: " + rectangle1.calcularArea());

        // =============================================================================================================
        System.out.println("\n ---------- Ejercicio 8: Gestión de Trabajadores (Worker) ----------\n");
        // Diseña una clase Worker con atributos name y salary, e instanciala usando un constructor
        // para mostrar su nómina.

        Worker worker1 = new Worker("Juan", 754234.53);

        System.out.println(String.format("Nombre: %s | Salario: %.2f", worker1.name, worker1.salary));

        // =============================================================================================================
        System.out.println("\n ---------- Ejercicio 9: Colección de Objetos ----------\n");
        // Instancia 3 objetos de la clase Person con datos diferentes y guárdalos dentro de un
        // ArrayList<Person> para recorrerlos con un bucle for-each.

        Person person3 = new Person("Juan", 28);
        Person person4 = new Person("Maria", 26);
        Person person5 = new Person("Martin", 32);

        ArrayList<Person> personList = new ArrayList<>();
        personList.add(person3);
        personList.add(person4);
        personList.add(person5);

        for (Person p : personList) {
            System.out.println("Nombre: " + p.getName() + " | Edad: " + p.getAge());
        }

        // =============================================================================================================
        System.out.println("\n ---------- Ejercicio 10: Aplicación de Descuentos (Product) ----------\n");
        // Crea una clase Product con atributos name y price, y un metodo applyDiscount(double percentage) que
        // reduzca su precio según el porcentaje suministrado.

        Product product1 = new Product("notebook", 895499.00);

        product1.applyDiscount(15.0);

        System.out.println("Precio de " + product1.name + ": $" + product1.getPrice());

    }
}
