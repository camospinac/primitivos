// 3) Área de un círculo: Declara una variable de tipo double para el radio de un círculo y calcula su área (π * radio^2).

import java.util.Scanner;
public class AreaCirculo {
    public static void main(String[] args)  throws Exception{
        double pi =  3.14D;
        double resultado;
        double radio;
        var pedirRadio = new Scanner (System.in);
        System.out.println("Hola por favor ingresa el area del circulo: ");
        radio = Double.parseDouble(pedirRadio.nextLine());
        resultado = (pi * (radio)*(radio));
        System.out.println("El area del circulo segun el radio ingresado es: " + resultado);
    }
}
