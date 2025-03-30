public class RecorrerMatriz {
    public static void main(String[] args) {
        final var renglon = 2;
        final var columna = 2;
        // Definicion matriz 2x3
        var matriz = new int[renglon][columna];
        matriz[0][0]= 200;
        matriz[0][1]= 300;
        matriz[1][0]= 400;
        matriz[1][1]= 600;

        //Recorrer la matriz
        //Recorrer renglones
        for(var ren = 0; ren < renglon; ren++){
            //Recorrer columnas
            for(var col = 0; col < columna; col++){
                System.out.println("Valor ["+ren+"]["+col+"] = "+matriz[ren][col]);
            }
        }

        var matriz2 = new int [][]{
            {5485,5436,231,6676},
            {456,2342,213,575}
        };

        for(var ren2 = 0; ren2 < matriz2.length; ren2++){
            for(var col2 = 0; col2 < matriz2[ren2].length; col2++){
                System.out.println("Valor ["+ren2+"]["+col2+"] = "+matriz2[ren2][col2]);
            }
        }

    }
    
}
