// Mayor de tres números: Escribe un programa que acepte tres números y muestre cuál es el mayor.
import java.util.Scanner;
public class MayorNumero {
    public static void main(String[] args) throws Exception{
        int num1, num2, num3;
        var scanner = new Scanner(System.in);
        System.out.println("Digita el primer numero: ");
        num1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Ingrese el segundo numero: ");
        num2 = Integer.parseInt(scanner.nextLine());
        System.out.println("Ingrese el tercer numero: ");
        num3 = Integer.parseInt(scanner.nextLine());
        if (num1 > num2 && num1 > num3) {
            System.out.println("El numero mayor es " + num1);
        } else if(num2 > num1 && num2 > num3){
            System.out.println("El numero mayor es " + num2);
        } else if (num3 > num1 && num3 > num2){
            System.out.println("El numero mayor es " + num3);
        }
    }
}
