// Operaciones básicas: Escribe un programa que realice las operaciones aritméticas 
// (suma, resta, multiplicación, división) entre dos números enteros.
import java.util.Scanner;
public class OpBasicas {
    public static void main(String[] args) throws Exception{
        int num1, num2;
        double suma, resta, multiplicacion, division;
        var scanner = new Scanner(System.in);
        System.out.println("Por favor digite el primer numero entero: ");
        num1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Digite el segundo numero entero: ");
        num2 = Integer.parseInt(scanner.nextLine());
        suma = num1 + num2;
        resta = num1 - num2;
        multiplicacion = num1 * num2;
        division = num1 / num2;
        System.out.println("\nEl resultado de las operaciones fueron:\nSuma: " + suma + "\nResta: " + resta 
        + "\nMultiplicacion: " + multiplicacion + "\nDivision: " + division);
    }
}
