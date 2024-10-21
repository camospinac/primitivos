// Números primos: Escribe un programa que verifique si un número es primo.

import java.util.Scanner;
public class NumeroPrimo {
    public static void main(String[] args) throws Exception{
        int  num, raiz;
        boolean flag =  false;
        var scanner = new Scanner(System.in);
        System.out.println("Por favor digite un numero: ");
        num = Integer.parseInt(scanner.nextLine());
        raiz = (int)Math.sqrt(num);
        for ( int cont = 2;  cont <= raiz ; cont++){
            if (num % cont == 0) {
                System.out.println("El numero no es primo");
                flag =  true;
                continue;
            }
        }
        if (!flag) System.out.println("El numero es primo");
    }
}
