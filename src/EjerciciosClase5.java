public class EjerciciosClase5 {
    static void main(String[] args) {
        // Declarar variables
        String name = "Rosita";
        String surname = new String("Perez");

        String fullName = name + " " + surname;
        System.out.println(fullName);

        name = "Manuela";
        System.out.println(name.length());

        surname = "Gonzalez";
        System.out.println(surname.charAt(4));

        // extraer el ultimo caracter de la cadena de texto
        System.out.println(surname.charAt(surname.length()-1));

        // Extraer cadena de texto de la variable
        System.out.println(name.substring(3));
        System.out.println(surname.substring(2,6));

        // Cambiar la cadena de texto por mayusculas y minusculas
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        // Verifica si la cadena de texto contiene un string
        System.out.println("\n ---------- Busqueda con contains() ----------");
        String text = "Hola Java";
        System.out.println(text.contains("Java")); // true
        System.out.println(text.contains("java")); // false

        System.out.println("\n ---------- Comparacion equals() / equalsIgnoreCase ----------");
        String name1 = "Manuela";
        String name2 = "MANUELA";

        System.out.println("equals(): " + name1.equals(name2));
        System.out.println("equalsIgnoreCase(): " + name1.equalsIgnoreCase(name2));

        System.out.println("\n ---------- Comparacion == para comparar textos ----------");

        name2 = "Manuela";
        String name3 = new String("Manuela");

        System.out.println(name1 == name2);
        System.out.println(name1 == name3);
        System.out.println(name1.equals(name3));

        System.out.println("\n ---------- Recorte de espacios trim() ----------");

        String input = "  hola me llamo Gonzalo  ";
        System.out.println(input.trim());
        String input2 = "        holaaaaa    ddfdf dfddf s ";
        System.out.println(input2);

        System.out.println("\n ---------- reemplazar con replace() ----------");

        System.out.println(input.replace("Gonzalo", "Agustina")); // "Hola me llamo Agustina"
        System.out.println(input.replace(" ", "-"));

        System.out.println("\n ---------- Formateo dinamico (String.format()) ----------");

        System.out.println(name);
        int age = 27;
        double height = 1.77f;

        String result = String.format("Hola, me llamo %s, tengo %d años y mido  %.2f metros ", name, age, height);
        System.out.println(result);

        System.out.println("\n ---------- Práctica: 10 Retos de Manipulación de Strings ----------");

        System.out.println("\n ---------- Ejercicio 1: Concatenación manual ----------");
        // Crea dos variables con tu nombre y apellido e imprímelas unidas en una sola línea
        // con un espacio intermedio.

        String miName = "Gonzalo";
        String miSurname = "Centeno";

        System.out.println("Nombre completo: " + miName + " " + miSurname);

        System.out.println("\n ---------- Ejercicio 2: Cálculo de longitud ----------");
        // Muestra por pantalla el número total de caracteres de una frase introducida.

        System.out.println("Cantidad de caracteres: " + (miName + " " + surname).length());

        System.out.println("\n ---------- Ejercicio 3: Extremos de un texto ----------");
        // Escribe un programa que imprima únicamente el primer y el último carácter
        // de una cadena de texto dada.

        System.out.println("Primer caracter del nombre: " + miName.charAt(0));
        System.out.println("Ultimo caracter del nombre: " + miName.charAt(miName.length()-1));

        System.out.println("\n ---------- Ejercicio 4: Conversión de caja ----------");
        // Convierte una frase completa a mayúsculas y luego a minúsculas imprimiendo ambos resultados.

        System.out.println(("Hola, " + miName + " " + miSurname).toUpperCase());
        System.out.println(("Hola, " + miName + " " + miSurname).toLowerCase());

        System.out.println("\n ---------- Ejercicio 5: Búsqueda de palabras ----------");
        // Comprueba mediante código si una cadena de texto contiene una palabra clave específica.

        System.out.println(miName + " ¿Contiene 'za'" + "?: " + miName.contains("za"));

        System.out.println("\n ---------- Ejercicio 6: Formateo con enteros ----------");
        // Construye una frase utilizando String.format() que incorpore un texto y un número entero.

        int miAge = 26;

        System.out.println(String.format("Hola, me llamo %s %s y tengo %d años", miName, miSurname, miAge));

        System.out.println("\n ---------- Ejercicio 7: Limpieza de entradas ----------");
        // Crea una cadena de texto rodeada de espacios en blanco al inicio y final, y muestra
        // el resultado limpio tras aplicar .trim().

        text = "       Activar Windows: ve a configuracion para activar Windows.     ";

        System.out.println("Cadena de texto con espacios: " + text);
        System.out.println("Cadena de texto sin espacios: " + text.trim());

        System.out.println("\n ---------- Ejercicio 8: Reemplazo de caracteres ----------");
        // Toma una frase e intercambia todos sus espacios en blanco por guiones medios (-).

        String textSinEspacios = text.trim();
        System.out.println(textSinEspacios.replace(" ", "-"));

        System.out.println("\n ---------- Ejercicio 9: Comparación de contenido ----------");
        // Crea dos variables de texto con diferencias de caja (mayúsculas/minúsculas) y
        // evalúa si son iguales utilizando .equals() y .equalsIgnoreCase().

        String textComp = "ACTIVAR WINDOWS: Ve a configuracion para activar Windows.";

        System.out.println("Comparar:\n_ " + textSinEspacios + "\n_ "+ textComp);
        System.out.println("Comparar con equals(): " + textSinEspacios.equals(textComp));
        System.out.println("Comparar con equalsIgnoreCase():" + textSinEspacios.equalsIgnoreCase(textComp));

        System.out.println("\n ---------- Ejercicio 10: Comparación de longitud ----------");
        // Escribe un programa que compare dos cadenas de texto distintas e indique si ambas
        // poseen exactamente la misma longitud.

        String textCompLength = "Comparación de longitud";

        int lengthText1 = textSinEspacios.length();
        int lengthText2 = textCompLength.length();

        System.out.println(lengthText1);
        System.out.println(lengthText2);

        System.out.println("Tienen la misma longitud?: " + (lengthText1 == lengthText2));
    }
}
