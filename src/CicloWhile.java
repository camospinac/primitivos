public class CicloWhile {
    public static void main(String[] args) throws Exception{
        
        var contador = 0;
        while (contador < 5) {
            System.out.println("\nContador: " + contador);
            contador++;
        }

        var contador2 = 0;
        do {
            System.out.println("\nContador: " + contador2);
            contador2 += 1;
        } while (contador2 < 10);
    }
}
