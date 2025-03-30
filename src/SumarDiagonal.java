public class SumarDiagonal {

    public static void main(String[] args) {
        // Definimos longitud de la matriz
        int renglon, columna;
        int suma = 0;
        var consola = new java.util.Scanner(System.in);

        System.out.print("Por favor digite los valores de la matriz: (matriz cuadrada)\n");
        System.out.print("Digite la cantidad de renglones: ");
        renglon = Integer.parseInt(consola.nextLine());
        System.out.print("Ditige la cantidad de columnas: ");
        columna = Integer.parseInt(consola.nextLine());

        if (renglon == columna){
            int [][] matriz = new int[renglon][columna];
            
            for(var ren = 0; ren < renglon; ren++){
                for(var col = 0; col < columna; col++){
                    System.out.print("Digite el valor para ["+ren+"]["+col+"]: ");
                    matriz[ren][col] = Integer.parseInt(consola.nextLine());
                }
            }

            for(var ren = 0; ren < renglon; ren++){
                for(var col = 0; col < columna; col++){
                    if(ren == col){
                        System.out.print("Matriz diagonal ["+ren+"]["+col+"] = "+matriz[ren][col]);
                        suma = matriz[ren][col] + suma;
                    }
                }
            }
            System.out.println("\nLa suma de la diagonal es: " + suma);
        }
        else{
            System.out.println("La matriz no es cuadrada, por favor verifique los valores ingresados.");
        }
        }

}
