import java.util.Scanner;
import java.util.Random;

public class EjerciciosClase16 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // =============================================================================================================
        // Practica de Debug:
//        var divider = 5;
//        int resultado = 10 / divider; // BreakPoint con Ctrl + F8
//
//        System.out.println("El resultado de la division es: " + resultado);
//
//        resultado = resultado + 5;
//
//        System.out.println("El resultado de la suma al resultado es: " + resultado);

        // =============================================================================================================
        //                                              Ejercicios
        // =============================================================================================================
        System.out.println("\n ---------- Ejercicio 1: Uso de Breakpoints Básicos ----------\n");
        // Coloca un Breakpoint al inicio de un bucle for de 10 iteraciones y avanza paso a paso con F8 observando cómo
        // cambia el contador i en el panel de variables.

        for (int i = 0; i <= 10; i++) {
            System.out.println("Vuelta numero: " + i);
        }

        // =============================================================================================================
        System.out.println("\n ---------- Ejercicio 2: Navegación con Step Into ----------\n");
        // Crea un metodo calculateTax(double amount) e invócalo desde main. Usa F7 (Step Into) para entrar a inspeccionar
        // la ejecución interna del metodo.

        System.out.println("Ingrese el monto base en decimal: ");
        double montoBase = sc.nextDouble();

        double resultadoDeCalculateTax= calculateTax(montoBase);

        System.out.println("El resultado es: " + resultadoDeCalculateTax);
//        // =============================================================================================================
//        System.out.println("\n ---------- Ejercicio 3: Punto de Interrupción Condicional ----------\n");
//        // En un bucle que recorra los números del 1 al 100, configura un Breakpoint condicional que solo se active cuando
//        // la variable sea exactamente igual a 75.
//        // =============================================================================================================
//        System.out.println("\n ---------- Ejercicio 4: Evaluación de Expresiones (Alt + F8) ----------\n");
//        // Pausa la ejecución en medio de la lectura de un String y utiliza la ventana Evaluate Expression para probar
//        // los métodos .toUpperCase() y .length() en tiempo real.
//        // =============================================================================================================
//        System.out.println("\n ---------- Ejercicio 5: Rastreo de NullPointerException ----------\n");
//        // Escribe una clase donde un objeto sea nulo intencionalmente. Ejecuta el programa con el depurador para identificar
//        // la línea exacta que origina el fallo observando la pila de llamadas (Call Stack).
//        // =============================================================================================================
//        System.out.println("\n ---------- Ejercicio 6: Refactorización de Nombres (Shift + F6) ----------\n");
//        //Toma un ejercicio previo con variables mal nombradas (ej. int a, String s) y utiliza el atajo de refactorización
//        // de IntelliJ para renombrarlas con nombres descriptivos.
//        // =============================================================================================================
//        System.out.println("\n ---------- Ejercicio 7: Extracción de Métodos (Ctrl + Alt + M) ----------\n");
//        // Escribe un bloque largo dentro de main con operaciones matemáticas y extrae la lógica hacia un metodo
//        // independiente usando la herramienta de extracción del IDE.
//        // =============================================================================================================
//        System.out.println("\n ---------- Ejercicio 8: Depuración de un ArrayList ----------\n");
//        // Llena un ArrayList<String> con 5 nombres, pausa la ejecución con un Breakpoint al iterarlo con un bucle for-each
//        // e inspecciona los elementos internos de la lista en el panel Variables.
//        // =============================================================================================================
//        System.out.println("\n ---------- Ejercicio 9: Detección de Bucle Infinito ----------\n");
//        // Escribe un bucle while cuya condición de parada tenga un error lógico, ejecútalo en modo Debug y utiliza el
//        // botón de pausa/stop para congelar la ejecución y descubrir por qué no termina.
//        // =============================================================================================================
//        System.out.println("\n ---------- Ejercicio 10: Auditoría de Código Limpio ----------\n");
//        // Toma una clase previa del curso, elimina comentarios obsoletos, aplica la guía de estilo de nombres, dale
//        // formato automático al archivo (Ctrl + Alt + L) e inspecciona que no queden advertencias en el margen derecho
//        // de IntelliJ IDEA.
    }

    public static double calculateTax(double montoIngresado){
        double impuestoBase = 0.5;

        if (montoIngresado >= 1000) {
            impuestoBase += 0.5;
        }

        double finalTax = montoIngresado * impuestoBase;
        return finalTax;
    }
}
