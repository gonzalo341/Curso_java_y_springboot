import java.util.*;

public class EjerciciosClase9 {
    static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

//        cars.add(0, "Mazda"); // Insert element at the beginning of the list (0)
//
        System.out.println(cars);
//        System.out.println("Indice 0: " + cars.get(0));
//
//        cars.set(0, "Opel");
//        System.out.println(cars);
//        System.out.println("Indice 0: " + cars.get(0));
//
//        cars.remove(0);
//        System.out.println("remove(0): " + cars);
//
//        System.out.println("Tamaño actual: " + cars.size());
//        cars.clear();
//        System.out.println("Tamaño actual despues de .clear(): " +cars.size());
//
//        cars.add("Volvo");
//        cars.add("BMW");
//        cars.add("Ford");
//        cars.add("Mazda");
//        for (int i = 0; i < cars.size(); i++) {
//            System.out.println(cars.get(i));
//        }

//        for (String i : cars) {
//            System.out.println(i);
//        }

        /*
         * Los elementos de un ArrayList son en realidad objetos. En los ejemplos anteriores, creamos elementos
         * (objetos) de tipo "String". Recuerda que un Stringen Java es un objeto (no un tipo primitivo). Para
         * usar otros tipos, como int, debes especificar una clase contenedora equivalente : Integer. Para otros
         * tipos primitivos, usa: Booleanpara boolean, Characterpara char, Doublepara double, etc.:
         *  */

//        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
//        myNumbers.add(10);
//        myNumbers.add(15);
//        myNumbers.add(20);
//        myNumbers.add(25);
//        for (int i : myNumbers) {
//            System.out.println(i);
//        }
//
//        // Ordenar un ArrayList
//        Collections.sort(cars);  // sort()método para ordenar listas alfabéticamente o numéricamente:
//        for (String i : cars) {
//            System.out.println(i);
//        }
//
//        // Ordenar un ArrayList en orden inverso
//        Collections.sort(cars, Collections.reverseOrder()); // Sort cars
//
//        for (String i : cars) {
//            System.out.println(i);
//        }
//
//        // Ordenar un ArrayList de enteros
//        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
//        myNumbers.add(33);
//        myNumbers.add(15);
//        myNumbers.add(20);
//        myNumbers.add(34);
//        myNumbers.add(8);
//        myNumbers.add(12);
//
//        Collections.sort(myNumbers);  // Sort myNumbers
//
//        for (int i : myNumbers) {
//            System.out.println(i);
//        }
//
//        Collections.sort(myNumbers, Collections.reverseOrder()); // Sort myNumbers
//
//        for (int i : myNumbers) {
//            System.out.println(i);
//        }
//
//        // Declara un ArrayList usando var
//        // Without var
//        ArrayList<String> nombres = new ArrayList<String>();
//
//        // With var
//        var nombresVar = new ArrayList<String>();
//
//
//        // =======================================================================
//
//        HashSet<String> cars = new HashSet<String>();
//        cars.add("Volvo");
//        cars.add("BMW");
//        cars.add("Ford");
//        cars.add("BMW");  // Duplicate
//        cars.add("Mazda");
//        System.out.println(cars);
//
//        // =======================================================================
//
//        // Create an ArrayList of Strings
//        ArrayList<String> cars = new ArrayList<String>();
//        cars.add("Volvo");
//        cars.add("BMW");
//        cars.add("Ford");
//        cars.add("Mazda");
//
//        // Get an iterator for the ArrayList
//        Iterator<String> it = cars.iterator();
//
//        // Iterate through the list using the iterator
//        while (it.hasNext()) {
//            System.out.println(it.next());
//        }
//
//        // =======================================================================
        // Ejercicios de practica

        Scanner sc = new Scanner(System.in);
        // Práctica: 10 Retos Integradores con HashSet y HashMap
        // Para afianzar el dominio de colecciones dinámicas y almacenamiento de pares clave-valor, se plantean los
        // siguientes retos prácticos

        System.out.println("\n ---------- Ejercicio 1: Detección de Duplicados en Sets ----------\n");
        // Crea un HashSet con dos valores de texto distintos. A continuación, intenta agregar uno repetido y otro
        // nuevo, e imprime el tamaño final para comprobar cómo actúa el conjunto
        HashSet<String> provincia = new HashSet<>();

        provincia.add("Mendoza");
        provincia.add("San Juan");

        provincia.add("Mendoza"); // Valor repetido
        provincia.add("Formosa");

        System.out.println("El tamaño del HashSet es de: " + provincia.size());

        System.out.println("\n ---------- Ejercicio 2: Eliminación en Conjuntos ----------\n");
        // Inserta tres nombres de ciudades en un HashSet y elimina una de ellas directamente por su nombre usando el
        // método .remove()

        provincia.remove("San Juan");
        System.out.println("El tamaño del HashSet es de: " + provincia.size());

        System.out.println("\n ---------- Ejercicio 3: Filtrado de Lista a Set ----------\n");
        // Crea un ArrayList con nombres repetidos y traspasa sus datos a un HashSet para obtener una lista limpia de
        // elementos únicos
        ArrayList<String> nombres = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el " + (i+1) + " nombre (Solo texto): ");
            String nombre = sc.nextLine();
            nombres.add(nombre);
        }

        Iterator<String> it = nombres.iterator();
        HashSet<String> nombresSinRepetidos = new HashSet<>();

        while (it.hasNext()) {
            nombresSinRepetidos.add(it.next());
        }

        System.out.println("Los nombres guardados sin repetir son: " + nombresSinRepetidos);

        sc.nextLine();
        System.out.println("\n ---------- Ejercicio 4: Operación de Unión ----------\n");
        // Declara dos HashSet con números enteros y utiliza el método .addAll() para unificar ambos conjuntos en uno
        // solo sin duplicados
        HashSet<Integer> numeros1 = new HashSet<>();
        HashSet<Integer> numeros2 = new HashSet<>();

        numeros1.add(1);
        numeros1.add(10);
        numeros1.add(25);
        numeros1.add(345);
        numeros1.add(64);
        numeros1.add(13);

        numeros2.add(345);
        numeros2.add(64);
        numeros2.add(25);
        numeros2.add(28);
        numeros2.add(35);

        numeros1.addAll(numeros2);

        System.out.println("La lista sin repetir numeros contiene: " + numeros1);

        System.out.println("\n ---------- Ejercicio 5: Intersección de Conjuntos ----------\n");
        // Crea dos HashSet con elementos comunes y utiliza .retainAll() para dejar exclusivamente los datos que
        // compartan ambos conjuntos
        System.out.println("Conjunto 1: " + numeros1);
        System.out.println("Conjunto 2: " + numeros2);

        numeros1.retainAll(numeros2);

        System.out.println("\nLos numeros que comparten ambaos HashSet son: " +  numeros1);

        System.out.println("\n ---------- Ejercicio 6: Directorio de Contactos (HashMap) ----------\n");
        // Crea un HashMap donde la clave sea un nombre (String) y el valor su número de teléfono (Integer). Añade
        // tres contactos y consulta uno mediante .get()
        HashMap<String, String> persona = new HashMap<>();

        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese el nombre de la persona (Solo texto):");
            String nombre = sc.nextLine();

            System.out.println("Ingrese el numero de teléfono de la persona (solo números enteros):");
            String telefono = sc.nextLine();

            persona.put(nombre, telefono);
            sc.nextLine();
        }

        System.out.println("\n¿Cual es el nombre de la persona que desea consultar su numero de teléfono?:");
        String nombreConsultado = sc.nextLine();


        System.out.println(String.format("El numero de teléfono del nombre consultado es: %s", persona.get(nombreConsultado)));

        sc.nextLine();
        System.out.println("\n ---------- Ejercicio 7: Actualización con put ----------\n");
        // Inserta un contacto en un mapa y realiza un .put() con la misma clave pero con un número telefónico
        // diferente, imprimiendo el mapa para verificar cómo se sobrescribe el dato anterior

        System.out.println("Ingrese el nombre de la persona que desea actualizar el numero de contacto (solo texto):");
        String nombreContacto = sc.nextLine();

        System.out.println("Ingrese el nuevo numero de contacto (solo números):");
        String contacto = sc.nextLine();

        persona.put(nombreContacto, contacto);

        System.out.println(String.format("El nuevo numero de %s es: %s",nombreContacto, persona.get(nombreContacto)));

        sc.nextLine();
        System.out.println("\n ---------- Ejercicio 8: Inserción Condicional ----------\n");
        // Utiliza .putIfAbsent() para intentar insertar un contacto existente y comprueba que su valor no se modifique

        persona.putIfAbsent(nombreConsultado, "+54 9 261-457 6345");

        System.out.println(String.format("Intentando registrar el nombre de '%s' con el numero de contacto '%s'.", nombreConsultado, "+54 9 261-457 6345" ));

        if (persona.get(nombreConsultado).equals("+54 9 261-457")) {
            System.out.println("Se agrego el nombre y contacto correctamente");
        } else {
            System.out.println("No se puedo agregar el contacto debido a que ya esta registrado.");
        }

        System.out.println("\n ---------- Ejercicio 9: Eliminación Segura de Entradas ----------\n");
        // Elimina una clave de un mapa mediante .remove() capturando en una variable el valor retornado por el
        // método e imprímelo por consola

        System.out.println(persona.remove(nombreConsultado));

        System.out.println("\n ---------- Ejercicio 10: Reto Complejo (Conversión Total) ----------\n");
        //: Dado un array estático con 4 cadenas de texto, conviértelo paso a paso en un ArrayList, luego en un HashSet
        // para descartar repeticiones y finalmente en un HashMap donde tanto la clave como el valor sean el mismo texto

        String[] provincias = {"Mendoza", "Jujuy", "Mendoza", "Cordoba", "La Rioja", "Cordoba", "Mendoza", "San Juan"};
        ArrayList<String> arrayListProvincias = new ArrayList<>();
        HashSet<String> hashSetProvincias = new HashSet<>();
        HashMap<String, String> hashMapProvincias = new HashMap<>();

        for (int i = 0; i < provincias.length; i++) {
            arrayListProvincias.add(provincias[i]);
            System.out.println(String.format("Se agregó al ArrayList  '%s'",  provincias[i]));
        }

        System.out.println("\nArrayList: " + arrayListProvincias);

        for (int i = 0; i < arrayListProvincias.size(); i++) {
            hashSetProvincias.add(arrayListProvincias.get(i));
        }

        System.out.println("\nHashSet (sin repeticiones): " + hashSetProvincias);

        for (String provincia1 : hashSetProvincias) {
            hashMapProvincias.put(provincia1, provincia1);
        }

        System.out.println("\nHashMap (con clave | valor): " + hashMapProvincias);

    }
}
