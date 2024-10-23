
import java.util.Scanner;

public class SepararParesImpares {
    public static void main(String[] args) throws Exception {
        var scanner = new Scanner(System.in);
        int largo = 0;
        System.out.print("Digite la longitud del array: ");
        largo = Integer.parseInt(scanner.nextLine());
        int[] numeros = new int[largo];
        for (int i = 0; i < largo; i++) {
            System.out.print("Por favor digite el dato [" + (i + 1) + "]: ");
            numeros[i] = Integer.parseInt(scanner.nextLine());
        }
        int[] pares = new int[largo];
        int[] impares = new int[largo];
        for (int i = 0; i < largo; i++) {
            if (numeros[i] % 2 == 0) {
                pares[i] = numeros[i];
            }
        }
        for (int i = 0; i < largo; i++){
            if (numeros[i] % 2 != 0) {
                impares[i] = numeros[i];
            }
        }
        System.out.println("\nNumeros pares: ");
        for (int i = 0; i < largo; i++) {
            if (pares[i] > 0) {
                System.out.print(pares[i] + " ");
            }
        }
        System.out.println("\nNumeros impares: ");
        for (int i = 0; i < largo; i++){
            if (impares[i] > 0) {
                System.out.print(impares[i] + " ");
            }
        }

    }
}
