// Suma de números positivos: Pide al usuario que ingrese números hasta que ingrese uno negativo. Luego, 
// muestra la suma de los números positivos ingresados.
import java.util.Scanner;
public class SumaPositivos {
    public static void main(String[] args) throws Exception{
        int num;
        int aux = 0;
        var scanner = new Scanner(System.in);
        do {
            System.out.println("Por favor digite un numero entero positivo y cuando quiera parar un numero negativo...");
            num = Integer.parseInt(scanner.nextLine());
            if (num > 0 ) {
                aux = aux + num;
            } else {
                System.out.println("Se ha detenido, acontinuación el resultado...");
            }
        } while (num > 0);
        System.out.println("La suma de los numero enteros fue: " + aux);
    }
}
