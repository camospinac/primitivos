//Factorial de un número: Calcula el factorial de un número ingresado por el usuario, usando un ciclo while.

import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) throws Exception{
        int numUsuario;
        int cont = 1;
        int aux = 1;
        var scanner = new Scanner(System.in);
        System.out.println("Por favor digita el numero hasta donde desea calcular el factorial: ");
        numUsuario = Integer.parseInt(scanner.nextLine());
        System.out.println("Numero ingresado: " + numUsuario);
        while (numUsuario > cont) {
            aux = aux * cont;
            cont++;
        }
        System.out.println("El resultado es " + aux  * cont);
    }
}
