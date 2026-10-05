import java.util.Arrays;
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
        // Crea un array con los nombres de 4 ciudades usando la sintaxis de llaves {...} e imprime
        // la ciudad ubicada en la segunda posición (índice 1).
        String[] ciudades = {"Mendoza", "Buenos Aires", "Córdoba", "Rosario"};

        System.out.println(Arrays.toString(ciudades));
        System.out.println(String.format("%n_ El nombre de la segunda ciudad guardada es: %s", ciudades[1]));

        System.out.println("\n ---------- Ejercicio 3: Lectura de tamaño ----------\n");
        // Declara un array de decimales (double) e imprime en consola su longitud total mediante
        // la propiedad .length.

        double[] decimales = {1.5 , 2.8 , 3.56, 2.45};

        System.out.println(Arrays.toString(decimales));
        System.out.println(String.format("%n_ La longitud del array decimales[] es de: %d", decimales.length));

        System.out.println("\n ---------- Ejercicio 4: Modificación de elemento ----------\n");
        // Crea un array con 3 números, modifica el valor alojado en el índice central (índice 1) e imprime
        // el valor antes y después de la modificación.

        double[] numModificales = {1.56, 2.45, 3.56};

        System.out.println(String.format("_ El array actual tiene los siguientes valores: %.2f - %.2f - %.2f", numModificales[0], numModificales[1], numModificales[2]));

        System.out.println("\nIngrese un nuevo valor para el indice 1: ");
        numModificales[1] = sc.nextDouble();

        System.out.println(String.format("%n_ El array actual tiene los siguientes valores: %.2f, %.2f, %.2f", numModificales[0], numModificales[1], numModificales[2]));

        sc.nextLine(); // Limpiar escaner
        System.out.println("\n ---------- Ejercicio 5: Suma manual ----------\n");
        // Declara un array de 3 enteros y calcula la suma total de sus elementos accediendo individualmente
        // a cada posición (array + array + array).

        int[] numEnteros = new int[3];

        for (int i = 0; i < numEnteros.length; i++) {
            System.out.println(String.format("Ingrese el %d numero: ", (i+1)));
            numEnteros[i] = sc.nextInt();
        }

        int sumTotal = numEnteros[0] + numEnteros[1] + numEnteros[2];

        System.out.println(String.format("%n_ La suma total del array es de: %d", sumTotal));

        sc.nextLine(); // Limpiar escaner
        System.out.println("\n ---------- Ejercicio 6: Acceso dinámico ----------\n");
        // Dado un array de cadenas de texto de cualquier longitud, accede e imprime su último elemento
        // utilizando la fórmula .length - 1.
        String[] arrayString = new String[4];

        for (int i = 0; i < arrayString.length; i++) {
            System.out.println(String.format("Ingrese la %d cadena de texto: ", (i+1)));
            arrayString[i] = sc.nextLine();
        }

        System.out.println(String.format("%n_ El ultimo elemento es: %s", arrayString[arrayString.length-1]));

        System.out.println("\n ---------- Ejercicio 7: Verificación de ceros ----------\n");
        //  Crea un array de enteros de tamaño 3 utilizando new int e imprime sus 3 posiciones para
        //  comprobar que contienen el valor 0 por defecto.

        int[] newArrayInt = new int[3];

        for (int i = 0; i < newArrayInt.length; i++) {
            System.out.println(String.format("El valor del indice %d es: %d", i, newArrayInt[i]));
        }
        System.out.println("\n ---------- Ejercicio 8: Verificación de nulos ----------\n");
        // Crea un array de cadenas de texto de tamaño 2 mediante new String e imprime sus celdas para
        // verificar que contienen el valor null.

        String[] newArrayString = new String[2];

        for (int i = 0; i < newArrayString.length; i++) {
            System.out.println(String.format("El valor del indice %d es: %s", i, newArrayString[i]));
        }

        System.out.println("\n ---------- Ejercicio 9: Prueba de excepción ----------\n");
        // Escribe intencionadamente una instrucción que intente acceder a un índice fuera de rango(por ejemplo,
        // el índice 5 en un array de tamaño 3) para observar la excepción ArrayIndexOutOfBoundsException en la consola.

        //String[] newArrayError = new String[3];

        //System.out.println(newArrayError[5]);

        sc.nextLine(); // Limpiar escaner
        System.out.println("\n ---------- Ejercicio 10: Cálculo de promedio ----------\n");
        //  Crea un array con 4 notas decimales, calcula la suma de todas ellas e imprime la nota promedio dividiendo
        //  la suma entre la cantidad total de notas.

        float[] notas = new float[4];

        for (int i = 0; i < notas.length; i++) {
            System.out.println(String.format("Ingrese nota (decimal) %d: ", (i + 1)));
            notas[i] = sc.nextFloat();
        }

        float sumaNota = notas[0] + notas[1] + notas[2] + notas[3];
        float media = (sumaNota / notas.length);

        System.out.println(String.format("%n_ El promedio de las notas ingresadas es de: %.2f", media));
    }
}
