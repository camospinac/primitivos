// Calculadora con switch: Implementa una calculadora simple que realice suma, resta, multiplicación y división 
// según la operación que el usuario elija, usando switch.
import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) throws Exception{
        int option;
        double resultado, num1, num2;
        var scanner = new Scanner(System.in);
        System.out.println("Por favor digite el primer numero: ");
        num1 = Double.parseDouble(scanner.nextLine());
        System.out.println("Por favor digite el segundo numero: ");
        num2 = Double.parseDouble(scanner.nextLine());
        System.out.println("Por favor digite unas de las siguientes opciones\n1) Suma\n2)Resta\n3)Multiplicación\n4)División");
        option = Integer.parseInt(scanner.nextLine());
        switch (option) {
            case 1:
                resultado = num1 + num2;
                System.out.println("La suma de los numeros ingresados es " + resultado);
                break;
            case 2:
                resultado = num1 - num2;
                System.out.println("La resta de los numeros ingresados es " + resultado);
            case 3:
                resultado = num1 * num2;
                System.out.println("La multiplicacion de los numeros ingresados es " + resultado);
            case 4:
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("La division de los numeros ingresados es " + resultado);
                } else{
                    System.out.println("La division por cero no es posible, error...");
                }
        }
    }
}
