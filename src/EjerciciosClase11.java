import java.util.ArrayList;
import java.util.Scanner;

public class EjerciciosClase11 {
//    // Declaración con un parámetro de tipo String
//    public static void sendEmailToUser(String email, String name) {
//        System.out.println("Se envía el email a " + name + " (" + email + ")");
//    }

//    // Declaración con tipo de retorno boolean
//    public static boolean sendEmailWithState(String email) {
//        if (email.isEmpty()) {
//            return false; // Interrumpe la ejecución y devuelve false
//        }
//        System.out.println("Se envía el email a " + email);
//        return true; // Devuelve true si el envío fue exitoso
//    }

    // Versión 1: Sin parámetros
    public static void sendEmail() {
        System.out.println("Se envía un email genérico");
    }


    // Versión 2: Sobrecarga con un parámetro de texto
    public static void sendEmail(String email) {
        System.out.println("Se envía el email a " + email);
    }


    // Versión 3: Sobrecarga con dos parámetros de texto
    public static void sendEmail(String email, String name) {
        System.out.println("Se envía el email a " + name + " (" + email + ")");
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        // =======================================================================
//        Invocación respetando el orden de los argumentos
//        sendEmailToUser("brais@gmail.com", "Brais");
//
//        // =======================================================================
//        // Captura del resultado devuelto en una variable booleana
//        boolean state = sendEmailWithState("brais@gmail.com");
//        System.out.println("Resultado del envío: " + state);

        sendEmail(); // Version 1
        sendEmail("Gonzalo"); // Version 2
        sendEmail("Test@gmail.com", "Gonzalo"); // Version 3

        // =======================================================================

//        // =======================================================================
//        // Ejercicios de Practica

        System.out.println("\n ---------- Ejercicio 1: Mensaje de Bienvenida ----------\n");
        // Crea un método void sin parámetros llamado welcome() que imprima por consola el mensaje:
        // "Te doy la bienvenida al curso de Java desde cero".

        Saludar();

        System.out.println("\n ---------- Ejercicio 2: Saludo Personalizado ----------\n");
        // Diseña un método void que reciba un parámetro de tipo String con un nombre y muestre por pantalla
        // un saludo personalizado a esa persona.

        Saludar("Gonzalo", "Centeno");

        System.out.println("\n ---------- Ejercicio 3: Resta de Enteros ----------\n");
        // Escribe un método de tipo int que reciba dos enteros por parámetro y devuelva el resultado de su resta.
        int num1 = 45;
        int num2 = 24;

        int resultadoResta = Restar(num1,num2);

        System.out.println(String.format("El resultado de restar %d - %d es: %s", num1, num2, resultadoResta));

        System.out.println("\n ---------- Ejercicio 4: Cálculo de Cuadrado ----------\n");
        // Diseña un método de tipo int o double que reciba un número numérico y retorne su valor elevado al cuadrado.
        double numElevadoAlCuadrado = 6.5;

        double resultadoElevar = ElevarAlCuadrado(numElevadoAlCuadrado);

        System.out.println("El resultado de elevar al cuadrado " + numElevadoAlCuadrado + " es: " + resultadoElevar);

        System.out.println("\n ---------- Ejercicio 5: Evaluación de Paridad ----------\n");
        // Crea un método con retorno booleano (boolean) que reciba un número entero y devuelva true si es par
        // y false si es impar.

        int numParoImpar = 6;

        boolean resultadoEsParOImpar = EsParOImpar(numParoImpar);

        System.out.println("El numero " + numParoImpar + " es par?: " + resultadoEsParOImpar);

        System.out.println("\n ---------- Ejercicio 6: Verificación de Mayoría de Edad ----------\n");
        // Crea un método que reciba una edad (int) y retorne true si es mayor o igual a 18 años y false en
        // caso contrario.

        int edad = 16;
        boolean esMayorDeEdad = esMayor(edad);

        ImprimirEdad(edad, esMayorDeEdad);

        System.out.println("\n ---------- Ejercicio 7: Longitud de Cadena ----------\n");
        // Diseña un método que reciba una cadena de texto (String) y devuelva un entero (int) representando su
        // cantidad de caracteres usando .length().
        String textoIngresado = "Hola mundo";

        int cantDeCaracteres = ContarCaracteres(textoIngresado);

        System.out.println("El texto ingresado '" + textoIngresado + "' tiene : " + cantDeCaracteres + " caracteres.");

        System.out.println("\n ---------- Ejercicio 8: Promedio de Array ----------\n");
        // Escribe un método que reciba un array de números enteros, calcule la suma de sus elementos y devuelva la
        // nota o valor medio en un decimal (double).

        double[] notas = {7, 8.5, 9, 10, 7.75};

        double promedio = SacarPromedio(notas);

        System.out.println("El promedio de las notas ingresadas es de: " + promedio);

        System.out.println("\n ---------- Ejercicio 9: Cálculo de Factorial ----------\n");
        // Diseña un método que reciba un entero positivo y devuelva su factorial (el producto de todos los números
        // enteros positivos desde 1 hasta dicho número).

        System.out.println("Ingrese un numero positivo entero: ");
        int numPositivo = sc.nextInt();

        int factorial = CalcularFactorial(numPositivo);

        System.out.println("El factorial de " + numPositivo + " es: " + factorial);

        sc.nextLine();
        System.out.println("\n ---------- Ejercicio 10: Recorrido de Lista Dinámica ----------\n");
        // Crea un método que reciba como parámetro un ArrayList<String> y utilice un bucle for-each para imprimir
        // individualmente cada uno de sus elementos en consola.

        ArrayList<String> listaDePalabras = new ArrayList<>();
        String palabraIngresada = "";
        do {
            System.out.println("Ingrese una palabra (no ingrese ningún valor para salir):");
            palabraIngresada = sc.nextLine();
            if (palabraIngresada.equals("")) {
                continue;
            }

        } while (palabraIngresada.equals(""));
        listaDePalabras.add("hola");
        listaDePalabras.add("mundo");
        listaDePalabras.add("de");
        listaDePalabras.add("java");


        System.out.println(listaDePalabras);
    }

    public static void Saludar(){
        System.out.println("Te doy la bienvenida al curso de Java desde cero");
    }

    public static void Saludar(String name, String surname) {
    System.out.println(String.format("Te doy la bienvenida %s %s al curso de Java desde cero", name, surname));
    }

    public static int Restar(int num1,int num2) {
        return num1 - num2;
    }

    public static double ElevarAlCuadrado (double num) {
        return num * num;
    }

    public static boolean EsParOImpar(int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean esMayor(int edadIngresada) {
        if (edadIngresada >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public static void ImprimirEdad(int edadIngresada, boolean esMayor){
        if (esMayor) {
            System.out.println("Tiene " + edadIngresada + " y si es mayor de edad.");
        } else {
            System.out.println("Tiene " + edadIngresada + " y es menor de edad.");
        }
    }

    public static int ContarCaracteres(String textoIngresado) {
        return textoIngresado.length();
    }

    public static double SacarPromedio(double[] notasIngresadas) {
        double promedio = 0;
        double sumNotas = 0;

        for (int i = 0; i < notasIngresadas.length; i++) {
            sumNotas = sumNotas + notasIngresadas[i];
        }

        promedio = sumNotas / (notasIngresadas.length);

        return promedio;
    }

    public static int CalcularFactorial(int numIngresado) {
        int resultado = 1;

        for (int i = 1; i <= numIngresado; i++) {
            resultado = resultado * i;
        }
        return resultado;
    }
}
