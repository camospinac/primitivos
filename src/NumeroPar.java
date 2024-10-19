// Número par o impar: Determina si un número entero es par o impar usando el operador módulo.

import java.util.Scanner;
public class NumeroPar {
    public static void main(String[] args) throws Exception{
        int num;
        var scanner = new Scanner(System.in);
        System.out.println("Por favor digite el numero: ");
        num = Integer.parseInt(scanner.nextLine());
        var par =  (num%2 == 0) ? "El numero es par" : "El numero es impar";
        System.out.println(par);
    }
}
