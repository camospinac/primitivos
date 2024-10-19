// Calificaciones: Dado un número entre 0 y 100 que representa una calificación, muestra un mensaje indicando 
// si es una calificación aprobatoria (>=60) o no, usando una sentencia if-else.
import java.util.Scanner;
public class Calificacion {
    public static void main(String[] args) throws Exception{
        int calificacion;
        var scanner = new Scanner(System.in);
        System.out.println("Escriba su calificacion: ");
        calificacion = Integer.parseInt(scanner.nextLine());
        var aprueba = ( calificacion >= 60 ) ? "Aprobó" : "Desaprobó";
        System.out.println(aprueba);
    }
}
