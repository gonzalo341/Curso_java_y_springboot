import java.util.Scanner;

public class EjerciciosClase6 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        //Datos
//        int age = 37;
//
//        //Estructura condicional simple
//        if (age >= 18) {
//            System.out.println("El usuario es mayor de edad");
//        }
//
//        age = 17;
//
//        if (age >= 18) {
//            System.out.println("El usuario es mayor de edad");
//        } else {
//            System.out.println("El usuario es menor de edad");
//        }
//
//        age = 18;
//
//        if (age > 18) {
//            System.out.println("El usuario es mayor de edad");
//        } else if (age == 18) {
//            System.out.println("El usuario acaba de cumplir 18 años");
//        } else {
//            System.out.println("El usuario es menor de edad");
//        }
//
//        //Datos
//        int day = 2;
//
//        switch (day) {
//            case 1:
//                System.out.println("Lunes");
//                break;
//            case 2:
//                System.out.println("Martes");
//                break;
//            case 3:
//                System.out.println("Miércoles");
//                break;
//            case 4:
//                System.out.println("Jueves");
//                break;
//            case 5:
//                System.out.println("Viernes");
//                break;
//            case 6:
//                System.out.println("Sabado");
//                break;
//            case 7:
//                System.out.println("Domingo");
//                break;
//            default:
//                System.out.println("No es un dia de la semana");
//        }

        System.out.println("\n ---------- Ejercicio 1: Elegibilidad de Voto ----------");
        // Define una variable de edad y muestra por pantalla si el usuario está capacitado
        // para votar (edad mayor o igual a 18).

        int age = 18;

        if (age >= 18) {
            System.out.println("El usuario esta capacitado para votar.");
        } else {
            System.out.println("El usuario aun no puede votar.");
        }

        System.out.println("\n ---------- Ejercicio 2: Comparación de Dos Números ----------");
        // Declara dos variables numéricas e indica mediante un condicional cuál de los dos
        // es mayor, o si ambos son idénticos.

        // Datos
        int primerVariable = 24;
        int segundaVariable = 56;

        System.out.println(String.format("La primer variable es: %d\nLa segunda variable es: %d\n", primerVariable, segundaVariable));

        if (primerVariable > segundaVariable) {
            System.out.println(String.format("La primer variable (%d) es mayor.", primerVariable));
        } else if (primerVariable < segundaVariable) {
            System.out.println(String.format("La segunda variable (%d) es mayor.", segundaVariable));
        } else {
            System.out.println("Ambas variables son iguales.");
        }

        System.out.println("\n ---------- Ejercicio 3: Signo Numérico ----------");
        // Dado un número, verifica y muestra si su valor es positivo, negativo o exactamente cero.

        primerVariable = sc.nextInt();

        if (primerVariable > 0) {
            System.out.println(String.format("%d es positivo", primerVariable));
        } else if (primerVariable < 0) {
            System.out.println(String.format("%d es negativo.", primerVariable));
        } else {
            System.out.println("La variable es igual a 0");
        }

        System.out.println("\n ---------- Ejercicio 4: Par o Impar ----------");
        //  Crea un programa que determine si un número entero dado es par o impar
        //  utilizando el operador de módulo (%).

        primerVariable = sc.nextInt();

        if (primerVariable % 2 == 0) {
            System.out.println(String.format("El numero %d es par.", primerVariable));
        } else {
            System.out.println(String.format("El numero %d es un numero impar", primerVariable));
        }

        System.out.println("\n ---------- Ejercicio 5: Verificación de Rango ---------");
        // Comprueba si un número se encuentra dentro del rango comprendido entre 1 y 100
        // utilizando operadores lógicos.

        primerVariable = sc.nextInt();

        if (primerVariable >= 0 && primerVariable <= 100) {
            System.out.println(String.format("El numero %d está en el rango entre 0 y 100", primerVariable));
        } else {
            System.out.println("El numero esta fuera del rango establecido.");
        }

        System.out.println("\n ---------- Ejercicio 6: Días de la Semana (switch) ----------");
        // Declara una variable entera del 1 al 7 y muestra el nombre del día de la semana
        // correspondiente usando la estructura switch.

        System.out.println("Eliga un numero entre 1 y 7:");
        int variablePorConsola = sc.nextInt();

        switch (variablePorConsola) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("No es un dia de la semana");
        }

        System.out.println("\n ---------- Ejercicio 7: Sistema de Calificaciones ----------");
        // Escribe un programa que transforme una nota del 0 al 100 en un rango cualitativo
        // (ej. "Suspenso", "Aprobado" o "Sobresaliente") mediante else if.

        System.out.println("Ingrese la nota (entre 0 y 100):");
        int nota = sc.nextInt();

        if (nota >= 65 && nota <= 75) {
            System.out.println("Suspenso");
        } else if (nota > 75 && nota <= 85) {
            System.out.println("Aprobado");
        } else if (nota > 85 && nota <= 100) {
            System.out.println("Sobresaliente");
        } else {
            System.out.println("Desaprobado o fuera de rango");
        }

        System.out.println("\n ---------- Ejercicio 8: Control de Acceso al Cine ----------");
        // Determina si una persona puede ingresar al cine sabiendo que la regla exige tener al menos
        // 15 años o ir acompañado por un adulto (utilizando operadores condicionales y el operador ||).

        System.out.println("Edad de la persona:");
        age = sc.nextInt();

        System.out.println("Esta acompañado por un adulto (true o false)?:");
        boolean acompañadoPorAdulto = sc.nextBoolean();

        if (age >= 15 || acompañadoPorAdulto == true) {
            System.out.println("Puede entrar al cine.");
        } else {
            System.out.println("No puede entrar al cine.");
        }

        System.out.println("\n ---------- Ejercicio 9: Vocal o Consonante ----------");
        // Evalúa si una variable de tipo carácter (char) corresponde a una vocal o a una consonante.

        char character = 'A';

        if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u' || character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U') {
            System.out.println(character + " es vocal");
        } else {
            System.out.println(character + " es consonante");
        }

        System.out.println("\n ---------- Ejercicio 10: El Mayor de Tres Números ----------");
        // Dadas tres variables distintas (a, b, c), diseña una estructura condicional que identifique y
        // muestre por pantalla cuál de las tres almacena el valor más grande.

        primerVariable = 25;
        segundaVariable = -104;
        int tercerVariable = 45;

        System.out.println(String.format("_ La primer variable es: %d\n_ La segunda variable es : %d\n_ La tercer variable es: %d\n", primerVariable, segundaVariable, tercerVariable));

        if (primerVariable > segundaVariable && primerVariable > tercerVariable) {
            System.out.println(String.format("La primer variable (%d) es mayor", primerVariable));
        } else if (segundaVariable > primerVariable && segundaVariable > tercerVariable) {
            System.out.println(String.format("La segunda variable (%d) es mayor", segundaVariable));
        } else {
            System.out.println(String.format("La tercer variable (%d) es mayor", tercerVariable));
        }
    }
}
