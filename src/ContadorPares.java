// Contador de números pares: Utiliza un ciclo for para contar cuántos números pares hay entre 1 y 100.

import java.util.Scanner;

public class ContadorPares {
    public static void main(String[] args) throws Exception {
        int max, flag;
        flag = 1;
        var scanner = new Scanner(System.in);
        System.out.println("Por favor digite un numero entre el 1 y 200...");
        max = Integer.parseInt(scanner.nextLine());

        if (max >= 1 && max <= 200) {
            for (var cont = 1; cont < max; cont++) {
                if (cont % 2 == 0) {
                    flag++;
                    System.out.println("\nNumero: " + cont);
                    continue;
                }
            }
        } else {
            System.out.println("Por favor era un numero entre 1 y 200. El numero ingresado fue " + max);
        }
        System.out.println("\nLa cantidad total de numeros pares en ese rango es de " + flag);
    }
}
