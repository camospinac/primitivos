//Invertir un número: Dado un número entero positivo, invierte su valor (por ejemplo, 123 se convierte en 321).

import java.util.Scanner;
public class InvertirNumero {
    public static void main(String[] args) throws Exception{
        int num, largo, aux2, aux1;
        int i = 0;
        String numeroTexto;
        String valorInvertido = "";
        var scanner = new Scanner(System.in);
        System.out.println("Por favor digite un numero: ");
        numeroTexto = scanner.nextLine();
        largo = numeroTexto.length();
        num = Integer.parseInt(numeroTexto);
        while (i < largo) {
            aux1 =  num % 10;
            aux2 = num / 10;
            num = aux2;
            valorInvertido += String.valueOf(aux1);
            i++;
        }
        System.out.println("El numero invertido es " + valorInvertido);
    }

}
