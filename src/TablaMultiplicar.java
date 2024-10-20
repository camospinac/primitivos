// Tablas de multiplicar: Escribe un programa que muestre la tabla de multiplicar de un número ingresado por el usuario,
// utilizando un ciclo for.

import java.util.Scanner;
public class TablaMultiplicar {
    public static void main(String[] args) throws Exception{
        int tabla, hasta;
        var scanner = new Scanner(System.in);
        System.out.println("Por favor digite el numero que quiere saber las tablas: ");
        tabla = Integer.parseInt(scanner.nextLine());
        System.out.println("Por favor digite hasta que numero desea saber (numero mayor a 1 e inferior a 30 por favor): ");
        hasta = Integer.parseInt(scanner.nextLine());
        if (hasta <= 30) {
            System.out.println("El resultado es\n");
            for (var cont = 1; cont <= hasta; cont++) {
                System.out.println(tabla + " x " + cont + " = " + tabla*cont);
            }
        } else {
            System.out.println("Por favor el limite era un numero mayor a 1 e inferior a 30....");
        }
    }
}
