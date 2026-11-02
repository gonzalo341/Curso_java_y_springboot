import java.util.Scanner;

public class EjerciciosClase14 {
    static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        // =============================================================================================================
        System.out.println("\n ---------- Ejercicio 1: Polimorfismo en Figuras (Shape) ----------\n");
        // Crea una clase abstracta Shape con el metodo abstracto calculateArea(). Implementa las subclases Circle y
        // Rectangle que calculen sus respectivas áreas.

        // Área de círculo
        Circle shape1 = new Circle("Rojo");

        System.out.println("Ingrese el radio (en decimal) del circulo en cm: ");
        shape1.setRadius(sc.nextDouble());

        System.out.println(String.format("\nEl area es de: %.2f cm", shape1.calculateArea()));

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


        // =============================================================================================================
        System.out.println("\n ---------- Ejercicio 3: Sobrecarga en Impresora (Printer) ----------\n");
        // Crea una clase Printer con métodos print() sobrecargados para imprimir un String, un int y un double.
        // =============================================================================================================
        System.out.println("\n ---------- Ejercicio 4: Vehículos Acuáticos y Terrestres ----------\n");
        // Define las interfaces Drivable y Sailable. Crea la clase AmphibiousVehicle que implemente ambas interfaces
        // simultáneamente.
        // =============================================================================================================
        System.out.println("\n ---------- Ejercicio 5: Instanciación Prohibida ----------\n");
        // Intenta instanciar directamente una clase abstracta con new y observa el mensaje de error de compilación.
        // =============================================================================================================
        System.out.println("\n ---------- Ejercicio 6: Colección Polimórfica ----------\n");
        // Crea un ArrayList<Animal> que contenga instancias de Dog, Cat y Duck. Recórrela con un bucle for-each e invoca
        // el metodo makeSound() en cada uno.
        // =============================================================================================================
        System.out.println("\n ---------- Ejercicio 7: Composición de Computadora (Computer) ----------\n");
        // Diseña la clase Processor y la clase Computer. Aplica composición agregando un atributo de tipo Processor dentro de Computer.
        // =============================================================================================================
        System.out.println("\n ---------- Ejercicio 8: Conversión de Unidades (Converter) ----------\n");
        // Crea una interfaz Converter con un metodo convert(double value). Implementa CelsiusToFahrenheit y KilometersToMiles.
        // =============================================================================================================
        System.out.println("\n ---------- Ejercicio 9: Pagos en Comercio Electronico (PaymentMethod) ----------\n");
        // Diseña la clase abstracta PaymentMethod con un metodo abstracto processPayment(double amount).
        //  Implementa CreditCardPayment y PayPalPayment.
        // =============================================================================================================
        System.out.println("\n ---------- Ejercicio 10: Diseño Complejo Integrador ----------\n");
        // Crea la interfaz Workable con el metodo work(), la clase abstracta Person y la subclase Developer que
        // herede de Person e implemente Workable.
    }
}
