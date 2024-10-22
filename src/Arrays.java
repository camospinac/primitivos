public class Arrays {
    public static void main(String[] args) throws Exception{
        //Declaracion de arreglos
        int [] enteros;
        //Inicializacion del arreglo
        enteros = new int[5];
        //Alternativa
        int [] numeros = new int[8];

        //Llenamos algunos indices del arreglo enteros
        enteros[0] = 13;
        enteros[4] = 445;

        //Llenamos algunos indices del arreglo numeros
        numeros[1] = 654;
        numeros[3] = 23;
        numeros[7] = 3234;

        System.out.println("Valor array enteros indice 0 -> " + enteros[0]);
        System.out.println("Valor array enteros indice 4 -> " + enteros[4]);
        
        System.out.println("Valor array numeros indice 1 -> " + numeros[1]);
        System.out.println("Valor array numeros indice 3 -> " + numeros[3]);
        System.out.println("Valor array numeros indice 7 -> " + numeros[7]);
    }
}
