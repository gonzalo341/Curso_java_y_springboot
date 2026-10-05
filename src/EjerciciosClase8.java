import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class EjerciciosClase8 {
    static void main(String[] args) {
        // 1. Listas Dinámicas vs. Arrays Estáticos

        // Array estático: Tamaño fijo de 3 posiciones
        String[] staticArray = new String [3];

        System.out.println(staticArray[2]);

        // ArrayList dinámico: Empieza con tamaño 0 y crece según la necesidad
        ArrayList<String> dynamicList = new ArrayList<>();

        System.out.println(dynamicList);

        //Tipos Genéricos (Generics) y Sintaxis de Declaración

        // Declaración e instanciación tradicional
        ArrayList<String> names = new ArrayList<String>();
        System.out.println(names.toArray().length);

        // Sintaxis Moderna con var
        var fruits = new ArrayList<String>(); // Java infiere que es un ArrayList<String>
        System.out.println(fruits.toArray().length);

        // 3. Clases Envolventes (Wrapper Classes)

        // Mapeo de Tipos Primitivos a Clases Envolventes


        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Double> prices = new ArrayList<>();
        ArrayList<Boolean> flags = new ArrayList<>();
        ArrayList<Character> letters = new ArrayList<>();
        ArrayList<Long> ids = new ArrayList<>();

        System.out.println(numbers);
        System.out.println(prices);
        System.out.println(flags);
        System.out.println(letters);
        System.out.println(ids);

        // Autoboxing y Unboxing

        var scores = new ArrayList<Integer>();
        scores.add(10); // Autoboxing: Convierte el int 10 en un objeto Integer
        int firstScore = scores.get(0); // Unboxing: Extrae el Integer como int primitivo

        System.out.println(String.format("%n_ El valor extraido es: %d", firstScore));

        // 4. Métodos Principales de Lectura e Inserción
        // Añadir Elementos (add())
        names.add("Marta"); // Posición 0
        names.add("Perez"); // Posición 1
        names.add(1, "Dev"); // Inserta "Dev" en la posición 1 -> ["Marta", "Dev", "Perez"]

        System.out.println(String.format("%nEl valor de la posicion 1 es: %s", names.get(1)));

        // Consultar el Tamaño (size())
        System.out.println(String.format("El tamaño del arrayList es de: %d", names.size())); // Devuelve: 3

        // Obtener Elementos por Índice (get())
        String firstName = names.get(0); // Devuelve: "Marta"

        System.out.println(String.format("El primer nombre es: %s", firstName));

        // Métodos de Extremos (getFirst() / getLast())
        String first = names.getFirst(); // Equivalente a names.get(0)
        String last = names.getLast();   // Equivalente a names.get(names.size() - 1)

        System.out.println(String.format("El primer valor es: %s.%nEl segundo valor es: %s", first, last));

        //5. ==================== Modificación, Búsqueda y Eliminación ====================

        //Reemplazar Valores (set())
        names.set(2, "PerezDev"); // Reemplaza el elemento del índice 2 por "PerezDev"
        System.out.println(String.format("%nEl nuevo valor del indice 2 es: %s", names.get(2)));

        // Comprobar Existencia (contains())
        boolean hasMarta = names.contains("Marta"); // true
        System.out.println(String.format("Contiene 'Marta'?: %b", hasMarta));

        // Eliminación de Elementos (remove())
        names.remove(0); // Elimina el elemento de la posición 0 ("Marta")
        names.remove("Dev"); // Busca y elimina la coincidencia directa "Dev"

        System.out.println(String.format("El nuevo primer valor es: %s", names.getFirst()));
        System.out.println(String.format("Contiene 'Dev' ahora?: %b", names.contains("Dev")));

        // Vaciar y Validar Estado (clear() / isEmpty())
        System.out.println(names.isEmpty()); // false
        names.clear();                       // Elimina todos los registros
        System.out.println(names.isEmpty()); // true

        Scanner sc = new Scanner(System.in);
        System.out.println("\n ---------- Ejercicio 1: Lista de Cadenas ----------\n");
        // Crea un ArrayList de cadenas de texto (String), añade 3 nombres de ciudades e imprímelos por pantalla.

        ArrayList<String> nombresCiudad = new ArrayList<>();

        for (int i = 0; i < 3; i++){
            System.out.println(String.format("_ Ingrese la %d nombre de la ciudad: ", (i + 1)));
            String nuevoNombre = sc.next();
            nombresCiudad.add(nuevoNombre);
        }

        System.out.println(String.format("%n_ Las ciudades ingresadas son: %s - %s - %s", nombresCiudad.get(0), nombresCiudad.get(1), nombresCiudad.get(2)));

        sc.next();
        System.out.println("\n ---------- Ejercicio 2: Uso de Wrappers ----------\n");
        // Declara un ArrayList de números enteros utilizando la clase envolvente Integer y añade 4 valores numéricos.

        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 0; i<4; i++){
            System.out.println(String.format("Ingresa el $d valor numerico(entero): ", i+1));
            Integer nuevoNumero = sc.nextInt();
            numeros.add(nuevoNumero);
        }

        System.out.println(String.format("La arrayList de numeros contiene: %d - %d - %d - %d", numeros.get(0), numeros.get(1), numeros.get(2), numeros.get(3)));

        sc.next();
        System.out.println("\n ---------- Ejercicio 3: Consulta de Tamaño ----------\n");
        // Escribe un programa que añada 5 elementos a una lista dinámica e imprima su tamaño actual mediante el
        // método .size().

        ArrayList<String> nombres = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println(String.format("%nIngrese el nombre del indice %d", i));
            String nuevoValor = sc.next();
            nombres.add(nuevoValor);

            int tamañoActual = nombres.size();
            System.out.println(String.format("El tamaño actual del arrayList nombres es de: %d", tamañoActual));
        }

        sc.nextLine();
        System.out.println("\n ---------- Ejercicio 4: Acceso por Índice ----------\n");
        // Recupera e imprime el primer, el central y el último elemento de un ArrayList de 5 posiciones usando .get().

        String valorInicial = nombres.getFirst();
        String valorCentral = nombres.get(nombres.size()/2);
        String valorFinal = nombres.getLast();

        System.out.println(String.format("El valor inicial actual es de: %s" +
                "El valor central actual es de: %s" +
                "El valor final actual es de: %s", valorInicial, valorCentral, valorFinal));

        System.out.println("\n ---------- Ejercicio 5: Inserción Posicional ----------\n");
        // Crea una lista con 3 elementos y utiliza add(1, "Nuevo") para insertar una cadena en la segunda posición
        // sin borrar las existentes.

        ArrayList<String> notas = new ArrayList<>(3);

        notas.add(1, "Nuevo");

        System.out.println("El nuevo valor del indice 1 es: " + notas.get(1));

        System.out.println("\n ---------- Ejercicio 6: Actualización de Datos ----------\n");
        // Sustituye el valor del segundo elemento de una lista mediante el método .set() e imprime la lista antes
        // y después de la modificación.

        sc.nextLine();
        System.out.println("\n ---------- Ejercicio 7: Comprobación de Búsqueda ----------\n");
        // Utiliza .contains() para verificar si una lista de elementos contiene una palabra clave dada e imprime
        // un mensaje en consecuencia.

        sc.nextLine();
        System.out.println("\n ---------- Ejercicio 8: Eliminación por Posición y Objeto ----------\n");
        // Crea una lista con 4 frutas. Elimina una por su índice numérico con remove(int) y otra por su nombre
        // con remove(Object).

        sc.nextLine();
        System.out.println("\n ---------- Ejercicio 9: Vaciado de Lista ----------\n");
        // Verifica si una lista está vacía con .isEmpty(), vacíala utilizando el método .clear() y confirma que su
        // tamaño ha pasado a ser 0.


        System.out.println("\n ---------- Ejercicio 10: Traspaso de Array a ArrayList ----------\n");
        // Declara un array estático con 3 números enteros. Crea un ArrayList e inserta manualmente cada uno de los
        // elementos del array estático dentro de la lista dinámica.

    }
}
