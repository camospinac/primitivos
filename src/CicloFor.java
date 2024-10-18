public class CicloFor {
    public static void main(String[] args) throws Exception{
        
        for ( var cont = 1;  cont < 15 ; cont++){
            if (cont %2 == 0) {
                System.out.println("\nContador: " + cont);
                break;
            }
        }

        for ( var cont = 1;  cont < 15 ; cont++){
            if (cont %2 != 0) {
                continue;
            }
            System.out.println("\nContador: " + cont);
        }
    }
}
