public class ejerciciosClase4 {
    static void main(String[] args) {
//        int a = 5;
//        int b = 2;
//        double c = (a+b)/20;
//        float d = (a+b)/20f;
//
//        System.out.println("La suma entre a y b es:             " + (a + b)); // Suma: 8
//        System.out.println("La Resta entre a y b es:            " + (a - b)); // Resta: 2
//        System.out.println("La Multiplicación entre a y b es:   " + (a * b)); // Multiplicación: 15
//        System.out.println("La División entre a y b es:         " + (a / b)); // División entera: 1
//        System.out.println("El Módulo (resto) entre a y b es:   " + (a % b)); // Módulo (resto): 2
//
//        System.out.println("--------------------------------------");

//        System.out.println(c);
//        System.out.println(d);
//
//        System.out.println("La División entre a y b es:         " + (c / d));
//
//        System.out.println("--------------------------------------");

//        int a = 6;
//
//        a += 1; // Equivalente a: a = a + 1; (Resultado: 7)
//        System.out.println(a);
//        a -= 1; // Equivalente a: a = a - 1; (Resultado: 6)
//        System.out.println(a);
//        a *= 2; // Equivalente a: a = a * 2; (Resultado: 12)
//        System.out.println(a);
//        a /= 2; // Equivalente a: a = a / 2; (Resultado: 6)
//        System.out.println(a);
//        a %= 2; // Equivalente a: a = a % 2; (Resultado: 0)
//        System.out.println(a);

//        System.out.println("--------------------------------------");
//
//        System.out.println("El resultadoOr de la suma es: " + (a+=1));
//        System.out.println("El resultadoOr de la resta es: " + (a-=1));
//        System.out.println("El resultadoOr de la multiplicacion es: " + (a*=2));
//        System.out.println("El resultadoOr de la division es: " + (a/=2));
//        System.out.println("El resultadoOr del resto es: " + (a%=2));

//        System.out.println("--------------------------------------");

//        String a = "0";
//        String b = "3";
//
//        System.out.println("Tiene la misma longitud?: " + (a.length() == b.length()));

//        System.out.println(a == b); // Igualdad: false
//        System.out.println(a != b); // Desigualdad: true
//        System.out.println(a > b);  // Mayor que: false
//        System.out.println(a >= b); // Mayor o igual que: false
//        System.out.println(a < b);  // Menor que: true
//        System.out.println(a <= b); // Menor o igual que: true

        //        System.out.println("--------------------------------------");

//        // Ejemplo con expresiones: (3 > 2) es verdadero, pero (5 == 2) es falso.
//        boolean resultAnd = (3 > 2) && (5 == 2); // Devuelve: false
//
//        // Ejemplo con expresiones: (3 > 2) es verdadero.
//        boolean resultOr = (3 > 2) || (5 == 2); // Devuelve: true
//
//        boolean isTrue = true;
//        System.out.println(!isTrue); // Devuelve: false
//        System.out.println(!(3 > 2)); // (3 > 2) es true, al negarlo devuelve: false
//
//        int b = 3;
//
////      Comportamiento Prefijo (++b)
//        System.out.println("Prefijo ++b:        " + (++b)); // Incrementa b a 4 Y LUEGO lo imprime por pantalla: 4
//
//
////      Comportamiento Postfijo (b++)
//        int c = 3;
//        System.out.println("Postfijo c++:       " + c++); // Imprime el valor actual (3) Y LUEGO incrementa c a 4 en memoria
//        System.out.println("Valor de c:         " + c);   // En la siguiente línea, c ya vale: 4
//
//        System.out.println("Resultado de AND:   " + resultAnd);
//        System.out.println("Resultado de OR:    " + resultOr);

//      ----------------------------------------------------------------------------------------------------------------
//      Ejercicios
        System.out.println(" ---------- Ejercicio 1 ----------");

        // Variables enteras o float
        int a = 5;
        float b = 4f;

        // Variables independientes:
        float suma = a + b;
        float resta = a - b;
        float multiplicacion = a * b;
        float division = a / b;
        float modulo = a % b;

        // Resultados por consola:
        System.out.println("El valor de 'a' es: " + a);
        System.out.println("El valor de 'b' es: " + b);
        System.out.println("----------------------------------");
        System.out.println("La suma de a + b: " + suma);
        System.out.println("La resta de a - b es: "  + resta);
        System.out.println("La multiplicacion de a * b: " + multiplicacion);
        System.out.println("La division de a * b: " + division);
        System.out.println("La modulo de a * b: " + modulo);

        System.out.println("\n ---------- Ejercicio 2 ----------");
        // Variable inicial:
        float c = 3.5f;

        c += 1;
        System.out.println("El valor actual de c al usar += es: " + c);
        c -= 1;
        System.out.println("El valor actual de c al usar -= es: " + c);
        c *= 2;
        System.out.println("El valor actual de c al usar *= es: " + c);
        c /= 2;
        System.out.println("El valor actual de c al usar /= es: " + c);

        System.out.println("\n ---------- Ejercicio 3 ----------");

        // Booleanos verdaderos
        boolean comparacionVerdadera1 = (18 > 15);
        boolean comparacionVerdadera2 = (18 == 18);
        boolean comparacionVerdadera3 = (18 <= 24);

        // Vista por consola:
        System.out.println("18 es mayor que 15?: " + comparacionVerdadera1);
        System.out.println("18 es igual que 18?: " + comparacionVerdadera2);
        System.out.println("18 es menor o igual que 24?: " + comparacionVerdadera3);

        System.out.println("\n ---------- Ejercicio 4 ----------");

        boolean comparacionFalsa1 = (18 >= 24);
        boolean comparacionFalsa2 = (18 != 18);
        boolean comparacionFalsa3 = (18 < 15);

        // Vista por consola:
        System.out.println("18 es mayor o igual que 24?: " + comparacionFalsa1);
        System.out.println("18 es distinto que 18?: " + comparacionFalsa2);
        System.out.println("18 es menor que 15?: " + comparacionFalsa3);

        System.out.println("\n ---------- Ejercicio 5 ----------");

        System.out.println("El valor de 'a' es: " + a);

        boolean enRango = (a > 0) && (a < 10);

        System.out.println("El valor de 'a' esta entre 0 y 10?: " + enRango);

        System.out.println("\n ---------- Ejercicio 6 ----------");

        boolean tienesMercadoPago = true;
        boolean tienesEfectivo = false;

        boolean resultadoOr = (tienesMercadoPago || tienesEfectivo);
        System.out.println("Puedes pagar?:  " + resultadoOr);

        System.out.println("\n ---------- Ejercicio 7 ----------");

        System.out.println("El valor de 'a' esta entre 0 y 10?: " + !enRango);
        System.out.println("puedes pagar?:  " + !resultadoOr);

        System.out.println("\n ---------- Ejercicio 8 ----------");

        System.out.println("Valor inicial:  " + a);
        System.out.println("Prefijo (++x):  " + ++a);
        System.out.println("Postfijo (x++)  " + a++);
        System.out.println("Valor final:    " + a);

        System.out.println("\n ---------- Ejercicio 9 ----------");
        // Division entera y flotante:
        int divisionEntera = 7/2;
        float divisionflotante = 7f/2;

        // Resultados por consola:
        System.out.println("El resultado de 7 / 2 es: " + divisionEntera);
        System.out.println("El resultado de 7.0 / 2 es: " + divisionflotante);

        System.out.println("\n ---------- Ejercicio 10 ----------");

        int d = 6;
        int e = 4;

        boolean expresionCombinada = ((d + e) > 0) && ((d % e) == 0);
        System.out.println("El resultado de la expresion combinada (d + e) > 0 && (d % e) == 0 es: " + expresionCombinada);
        System.out.println("Primera parte: (d + e) es: " + (d + e) + " y " + (d + e) + " es mayor que 0?: " + ((d + e) > 0));
        System.out.println("Segunda parte: (d % e) es: " + (d % e) + " y " + (d % e) + " es igual que 0?: " + ((d%e)==0));
    }
}
