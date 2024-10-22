// Fibonacci: Implementa un programa que genere los primeros n números de la serie de Fibonacci, 
// donde n es proporcionado por el usuario.


import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) throws Exception{
        int num;
        int antes = 0;
        int fibonacci = 0;
        int despues = 1;
        var scanner = new Scanner(System.in);
        System.out.println("Digite hasta donde quiere ver el numero fibonacci: ");
        num = Integer.parseInt(scanner.nextLine());

        if (num == 0 || num == 1) {
            System.out.println("1");
        }else{
            for ( int cont = 0;  cont < num-1 ; cont++){
                fibonacci = antes + despues;
                antes = despues;
                despues = fibonacci;
                System.out.print(fibonacci + ",");
            }
        }
    }
}
