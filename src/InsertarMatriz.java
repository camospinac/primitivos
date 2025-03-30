public class InsertarMatriz {
    public static void main(String[] args) {
        int renglon, columna;
        var consola = new java.util.Scanner(System.in);
        System.out.print("Digite la cantidad de renglones: ");
        renglon = Integer.parseInt(consola.nextLine());
        System.out.print("Digite la cantidad de columnas: ");
        columna = Integer.parseInt(consola.nextLine());

        var matriz = new int[renglon][columna];

        for(var ren = 0; ren < renglon; ren++){
            for(var col = 0; col < columna; col++){
                System.out.print("Digite el valor para ["+ren+"]["+col+"]: ");
                matriz[ren][col] = Integer.parseInt(consola.nextLine());
            }
        }

        for(var ren = 0; ren < renglon; ren++){
            for(var col = 0; col < columna; col++){
                System.out.println("Matriz ["+ren+"]["+col+"] = "+matriz[ren][col]);
            }
        }
    }
}
