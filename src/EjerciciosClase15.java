import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class EjerciciosClase15 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // =============================================================================================================
        //                                              Ejercicios
        // =============================================================================================================
        System.out.println("\n ---------- Ejercicio 1: División Segura ----------\n");
        // Pide dos números enteros al usuario y captura la división entre cero usando un bloque try-catch con ArithmeticException.

        try {
            System.out.println("Ingresa el primer numero entero: ");
            int num1 = sc.nextInt();

            System.out.println("Ingresa el segundo numero entero: ");
            int num2 = sc.nextInt();

            int resultado = num1 / num2;
            System.out.println("El resultado es: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("\n❗❗ Error: No se puede dividir entre cero");
        } catch (InputMismatchException e) {
            System.out.println("\n❗❗ Error: El valor ingresado no es del tipo de valor esperado, por favor ingrese un numero entero");
        } catch (Exception e) {
            System.out.println("\n❗❗ Error: Ingrese números enteros validos");
        }

        sc.nextLine();
        // =============================================================================================================
        System.out.println("\n ---------- Ejercicio 2: Índice de Array ----------\n");
        // Crea un array de 3 elementos e intenta acceder a la posición 5 dentro de un bloque try-catch para capturar ArrayIndexOutOfBoundsException.
        int[] array = {10,5,1};

        System.out.println("La cantidad de valores es de: " + array.length);

        try {
            System.out.println("\nIngresa la posición a la que desea acceder");
            int valor = array[sc.nextInt()];
            System.out.println("El valor es: " + valor);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("\n❗❗ Error: El indice de la posición esta fuera de los limites");
            System.out.println("Mensaje de Error: '" + e.getMessage() + "'");
        }

        sc.nextLine();
        // =============================================================================================================
        System.out.println("\n ---------- Ejercicio 3: Control de Nulos ----------\n");
        // Crea una variable de tipo String asignada a null e intenta invocar el metodo .length() dentro de un bloque try-catch capturando NullPointerException.
        String textoNulo = null;

        try {
            System.out.println("La longitud del texto es de: " + textoNulo.length());
        } catch (NullPointerException e) {
            System.out.println("❗❗ Error: Se intento invocar la longitud de una variable nula");
        }

        // =============================================================================================================
        System.out.println("\n ---------- Ejercicio 4: Conversión Formato de Número ----------\n");
        // Intenta convertir una cadena de texto no numérica (ej. "abc") a un número entero usando Integer.parseInt() y captura la excepción NumberFormatException.

        System.out.println("Por favor, Ingrese una cadena de texto: ");
        String textoNoNumerico = sc.nextLine();

        try {
            System.out.println("Texto original: " + textoNoNumerico);
            int numero = Integer.parseInt(textoNoNumerico);
            System.out.println("\nEl numero es: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("❗❗ Error: No se pudo convertir el texto a numero.");
        } catch (InputMismatchException e) {
            System.out.println("\n❗❗ Error: El valor ingresado no es del tipo de valor esperado, por favor ingrese un string");
        } catch (Exception e) {
            System.out.println("❗❗ Error desconocido");
        }

        sc.nextLine();
        // =============================================================================================================
        System.out.println("\n ---------- Ejercicio 5: Garantía con finally ----------\n");
        // Implementa una lectura de datos simulada donde el bloque finally imprima siempre un mensaje de "Proceso finalizado y recursos liberados".
        String archivoSimulado = "Password.txt";
        boolean error = new Random().nextBoolean();

        try {
            System.out.println("Leyendo el datos del archivo '" + archivoSimulado + "' ...");

            if (error) {
                throw new Exception("\n❗❗ Error: No se pudo leer los datos del archivo '" + archivoSimulado + "'");
            }

            System.out.println("Lectura correcta");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("\nProceso finalizado y recursos liberados");
        }

        // =============================================================================================================
        System.out.println("\n ---------- Ejercicio 6: Lanzamiento Manual con throw ----------\n");
        // Escribe una función validateScore(int score) que lance una excepción IllegalArgumentException si la nota recibida no está entre 0 y 100.

        try {
            System.out.println("Ingrese el porcentaje de nota del alumno: ");
            int nota = sc.nextInt();

            validateScore(nota);
        } catch (IllegalArgumentException e) {
            System.out.println("❗❗ Error: " + e.getMessage());
        }
        catch (InputMismatchException e) {
            System.out.println("\n❗❗ Error: El valor ingresado no es del tipo de valor esperado, por favor ingrese un numero entero");
        }

        sc.nextLine();
        // =============================================================================================================
        System.out.println("\n ---------- Ejercicio 7: Declaración con throws ----------\n");
        // Crea un metodo loadData() que declare en su firma throws Exception y haz que sea invocado desde main dentro de un bloque try-catch.

        try {
            loadData(sc);
        } catch (InputMismatchException e) {
            System.out.println("Datos incorrectos");
        } catch (Exception e) {
            System.out.println("❗❗ Error: " + e.getMessage());
        }

        sc.nextLine();
        // =============================================================================================================
        System.out.println("\n ---------- Ejercicio 8: Múltiples Capturas Especializadas ----------\n");
        // Diseña un bloque try que pueda generar un error matemático o de acceso nulo, utilizando dos bloques catch distintos para dar mensajes de error específicos.
        try {
            int opcion = 0;
            System.out.println("\nEliga el error que desea simular:" +
                    "\n1. Error matemático." +
                    "\n2. Error de acceso nulo.");
            opcion = sc.nextInt();

            if (opcion == 1) {
                int resultado = 2 / 0;

                System.out.println("El resultado es: " + resultado);
            } else if (opcion == 2) {
                textoNulo = null;
                System.out.println("La longitud del texto es: " + textoNulo.length());
            } else {
                System.out.println("No elegiste una opción valida, por favor ingresa un valor valido (1 o 2)");
            }

        } catch (InputMismatchException e) {
            System.out.println("\n❗❗ Error: Tipo de datos incorrectos");
        } catch (ArithmeticException e) {
            System.out.println("\n❗❗ Error: No se puede dividir entre cero");
        } catch (NullPointerException e) {
            System.out.println("\n❗❗ Error: Valor nulo");
        } catch (Exception e) {
            System.out.println("\nError desconocido");
        }

        sc.nextLine();
        // =============================================================================================================
        System.out.println("\n ---------- Ejercicio 9: Excepción Personalizada de Dominio ----------\n");
        // Crea la clase InvalidAgeException heredando de Exception y úsala para validar la edad en un registro de usuarios.

        try {
            System.out.println("Ingrese el nombre de la persona: ");
            String nombreIngresado = sc.nextLine();

            System.out.println("Ingrese la edad de la persona: ");
            int edadIngresada = sc.nextInt();

            validarEdad(edadIngresada);
            System.out.println("Bienvenido '" + nombreIngresado + "'.");
        } catch (InvalidAgeException e) {
            System.out.println("❗❗ Error: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("❗❗ Error: Tipo de datos incorrectos");
        } catch (Exception e) {
            System.out.println("Error desconocido");
        }

        sc.nextLine();
        // =============================================================================================================
        System.out.println("\n ---------- Ejercicio 10: Procesador Bancario Robusto ----------\n");
        // Diseña la clase Account con el metodo withdraw(amount) que lance InsufficientBalanceException cuando no haya
        // saldo suficiente, y captura el error en main mostrando el saldo restante.

        Account cuenta1 = new Account(1000000.50,"juan");

        System.out.println("Saldo disponible: " + cuenta1.getBalance());

        try {
            System.out.println("Ingrese el monto que desea retirar");
            double montoARetirar = sc.nextDouble();

            cuenta1.withDraw(montoARetirar);
        } catch (InputMismatchException e) {
            System.out.println("Tipo de datos incorrectos");
        } catch (InsufficientBalanceException e) {
            System.out.println("Saldo insuficiente");
        } catch (Exception e) {
            System.out.println("Error desconocido");
        }
    }

    public static void validateScore(int score) {
        if (score < 0 || score > 100) {
            throw new IllegalArgumentException("La nota debe estar entre 0 y 100. Valor ingresado: " + score + "%");
        }
        System.out.println("La nota ingresada es valida: " + score + "%");
    }

    public static void loadData(Scanner sc) throws Exception {
        System.out.println("Ingrese el nombre del archivo: ");
        String archivo = sc.nextLine();

        System.out.println("Intentando cargar datos desde: " + archivo);

        if (!archivo.equalsIgnoreCase("config.txt")) {
            throw new Exception("El archivo '" + archivo + "' no existe.");
        }

        System.out.println("Datos cargados correctamente");
    }

    public static void validarEdad(int edad) throws InvalidAgeException {
        if (edad < 0) {
            throw new InvalidAgeException("La edad no puede ser un número negativo (" + edad + ").");
        }
        if (edad <= 18) {
            throw new InvalidAgeException("Acceso denegado. Debes tener 18 años o más para registrarte. Edad ingresada: " + edad);
        }
        System.out.println("Verificando edad...\n¡Edad permitida!");
    }
}