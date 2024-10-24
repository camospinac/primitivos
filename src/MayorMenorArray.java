
import java.util.Scanner;

public class MayorMenorArray {
    public static void main(String[] args) throws Exception {
        var scanner = new Scanner(System.in);
        int auxMy = 0, auxMn = 0, largo = 0;
        System.out.print("Por favor digite el largo del array: ");
        largo = Integer.parseInt(scanner.nextLine());
        int[] enteros = new int[largo];
        for (int i = 0; i < largo; i++) {
            System.out.println("Inserte el dato [" + (i + 1) + "]");
            enteros[i] = Integer.parseInt(scanner.nextLine());
        }
        auxMy = enteros[0];
        auxMn = enteros[0];
        for (int i = 0; i < largo; i++) {
            if (enteros[i] > auxMy) {
                auxMy = enteros[i];
            }else if (enteros[i] < auxMn) {
                auxMn = enteros[i];
            }
        }
        System.out.print("El numero mayor del array es: " + auxMy);
        System.out.println("\nEl numero menor del array es: " + auxMn);
    }
}
