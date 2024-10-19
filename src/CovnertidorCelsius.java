// 5) Temperatura en Celsius a Fahrenheit: Convierte una temperatura en grados Celsius a Fahrenheit usando 
// la fórmula F = C * 9/5 + 32.
import java.util.Scanner;
public class CovnertidorCelsius {
    public static void main(String[] args) throws Exception{
        double celsius, resultado;
        var temp = new Scanner(System.in);
        System.out.println("Por favor ingrese la temperatura celsius a convertir: ");
        celsius = Double.parseDouble(temp.nextLine());
        resultado = (celsius * 9/5) + 32;
        System.out.println(celsius + " Celsius en Farenheit es: " + resultado);
    }
}
