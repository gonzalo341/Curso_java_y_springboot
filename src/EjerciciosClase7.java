import java.util.Scanner;

public class EjerciciosClase7 {
    static void main(String[] args) {
        // Con arrays: Agrupación organizada bajo un único contenedor
//        int[] scores = {10, 8, 9};
//
//        System.out.println(scores);
//
//
//        int[] numbers = new int [5];
//        System.out.println(numbers.length); // Devuelve: 5
//
//        String[] names = new String [3];
//        System.out.println(names.length); // Devuelve: 3
//
//        // Array de 4 enteros inicializados directamente (longitud = 4, índices del 0 al 3)
//        int[] ages = {37, 25, 18, 40};
//        System.out.println(ages.length);
//
//        // Array de 3 cadenas de texto
//        String[] fruits = {"Manzana", "Banana", "Naranja"};
//        System.out.println(fruits[1]);
//        System.out.println(fruits.length);
//
//        int[] numbers = new int [0];     // Contiene:
//        System.out.println(numbers);
//        boolean[] flags = new boolean [2]; // Contiene: [false, false]
//        System.out.println(flags[0] + " " + flags[1]);
//        String[] texts = new String[2];   // Contiene: [null, null]
//        System.out.println(texts[0] + " " + texts[1]);
//
//
//        String[] names = new String [3];
//        // Asignación de valores por posición de índice
//        names[0] = "Juan";
//        names[1] = "Perez";
//        names[2] = "Dev";
//
//        // Lectura de un valor por posición
//        System.out.println(names[0]); // Muestra: "Juan"
//
//        // Modificación de un valor existente
//        names[1] = "García";
//        System.out.println(names[1]); // Muestra: "García"
//
//        String lastElement = names[names.length - 1]; // "Dev"
//        System.out.println(lastElement);
//
//        int[] numbers = {10, 20, 30}; // Índices válidos: 0, 1, 2
//        // ERROR EN TIEMPO DE EJECUCIÓN:
//        System.out.println(numbers[numbers.length-1]); // Lanza ArrayIndexOutOfBoundsException

        Scanner sc = new Scanner(System.in);

        System.out.println("\n ---------- Ejercicio 1: Primer y último elemento ----------\n");
        // Declara un array de 5 enteros, asigna valores manualmente por índice e imprime por
        // consola el primer y el último elemento.

        int array[] = new int[5];

        System.out.println("Ingrese el valor del primer indice: ");
        array[0] = sc.nextInt();

        System.out.println("Ingrese el valor del segundo indice: ");
        array[1] = sc.nextInt();

        System.out.println("Ingrese el valor del tercer indice: ");
        array[2] = sc.nextInt();

        System.out.println("Ingrese el valor del cuarto indice: ");
        array[3] = sc.nextInt();

        System.out.println("Ingrese el valor del quinto indice: ");
        array[4] = sc.nextInt();

        System.out.println(String.format("\nLos valores guardados en el arrays son: %d, %d, %d, %d, %d", array[0], array[1], array[2], array[3], array[4]));


        System.out.println("\n ---------- Ejercicio 2: Array de cadenas ----------\n");
        System.out.println("\n ---------- Ejercicio 3: Lectura de tamaño ----------\n");
        System.out.println("\n ---------- Ejercicio 4: Modificación de elemento ----------\n");
        System.out.println("\n ---------- Ejercicio 5: Suma manual ----------\n");
        System.out.println("\n ---------- Ejercicio 6: Acceso dinámico ----------\n");
        System.out.println("\n ---------- Ejercicio 7: Verificación de ceros ----------\n");
        System.out.println("\n ---------- Ejercicio 8: Verificación de nulos ----------\n");
        System.out.println("\n ---------- Ejercicio 9: Prueba de excepción ----------\n");
        System.out.println("\n ---------- Ejercicio 10: Cálculo de promedio ----------\n");
    }
}
