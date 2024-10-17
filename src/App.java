import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        //formas de declarar variables tipo dato, luego nombre y asignación

        //Tipo primitivos enteros

        //Byte
        byte numeroByte = 57;
        System.out.println("\nNumero byte: " + numeroByte);
        System.out.println("Valor minimo byte: " + Byte.MIN_VALUE);
        System.out.println("Valor maximo byte: " + Byte.MAX_VALUE + "\n");

        //Short

        short numeroShort = 784;
        System.out.println("Numero short: " + numeroShort);
        System.out.println("Valor minimo short: " + Short.MIN_VALUE);
        System.out.println("Valor maximo short: " + Short.MAX_VALUE + "\n");

        // Int

        int numeroInt = 9843883;
        System.out.println("Numero int: " + numeroInt);
        System.out.println("Valor minimo int: " + Integer.MIN_VALUE);
        System.out.println("Valor maximo int: " + Integer.MAX_VALUE + "\n");

        //long

        long numeroLong = 329482949;
        System.out.println("Numero long: " + numeroLong);
        System.out.println("Valor minimo long: " + Long.MIN_VALUE);
        System.out.println("Valor maximo long: " + Long.MAX_VALUE + "\n");


        //Tipos primitivos float

        float numeroFloat = 38.843F;
        System.out.println("Numero flotante: " + numeroFloat);
        System.out.println("Valor minimo flotante: " + Float.MIN_VALUE);
        System.out.println("Valor maximo flotante: " + Float.MAX_VALUE + "\n");

        double numeroDouble = 8743.82378D;
        System.out.println("Valor double: " + numeroDouble);
        System.out.println("Valor minimo double: " + Double.MIN_VALUE);
        System.out.println("Valor maximo double: " + Double.MAX_VALUE + "\n");

        //Uso de la palabra reservada var

        var pruebaNumInt = 8843;
        System.out.println("Valor variable var int: " + pruebaNumInt);

        var pruebaNumDouble = 7438.838D;
        System.out.println("Valor variable var double: " + pruebaNumDouble);

        var pruebaNumFloat = 843.32F;
        System.out.println("Valor variable var float: " + pruebaNumFloat + "\n");

        // Tipos char

        char letra = 'A';
        System.out.println("Una letra: "+ letra);

        char simboloCode = '\u0025';
        System.out.println("Simbolo mediante codigo: " + simboloCode);

        char simboloDecimal = 37;
        System.out.println("Simbolo mediante decimal: " + simboloDecimal);

        char simboloDirecto = '%';
        System.out.println("Simbolo directo: " + simboloDirecto + "\n");

        //Varchar

        var letraVar = 'A';
        System.out.println("Una letra var: "+ letraVar);

        var simboloCodeVar = '\u0025';
        System.out.println("Simbolo mediante codigo var: " + simboloCodeVar);

        var simboloDecimalVar = (char)37;
        System.out.println("Simbolo mediante decimal var: " + simboloDecimalVar);

        var simboloDirectoVar = '%';
        System.out.println("Simbolo directo var: " + simboloDirectoVar + "\n");

        // Tipos Boolean

        boolean flagTrue = false;
        System.out.println("Valor variable flag: " + flagTrue);

        if (flagTrue) {
            System.out.println("Entro por el condicional true.... \n");
        }else {
            System.out.println("Entro por condicional false..... \n");
        }

        var edad = 75;
        //var esMayor = edad >= 18;
        System.out.println("La edad ingresada es: " + edad);
        if (edad >= 18) {
            System.out.println("La edad " + edad + " ya es mayor de edad.... \n");
        }else {
            System.out.println("La edad " + edad + " es menor de edad..... \n");
        }
        
        //Conversion de tipos de varchar a int

        var edad2 = Integer.parseInt("84");
        System.out.println("Edad mas uno: " + (edad2 + 1));

        var edad3 = "32";
        System.out.println("Edad concatenada: "+ (edad3 + 12) + "\n");


        //Pidiendo datos por consola

        var pedirEdad =  new Scanner(System.in);
        System.out.println("Por favor digita tu edad: ");
        edad2 = Integer.parseInt(pedirEdad.nextLine());

        System.out.println("Valor variable edad2: " + edad2);

        if (edad2 >= 18) {
            System.out.println("La edad " + edad2 + " ya es mayor de edad.... \n");
        }else {
            System.out.println("La edad " + edad2 + " es menor de edad..... \n");
        }
        
    }
}
