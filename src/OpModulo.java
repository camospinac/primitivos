// Operadores módulo: Escribe un programa que acepte dos enteros y muestre el resto de su división.
import java.util.Scanner;
public class OpModulo {
    public static void main(String[] args)  throws Exception{
        double modulo;
        int num1, num2;
        var scanner = new Scanner(System.in);
        System.out.println("Por favor digite el primer numero: ");
        num1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Por favor digite el segundo numero: ");
        num2 = Integer.parseInt(scanner.nextLine());
        modulo = num1%num2;
        System.out.println("El resto de la division de los 2 numeros fue: " + modulo);
    }
}
