// Cálculo del perímetro y área de un rectángulo: Pide al usuario que ingrese el largo y el ancho de un rectángulo, 
// luego calcula y muestra el área y el perímetro.
import java.util.Scanner;
public class PerimetroRect {
    public static void main(String[] args)  throws Exception{
        double perim, area;
        int largo, ancho;
        var scanner = new Scanner(System.in);
        System.out.println("Por favor digite el largo del rectangulo: ");
        largo = Integer.parseInt(scanner.nextLine());
        System.out.println("Por favor digite el ancho del rectangulo: ");
        ancho = Integer.parseInt(scanner.nextLine());
        perim = 2*(largo+ancho);
        area =  largo*ancho;
        System.out.println("\nEl perimetro es: " + perim + "\nEl area es: " + area);
    }
}
