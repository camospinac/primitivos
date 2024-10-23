
import java.util.Scanner;
public class PromedioNotasArreglos {
    public static void main(String[] args) throws Exception{
        // FORMA 1 SENCILLA SIN ARREGLOS
        var scanner = new Scanner(System.in);
        int cantNotas = 0;
        double nota = 0;
        double aux = 0;
        double prom = 0;
        System.out.print("Ingrese la cantidad de notas a calcular: ");
        cantNotas = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < cantNotas; i++){
            System.out.print("Digite la nota #" + (i+1) + " por favor: ");
            nota = Integer.parseInt(scanner.nextLine());
            aux =  aux + nota;
        }
        prom = aux / cantNotas;
        System.out.print("El promedio de las notas ingresadas es: " + prom);

        // FORMA 2 CON ARREGLOS
        int largoArray = 0;
        double auxx = 0;
        double promx = 0;

        System.out.print("\nIngrese la cantidad de notas a calcular: ");
        largoArray = Integer.parseInt(scanner.nextLine());
        double [] notas = new double[largoArray];

        for (int j = 0; j < largoArray; j++){
            System.out.print("Por favor digite la nota [" + (j+1) + "]: ");
            notas[j] = Double.parseDouble(scanner.nextLine());
        }
        for (int j = 0; j < largoArray; j++){
            auxx = auxx + notas[j];
        }
        promx = auxx / largoArray;
        System.out.print("EL promedio de las notas ingresadas es: " + promx);

    }
}
