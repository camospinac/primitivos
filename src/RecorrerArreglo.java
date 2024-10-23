
import java.util.Scanner;
public class RecorrerArreglo {
    public static void main(String[] args) throws Exception{
        int largo = 0;
        var scanner = new Scanner(System.in);
        System.out.print("Hola, proporciona el largo del arreglo: ");
        largo = Integer.parseInt(scanner.nextLine());

        int [] enteros2 = new int [largo];

        for (int i = 0; i < largo; i++){
            System.out.println("Por favor digita el dato ["+ (i+1) +"], por favor...");
            enteros2[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Los datos ingresados fueron\n");
        for ( int i = 0;  i < enteros2.length ; i++){
            System.out.println("Dato"+ (i + 1) + " = "+enteros2[i]);
        }
        // var enteros = new int [] {100, 200, 300, 400, 500};
    }
}
