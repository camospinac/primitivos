import java.util.Scanner;

public class ClimaSwitch {
    public static void main(String[] args) throws Exception {

        int mes;
        var pedirMes = new Scanner(System.in);
        System.out.println("\nHola!, escribe el número del mes: ");
        mes = Integer.parseInt(pedirMes.nextLine());

        switch (mes) {
            case 1: case 2: case 3:
                System.out.println("La estación climatica es invierno...");
                break;
            case 4: case 5: case 6: 
                System.out.println("La estación climatica es primavera...");
                break;
            case 7: case 8: case 9:
                System.out.println("La estación climatica es verano...");
                break;
            case 10: case 11: case 12:
                System.out.println("La estación climatica es otoño...");
                break;
            default:
                System.out.println("Ingrese un mes valido por favor....");
                break;
        }
    }
}
