// Operaciones combinadas: Calcula el resultado de la expresión (a + b) * (c - d) / e, donde a, b, c, d y e 
// son números proporcionados por el usuario.

import java.util.Scanner;
public class OpCombinadas {
    public static void main(String[] args) throws Exception{
        double a, b, c, d, e, resultado;
        var scanner = new Scanner(System.in);
        System.out.println("Ingrese el valor de a: ");
        a = Double.parseDouble(scanner.nextLine());
        System.out.println("Ingrese el valor de b: ");
        b = Double.parseDouble(scanner.nextLine());
        System.out.println("Ingrese el valor de c: ");
        c = Double.parseDouble(scanner.nextLine());
        System.out.println("Ingrese el valor de d: ");
        d = Double.parseDouble(scanner.nextLine());
        System.out.println("Ingrese el valor de e: ");
        e = Double.parseDouble(scanner.nextLine());
        // (a + b) * (c - d) / e
        resultado = (a + b) * (c - d) / e;
        System.out.println("El resultado es: " + resultado);
    }
}
