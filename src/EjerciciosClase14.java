import java.awt.Shape;
import java.util.ArrayList;
import java.util.Scanner;

public class EjerciciosClase14 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // =============================================================================================================
        //                                              Ejercicios
        // =============================================================================================================
        System.out.println("\n ---------- Ejercicio 1: Polimorfismo en Figuras (Shape) ----------\n");
        // Crea una clase abstracta Shape con el metodo abstracto calculateArea(). Implementa las subclases Circle y
        // Rectangle que calculen sus respectivas áreas.

        // Área de círculo
        Circle shape1 = new Circle("Rojo");

        System.out.println("Ingrese el radio (en decimal) del circulo en cm: ");
        shape1.setRadius(sc.nextDouble());

        System.out.println(String.format("\nEl area es de: %.2f cm\n", shape1.calculateArea()));

        // Área de rectángulo
        Rectangle shape2 = new Rectangle("Azul",0,0);

        System.out.println("Ingrese el ancho del rectángulo en cm: ");
        shape2.setWidth(sc.nextDouble());

        System.out.println("Ingrese el alto del rectángulo  en cm: ");
        shape2.setHeight(sc.nextDouble());

        System.out.println(String.format("\nEl area es de: %.2f cm", shape2
                .calculateArea()));

        sc.nextLine();
        // =============================================================================================================
        System.out.println("\n ---------- Ejercicio 2: Notificaciones (Notifier) ----------\n");
        // Diseña una interfaz Notifier con el metodo sendNotification(String message). Crea las clases EmailNotifier
        // y SMSNotifier que la implementen.

        EmailNotifier emailNotifier = new EmailNotifier();
        SMSNotifier smsNotifier = new SMSNotifier();

        System.out.println("Ingrese el mensaje de texto que desea enviar: ");
        smsNotifier.sendNotification(sc.nextLine());

        System.out.println("Ingrese el email que desea enviar: ");
        emailNotifier.sendNotification(sc.nextLine());

        sc.nextLine();
        // =============================================================================================================
        System.out.println("\n ---------- Ejercicio 3: Sobrecarga en Impresora (Printer) ----------\n");
        // Crea una clase Printer con métodos print() sobrecargados para imprimir un String, un int y un double.

        Printer print = new Printer();

        print.print("HOLA");
        print.print(34);
        print.print(45.6);
        print.print(true);


        // =============================================================================================================
        System.out.println("\n ---------- Ejercicio 4: Vehículos Acuáticos y Terrestres ----------\n");
        // Define las interfaces Drivable y Sailable. Crea la clase AmphibiousVehicle que implemente ambas interfaces
        // simultáneamente.

        AmphibiousVehicle car2 = new AmphibiousVehicle("Fantasy", "T1", 80);

        car2.conducir();

        car2.navegar();

        // =============================================================================================================
        System.out.println("\n ---------- Ejercicio 5: Instanciación Prohibida ----------\n");
        // Intenta instanciar directamente una clase abstracta con new y observa el mensaje de error de compilación.

        // Shape shape1 = new Shape();

        // =============================================================================================================
        System.out.println("\n ---------- Ejercicio 6: Colección Polimórfica ----------\n");
        // Crea un ArrayList<Animal> que contenga instancias de Dog, Cat y Duck. Recórrela con un bucle for-each e invoca
        // el metodo makeSound() en cada uno.

        Dog dog1 = new Dog("Tobi","Pastor alemán");
        Dog dog2 = new Dog("Choco","Labrador retriever");
        Dog dog3 = new Dog("Rex","Chihuahua");
        Dog dog4 = new Dog("Luna","Bichón habanero");

        Cat cat1 = new Cat("Milo");
        Cat cat2 = new Cat("Leo");
        Cat cat3 = new Cat("Salem");
        Cat cat4 = new Cat("Garfield");

        Duck duck1 = new Duck("Loki");
        Duck duck2 = new Duck("Silver");
        Duck duck3 = new Duck("Lucas");
        Duck duck4 = new Duck("Donald");

        ArrayList<Animal> animalArrayList1 = new ArrayList<>();

        animalArrayList1.add(dog1);
        animalArrayList1.add(dog2);
        animalArrayList1.add(dog3);
        animalArrayList1.add(dog4);
        animalArrayList1.add(cat1);
        animalArrayList1.add(cat2);
        animalArrayList1.add(cat3);
        animalArrayList1.add(cat4);
        animalArrayList1.add(duck1);
        animalArrayList1.add(duck2);
        animalArrayList1.add(duck3);
        animalArrayList1.add(duck4);

        for (Animal animal : animalArrayList1) {
            System.out.println("Nombre: " + animal.getName());
        }

        // =============================================================================================================
        System.out.println("\n ---------- Ejercicio 7: Composición de Computadora (Computer) ----------\n");
        // Diseña la clase Processor y la clase Computer. Aplica composición agregando un atributo de tipo Processor dentro de Computer.

        Computer computer1 = new Computer(10, 12, "HP", "Pavilion 15-eg3000");

        System.out.println(String.format("Marca: %s | Modelo: %s | Cantidad de nucleos: %d | Cantidad de hilos: %d", computer1.Marca, computer1.Modelo, computer1.cantNucleos, computer1.cantHilos));

        // =============================================================================================================
        System.out.println("\n ---------- Ejercicio 8: Conversión de Unidades (Converter) ----------\n");
        // Crea una interfaz Converter con un metodo convert(double value). Implementa CelsiusToFahrenheit y KilometersToMiles.

        CelsiusToFahrenheit converterC_F = new CelsiusToFahrenheit();

        System.out.println("20ºC a Fahrenheit: " + converterC_F.convert(20));

//        // =============================================================================================================
//        System.out.println("\n ---------- Ejercicio 9: Pagos en Comercio Electronico (PaymentMethod) ----------\n");
//        // Diseña la clase abstracta PaymentMethod con un metodo abstracto processPayment(double amount).
//        //  Implementa CreditCardPayment y PayPalPayment.

//        // =============================================================================================================
//        System.out.println("\n ---------- Ejercicio 10: Diseño Complejo Integrador ----------\n");
//        // Crea la interfaz Workable con el metodo work(), la clase abstracta Person y la subclase Developer que
//        // herede de Person e implemente Workable.

    }
}
