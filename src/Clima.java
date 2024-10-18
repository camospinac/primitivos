import java.util.Scanner;

public class Clima {
    public static void main(String[] args) throws Exception {
        
        int mes;
        var pedirMes = new Scanner(System.in);
        System.out.println("\nHola!, escribe el número del mes: ");
        mes = Integer.parseInt(pedirMes.nextLine());
        
        if (mes >= 1 && mes <= 3) {
            System.out.println("La estación climatica es invierno...");
        }
        else if (mes >=4 && mes <=6){
            System.out.println("La estación del año es primavera....");
        }
        else if(mes >=7 && mes <=9){
            System.out.println("La estación del año es verano....");
        }
        else if (mes >=10 && mes <=12){
            System.out.println("La estación del año es otoño...");
        }else{
            System.out.println("Ingrese un mes valido....");
        }
    }

}
