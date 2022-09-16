import java.util.Scanner;
public class Main {
  static Scanner entrada = new Scanner(System.in);
  public static void main(String[] args) {
        
        String quieroJugar = "si" ;
        while ( quieroJugar.equals ( "si" ) ) {
        System.out.println ( "¿Quieres seguir jugando?" ) ;
        quieroJugar = entrada.next ( ) ;
        }
    }
}  
