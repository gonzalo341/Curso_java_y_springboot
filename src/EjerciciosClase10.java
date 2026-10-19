import java.util.*;

public class EjerciciosClase10 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // El Bucle for Clásico

//        for (int index = 0; index < 5; index++) {
//            System.out.println("Hola, Java");
//        }

        // =======================================================================
        // Recorrido Tradicional de Estructuras con for
//        String[] names = {"Bruno", "Massa", "MassaDev"};

        // Recorrido dinámico ajustado a la longitud de la estructura
//        for (int index = 0; index < names.length; index++) {
//            System.out.println(names[index]);
//        }

        // =======================================================================
        // El Bucle for-each (Recorrido Simplificado)

        // Recorrido en Arrays y Listas (ArrayList)
//        String[] names = {"Bruno", "Massa", "MassaDev"};
//
//
//        for (String name : names) {
//            System.out.println(name);
//        }

        // Recorrido en Conjuntos (HashSet)
//        var numbers = new HashSet<Integer>();
//        numbers.add(1);
//        numbers.add(2);
//        numbers.add(3);
//
//
//        for (Integer number : numbers) {
//            System.out.println(number);
//        }

        // Recorrido en Mapas (HashMap)
//        var emails = new HashMap<String, String>();
//        emails.put("bruno", "bruno@gmail.com");
//        emails.put("massa", "massa@gmail.com");
//
//
//        for (Map.Entry<String, String> entry : emails.entrySet()) {
//            System.out.println("Usuario: " + entry.getKey() + " | Email: " + entry.getValue());
//        }

        // =======================================================================
        // Bucles Condicionales: while y do-while
        // While
//        int index = 0;
//
//
//        while (index < 5) {
//            System.out.println(index);
//            index++; // Actualización requerida para evitar un bucle infinito
//        }

        // do-while
//        int index = 0;
//
//        do {
//            System.out.println("Ejecución garantizada");
//            index++;
//        } while (index < 0); // La condición es falsa, pero se ejecutó una vez


        // =======================================================================
        // Control de Ciclos: break y continue

        // =======================================================================

        System.out.println("\n ---------- Ejercicio 1: Conteo Ascendente ----------\n");
        // Imprime los números enteros del 1 al 10 utilizando un bucle while.
        int contador = 0;

        while (contador <= 10) {
            System.out.println(contador);
            contador++;
        }

        System.out.println("\n ---------- Ejercicio 2: Salida con Garantía ----------\n");
        // Usa una estructura do-while para recorrer y mostrar todos los elementos de un ArrayList de cadenas.
        ArrayList<String> modelo = new ArrayList<>();

        contador = 0; // Reiniciar el contador

        modelo.add("Lenovo ThinkPad");
        modelo.add("Lenovo IdeaPad");
        modelo.add("Dell Inspiron");
        modelo.add("Apple MacBook Air");
        modelo.add("HP Stream");
        modelo.add("ASUS Vivobook");

        System.out.println("Recorrer ArrayList con do-while:\n");
        do {
            System.out.println(modelo.get(contador));
            contador++;
        } while (contador < modelo.size());

        System.out.println("\n ---------- Ejercicio 3: Múltiplos con Paso Compuesto ----------\n");
        // Diseña un bucle for que imprima los múltiplos de 5 desde el 5 hasta el 50 modificando el contador
        // con += 5.

        contador = 1;

        for (int i = 5; i < 50; i += 5) {
            System.out.println("5 x " + contador + " = " + i);
            contador++;
        }

        System.out.println("\n ---------- Ejercicio 4: Acumulación y Suma ----------\n");
        // Declara un array de 5 números enteros y calcula e imprime la suma total de sus valores recorriéndolo
        // con un bucle.

        int[] suma = {8, 2, 34, 46, 14};
        int resultadoFinal = 0;

        for (int i = 0; i < suma.length; i++) {
            System.out.println(resultadoFinal + " + " + suma[i] + " = " + (resultadoFinal + suma[i]));
            resultadoFinal += suma[i];
        }

        System.out.println("\nEl resultado final es: " + resultadoFinal);

        System.out.println("\n ---------- Ejercicio 5: Recorrido Tradicional ----------\n");
        // Recorre un array estático utilizando un bucle for clásico por índice apoyándote en .length.

        for (int i = 0; i < suma.length; i++) {
            System.out.println("Valor " + i + ": " + suma[i]);
        }

        System.out.println("\n ---------- Ejercicio 6: Iteración de Conjuntos ----------\n");
        // Crea un HashSet con nombres de ciudades y recórrelo de principio a fin mediante un bucle for-each.

        contador = 0;

        HashSet<String> ciudades = new HashSet<>();

        ciudades.add("Mendoza");
        ciudades.add("San Juan");
        ciudades.add("San Luis");
        ciudades.add("Neuquen");

        System.out.println("Recorrer HashSet con for-each\n");
        for (String ciudad : ciudades) {
            System.out.println("Valor del indice " + contador + ":  " + ciudad);
            contador++;
        }

        System.out.println("\n ---------- Ejercicio 7: Lectura Completa de Mapas ----------\n");
        // Declara un HashMap de usuarios y correos electrónicos, y muestra por consola cada par clave-valor
        // utilizando for-each y .entrySet().

        HashMap<String, String> usuarios = new HashMap<>();

        usuarios.put("Pepe", "Pepe123@gmail.com");
        usuarios.put("Jose", "Tester345@gmail.com");
        usuarios.put("Juan", "Admin1@gmail.com");

        for (Map.Entry<String, String> usuario : usuarios.entrySet()) {
            System.out.println("Usuario: " + usuario.getKey() + "   |   " + "Correo: " + usuario.getValue());
        }

        System.out.println("\n ---------- Ejercicio 8: Conteo Regresivo ----------\n");
        // Imprime los números del 10 al 1 en orden descendente utilizando un bucle for con decremento (--).

        System.out.println("Conteo del 10 al 1:");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        System.out.println("\n ---------- Ejercicio 9: Filtrado con continue ----------\n");
        // Recorre los números del 1 al 20 y utiliza la instrucción continue para omitir e impedir la impresión de
        // los múltiplos de 3.

        System.out.println("imprime del 1 al 20 saltándose los múltiplos de 3:");
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) {
                System.out.println("-");
                continue;
            } else {
                System.out.println(i);
            }

        }

        System.out.println("\n ---------- Ejercicio 10: Interrupción Temprana con break ----------\n");
        // Recorre un array de números enteros que contenga valores positivos y negativos, y utiliza break para
        // detener el bucle en cuanto se detecte el primer número negativo.

        int[] listaDeNumeros = {1, 56, 43, 25, -5 , 45 , 64 , -67, -45};
        boolean esPositivo = true;

        System.out.println("Recorrer array de numeros hasta que sea negativo:\n");
        for (int i = 0; i < listaDeNumeros.length; i++) {
            if (listaDeNumeros[i] < 0) {
                System.out.println("\nSe detuvo el bucle debido a que el numero '" + listaDeNumeros[i] + "' es negativo");
                break;
            } else {
                System.out.println(listaDeNumeros[i]);
            }
        }
    }
}