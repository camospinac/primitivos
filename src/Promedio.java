// 4) Promedio de tres números: Escribe un programa que acepte tres números enteros y calcule su promedio.
import java.util.Scanner;
public class Promedio {
    public static void main(String[] args) throws Exception{
        double num1, num2, num3, resultado;
        var nume1 = new Scanner(System.in);
        System.out.println("Por favor digite el primer numero: ");
        num1 = Double.parseDouble(nume1.nextLine());
        var nume2 =  new Scanner(System.in);
        System.out.println("Por favor digite el segundo numero: ");
        num2 = Double.parseDouble(nume2.nextLine());
        var nume3 = new Scanner(System.in);
        System.out.println("Por favor digite el tercer numero: ");
        num3 = Double.parseDouble(nume3.nextLine());
        resultado = (num1 + num2 + num3 ) / 3;
        System.out.println("El promedio de los numeros ingresados es: " + resultado);
    }

}
