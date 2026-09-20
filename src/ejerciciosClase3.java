public class ejerciciosClase3 {
    static void main() {
        //Ejercicio 1
        /*
        String nombre = "Gonzalo";
        int edad = 26;
        double altura = 1.72;
        char inicial = 'G';
        boolean estudiante = true;

        System.out.println("Nombre: " + nombre); //Imprime nombre por consola
        System.out.println("Edad: "+ edad); //imprime la edad por consola
        System.out.println("Altura: "+ altura); //imprime la altura por consola
        System.out.println("Inicial: " + inicial); //imprime la inicial por consola
        System.out.println("Es estudiante?: "+ estudiante); //imprime si es estudiante por consola
        */

        //Ejercicio 2 - Modificar variables ya inicializadas.
        /*
        nombre = "Miguel";
        System.out.println("Nombre: "+ nombre);
        inicial = 'M';
        System.out.println("Inicial: "+ inicial);
        edad = 30;
        System.out.println("Edad: "+ edad);
        altura = 1.80;
        System.out.println("Altura: "+ altura);
        estudiante = false;
        System.out.println("Es estudiante?: "+ estudiante);
        */
        /*
        //Ejercicio 3 - Error al cambiar el tipo de dato
        int edad = 26;
        edad = "26";

        System.out.println("Edad: "+edad);
        */

        //Ejercicio 4 - Inferencias de tipos con Var
        /*
        var nombre = "Gonzalo";
        var edad = 26;
        var altura = 1.72;
        var inicial = 'G';
        var estudiante = true;

        System.out.println("Nombre: " + nombre); //Imprime nombre por consola
        System.out.println("Edad: "+ edad); //imprime la edad por consola
        System.out.println("Altura: "+ altura); //imprime la altura por consola
        System.out.println("Inicial: " + inicial); //imprime la inicial por consola
        System.out.println("Es estudiante?: "+ estudiante); //imprime si es estudiante por consola
        */

        //Ejercicio 5 - Variables y constantes
        /*
        //datos:
        double precio = 1000;
        final double IVA = 0.21; //Constantes se definen en mayusculas

        double montoIVA = precio * IVA;
        double precioFinal = precio + montoIVA;

        System.out.println("El precio es de: $" + precio);
        System.out.println("El IVA es de: $" + montoIVA);
        System.out.println("Precio final: $" + precioFinal);
        */

        //Ejercicio 6 - byte, int, long
        /*
        byte edad = 28;
        int stock = 540;
        long cantidadDeHabitantes = 8000000000L; //Lleva siempre L al final

        System.out.println("Edad: " + edad);
        System.out.println("Stock actual: " + stock);
        System.out.println("Cantidad de personas: " + cantidadDeHabitantes);

         */

        //Ejercicio 7 - double y float
        /*
        double precio = 19.99;
        float temp= 32.4f; //se usa f al final para saber que es float

        System.out.println("Precio: $" + precio);
        System.out.println("Temperatura: " + temp + "ºC");
         */

        //Ejercicio 8 - char y String
        /*
        char inicial = 'H';
        String texto = "Hola";

        System.out.println("Inicial: " + inicial);
        System.out.println("Texto: "+ texto);

        // inicial = "J"; //Si se usa comillas dobles para un char ocurre un error
        // texto = 'Hola'; //Lo mismo ocurre si se usa comillas simples para un string
         */
        /*
        String nombre = "Juan Perez .";

        System.out.println("Cantidad de letras" + nombre.length());
        System.out.println("Mayuscula: " + nombre.toUpperCase());
        System.out.println("Minuscula: " + nombre.toLowerCase());
        System.out.println("Caracter: " + nombre.charAt(0));
        System.out.println("Combrobar si contiene: " + nombre.contains("u"));
        System.out.println("Remplazar una parte del texto: " + nombre.replace("Perez", "Sanchez"));
        System.out.println("Eliminar espacios al principio y final: [" + nombre.trim() + "]");
        String segundoNombre = "Juan Perez";

        System.out.println("¿Son iguales?: " + nombre.equals(segundoNombre));
        */

        //Ejercicio 9
        String producto = "Notebook";
        String marca = "Lenovo";
        int stock = 15;
        long codigo = 9876543210L;
        byte descuento = 10;
        double precio = 850000.50;
        float peso = 1.75f;
        char categoria = 'T';
        boolean disponible = true;
        var garantia = 12;
        final double IVA = 0.21;

        double montoIVA = precio * IVA;
        double precioConIVA = precio + montoIVA;
        double montoDescuento = precioConIVA * descuento / 100;
        double precioFinal = precioConIVA - montoDescuento;

        System.out.println("\nPRODUCTO:");
        System.out.println("Producto: " + producto);
        System.out.println("Marca: " + marca);
        System.out.println("Código: " + codigo);
        System.out.println("Stock: " + stock);
        System.out.println("Descuento: " + descuento + "%");
        System.out.println("Precio: $" + precio);
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Categoría: " + categoria);
        System.out.println("Disponible: " + disponible);
        System.out.println("Garantía: " + garantia + " meses");

        System.out.println("--------------------------------------");

        System.out.println("IVA: $" + montoIVA);
        System.out.println("Precio mas IVA: $" + precioConIVA);
        System.out.println("Descuento: $" + montoDescuento);
        System.out.println("Precio final: $" + precioFinal);

    }
}
