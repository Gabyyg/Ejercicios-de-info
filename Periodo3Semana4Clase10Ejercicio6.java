import java.util.Scanner;
public class Main {
  static Scanner entrada = new Scanner(System.in);
  public static void main(String[] args) {
        
      int fact = 1 , num , cont = 1 ;
        System.out.println ( " Ingrese un número : " ) ;
        num = entrada.nextInt ( ) ;
        do {
            fact = fact * cont ;
            cont = cont + 1 ;
        } while ( cont <= num ) ;
        System.out.println ( " El factorial es : " + fact ) ;
    }
}
