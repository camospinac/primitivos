
// Ejercicios

// 1) Declaración de variables: Declara variables de tipo int, double, y char. Asigna valores y muestra los resultados 
// por consola.
// 2) Conversión de tipos: Escribe un programa que convierta una variable de tipo int a double y otra de double a int, 
// y muestre los valores por consola.

public class ConversionTipos {
    public static void main(String[] args)  throws Exception{
        // Declaracion de variables
        int entero = 45;
        double doble = 45.66D;
        float flotante = 4.2F;
        char letra = 'H';

        System.out.println("Imprimiendo el numero entero: " + entero);
        System.out.println("Imprimiendo el numero double: " + doble);
        System.out.println("Imprimiendo el numero flotante: " + flotante);
        System.out.println("Imprimiendo la letra char: " + letra);

        //Conversion de tipos
        int enteroConv = 1983487;
        double dobleConv = 784.323D;
        System.out.println("Entero antes de conversion: " + enteroConv);
        System.out.println("Double antes de conversion: " + dobleConv);
        double d = (double)enteroConv;
        int i = (int)dobleConv;
        System.out.println("Entero a double: " + d);
        System.out.println("Double a entero: " + i);
    }
}
